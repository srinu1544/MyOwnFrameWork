package com.example.myownframework.Kotlin_Android.CICD_pipeline

/*https://www.youtube.com/watch?v=uBXzaaOHVzY&ab_channel=NativeMobileBits

-> artifact

About CI/CD
In modern software development, continuous integration and continuous development
(CI/CD) is pivotal. It automates tasks like software building, testing, and deploying,
ensuring rapid and consistent releases. By dividing work into smaller parts and
automating workflows, CI/CD reduces errors, accelerates development, and maintains
software readiness. In today’s tech landscape, CI/CD is a fundamental requirement
for staying agile, responsive, and competitive.

Continuous Integration (CI): Developers frequently push code changes to a version
control system like Git. CI tools (e.g., Jenkins, GitLab) automatically build and
test the app when changes are pushed, ensuring code quality and early bug detection.
Continuous Deployment (CD): CD tools automate app deployment to different environments
(e.g., testing, production). This ensures consistent and reliable releases.

This article explores the essential setup modules in MEGA Company’s CI/CD setup.

Requirements for MEGA’s Android CI/CD
No previous CI/CD: The MEGA Android team had no prior CI/CD system, resulting in manual
release generation on developer desktops. This led to tracking issues, testing difficulties,
and a lack of unit tests and lint checks, making it prone to errors.

Complex app: The MEGA Android app is a substantial application with diverse features,
including cloud storage, media consumption, and meeting functionalities, which requires
a robust CI/CD setup.

GitLab integration: As MEGA uses GitLab as its internal version control system,
it was crucial for the CI/CD tools to seamlessly integrate with GitLab.
For consistency with existing CI/CD systems, we’ve chosen Jenkins as our CI/CD tool,
although there are other popular options like Travis CI, GitHub Actions, GitLab CI/CD,
and Bitrise.

Long term goal: Our team’s long term goal is trunk based development process,
so the CI/CD system needs to aim to prepare for it, providing fast, stable and
comprehensive feedback in the development process.

Addressing these challenges, a customised CI/CD solution was developed to improve
productivity, code stability, and overall system security.

Solution Overview
Considering all the specific requirements, the CI/CD system flow is as in the diagram below.

CI/CD system flow
Continuous integration (CI)
Automatically triggered: CI tasks are initiated automatically when there is a push to a merge request. These tasks encompass building the project, conducting unit tests, and performing lint checks.
Real-time feedback: The results of these checks, including build warnings, unit test coverage, and lint check outcomes, are collected and reported to the merge request in real time, ensuring that developers receive fast feedback.
Manual triggering: Developers also have the flexibility to manually trigger CI builds by issuing a specific command in the merge request.
Continuous delivery (QA)
Seamless testing: Upon the approval and merging of a merge request into the main development branch, a CD build is automatically initiated.
APK distribution: Upon successful build completion, an APK is uploaded to Firebase AppDistribution, providing QA testers with easy access to the latest builds for testing.
Custom builds: A manual MR command option is available, enabling developers to send custom builds to QA for specific verifications.
Continuous deployment (release)
Manual release: Developers can send an MR command to manually trigger the release build process.
End-to-end deployment: The release build creates both AAB and APK packages, signs them with production keys, and uploads the AAB to Google Play’s alpha track. Additionally, it uploads build artefacts to the company’s file server in JFrog Artifactory, for archive purposes.
Reporting
Comprehensive feedback: Whether a build is successful or encounters issues, detailed reports of CI, CD testing and CD release are delivered back to the associated merge request and Slack.
- The CI report includes warnings, unit test coverage and lint summary.
- The CD testing report includes the version of the new build.
- The CD release report includes the version, as well as the download link to the archive in Artifactory.
Jenkins logs: In the event of a failed build, Jenkins build log files are uploaded to the merge request and shared in the Slack channel, ensuring developers are informed even if they don’t have direct access to the CI/CD Jenkins system.
The Android CI/CD pipeline setup
Now let’s see how these pipelines are set up. Before we dive into the specifics of different pipelines, we need to go over some common setups.

Add credentials in Jenkins > manage Jenkins > credentials
- GitLab access token: Retrieve this token from “GitLab > personal profile > access tokens”. It enables Jenkins to access the Android project’s source code.
- Slack access token: Obtain this token during the Slack integration setup. It’s used for sending messages and attachments to the Slack channel.
- Gitlab webhook secret: Create a robust password and save it in your credentials. This password is essential for Jenkins to authenticate webhooks and should be configured both in GitLab webhook settings and Jenkins GitLab plugin settings. Make sure to store it securely in your password manager app for future reference when creating new webhooks.
- GitLab user credential: Provide the username and personal access token for fetching the Android project’s code.
- JFrog Artifactory credential: Add the JFrog Artifactory username and personal access token for uploading files, such as release builds, to the company’s Artifactory server, the primary internal file server for archiving files.
- APK & AAB signing key files and passwords: Add the keystore file and its password, necessary for signing APK and AAB files for production release.
- Firebase credential file: Obtain the JSON format credential file required for uploading internal testing APKs to Firebase AppDistribution by following this documentation.
Install and configure Jenkins Plugins, following the plugin documents:
- GitLab plugin
- GitLab branch source plugin
- Slack notification plugin
Continuous Integration (CI) setup
Go to the Android project in GitLab > settings > webhooks.
2. Create a GitLab webhook that can be triggered by git push, MR comment or MR events. This ensures CI build can always be triggered.


3. Create and configure Jenkins job

3.1 Create a job with type “Multibranch Pipeline”. This type of job can scan multiple branches of the given repository and manage sub-build tasks for each ongoing MR. The sub-build tasks are deleted automatically when branch is closed (i.e. MR is merged).

3.2 Specify which branch the build should be based on.


3.3 Set the special command that can manually trigger the build. With this setting, developers can trigger a CI build by adding a comment jenkins rebuild in MR.


3.4 Specify the path of the build script. When Jenkins job is triggered, Jenkins clones the source code, looking for the file of Script Path and executing the steps in that file.


4. Implement the actual Jenkins pipeline script

4.1 Create file jenkinsfile/android_build_status.groovy under Android project root.

4.2 The build script follows the structured outline below. To enhance clarity, intricate details are collapsed to keep the focus sharp. Also, we’ve provided simplified key snippets download below, while the comprehensive script can be accessed on our GitHub repository.


4.3 In stage “Build APK (GMS+QA)”, we do the build validation for DEBUG build and QA build and detect build failures.

sh "./gradlew app:assembleGmsDebug 2>&1  | tee ${GMS_APK_BUILD_LOG}"
sh "./gradlew app:assembleGmsQa 2>&1  | tee ${QA_APK_BUILD_LOG}"

sh """
    if grep -q -m 1 \"^FAILURE: \" ${GMS_APK_BUILD_LOG}; then
        echo GMS APK build failed. Exitting....
        exit 1
    fi
    if grep -q -m 1 \"^FAILURE: \" ${QA_APK_BUILD_LOG}; then
        echo QA APK build failed. Exitting....
        exit 1
    fi
"""
4.4 In stage “Unit Test and Code Coverage”, we run test cases and collect coverage for each feature module.

sh "./gradlew domain:jacocoTestReport"
sh "./gradlew data:testGmsDebugUnitTestCoverage"
sh "./gradlew app:createUnitTestCoverageReport"
sh "./gradlew feature:devicecenter:testDebugUnitTest"
sh "./gradlew feature:sync:testDebugUnitTest"
sh "./gradlew core-ui:testDebugUnitTest"
4.5 In stage “Lint Check”, we run Lint check and collect Lint summaries.

sh "./gradlew lint"
Continuous Delivery (QA) setup
Create a GitLab webhook. This hook can be triggered by push to develop branch or a comment in MR. Note the last part of the URL (Android-Upload in the screenshot) must be the name of Jenkins job.

2. Create and configure the Jenkins job

2.1 Create a job with the type “Freestyle project”.

2.2 Set the Build Triggers to accept push events and deliver_qa command in MR.


2.3 Set Pipeline settings. Set pipeline definition to Pipeline script from SCM so Jenkins executes the build steps from a Jenkins file in SCM. The script file is at jenkinsfile/android_upload.groovy . The branch is decided by the variable gitlabSourceBranch in the payload of webhook sent from MR.



3. Implement the CD (testing) script.

3.1 Create a file jenkinsfile/android_upload.groovy under Android project root.

3.2 The build script has the structure below. Details are collapsed for easier understanding. The full version of the script can be found here on GitHub.


3.3 In stage “Build APK(GMS)”, build release APK.

script {
    BUILD_STEP = 'Build APK (GMS)'
    sh './gradlew app:assembleGmsRelease'
}
3.4 In stage “Sign APK(GMS)”, sign the APK.


withCredentials([
        file(credentialsId: 'ANDROID_PRD_GMS_APK_PASSWORD_FILE', variable: 'ANDROID_PRD_GMS_APK_PASSWORD_FILE'),
        file(credentialsId: 'ANDROID_PRD_GMS_APK_KEYSTORE', variable: 'ANDROID_PRD_GMS_APK_KEYSTORE')
]) {
    script {
        sh """
                cd app/build/outputs/apk/gms/release
                zipalign -v -p 4 app-*-unsigned.apk app-gms-release-unsigned-aligned.apk
                apksigner sign --ks "${ANDROID_PRD_GMS_APK_KEYSTORE}" --ks-pass file:"${ANDROID_PRD_GMS_APK_PASSWORD_FILE}" --out app-gms-release-signed.apk app-gms-release-unsigned-aligned.apk
                rm -fv *unsigned*.apk
            """
    }
}
3.5 In stage “Upload APK(GMS) to Firebase”, call Gradle command to upload the APK to Firebase AppDistribution.

withCredentials([
        file(credentialsId: 'android_firebase_credentials', variable: 'FIREBASE_CONFIG')
]) {
    script {
        withEnv([
                "GOOGLE_APPLICATION_CREDENTIALS=$FIREBASE_CONFIG",
                "RELEASE_NOTES_FOR_CD=${readReleaseNotes()}"
        ]) {
            sh './gradlew appDistributionUploadGmsRelease'
        }
    }
}
Continuous Deploy (release) setup
Create a GitLab hook that only responds to MR comments. We didn’t enable the push events because we always want to manually start the process of uploading a version to Google Play. Note the last part of the URL (Android-Release in screenshot) must be the name of Jenkins job.

2. Create and configure Jenkins job

2.1 Create a job with type “Freestyle project”.

2.2 Set the Build Triggers by deliver_appStore command in MR.


2.3 Set Pipeline settings. Set pipeline definition to Pipeline script from SCM so Jenkins executes the build steps from a Jenkins file in SCM. The script file is at jenkinsfile/android_release.groovy. The branch is decided by the variable gitlabSourceBranch in the payload of the webhook sent from MR.



3. Implement the CD (release) script.

3.1 Create file jenkinsfile/android_release.groovy under Android project root.

3.2 The build script has the structure below. The full version of the script can be found here on GitHub.


3.3 In stage “Build GMS APK”, build release version of APK.

sh './gradlew clean app:assembleGmsRelease'
3.4 In stage “Sign GMS APK”, call apksigner to sign the APK with production certificate.

withCredentials([
        file(credentialsId: 'ANDROID_PRD_GMS_APK_PASSWORD_FILE', variable: 'ANDROID_PRD_GMS_APK_PASSWORD_FILE'),
        file(credentialsId: 'ANDROID_PRD_GMS_APK_KEYSTORE', variable: 'ANDROID_PRD_GMS_APK_KEYSTORE')
]) {
    script {
        println("signing GMS APK")
        String tempAlignedGmsApk = "unsigned_gms_apk_aligned.apk"
        String gmsApkInput = "${WORKSPACE}/app/build/outputs/apk/gms/release/app-gms-release-unsigned.apk"
        String gmsApkOutput = "${WORKSPACE}/${ARCHIVE_FOLDER}/${common.readAppVersion2()}-gms-release.apk"
        println("input = $gmsApkInput \noutput = $gmsApkOutput")
        sh """
            rm -fv ${tempAlignedGmsApk}
            zipalign -p 4 ${gmsApkInput} ${tempAlignedGmsApk}
            apksigner sign --ks "${ANDROID_PRD_GMS_APK_KEYSTORE}" --ks-pass file:"${ANDROID_PRD_GMS_APK_PASSWORD_FILE}" --out ${gmsApkOutput} ${tempAlignedGmsApk}
            rm -fv ${tempAlignedGmsApk}
        """
        println("Finish signing APK. ($gmsApkOutput) generated!")
    }
}
3.5 In stage “Build GMS AAB”, create a release version of app bundle.

sh './gradlew clean app:bundleGmsRelease'
3.6 In stage “Sign GMS AAB”, sign the app bundle file with production certificate.

withCredentials([
        string(credentialsId: 'ANDROID_PRD_GMS_AAB_PASSWORD', variable: 'ANDROID_PRD_GMS_AAB_PASSWORD'),
        file(credentialsId: 'ANDROID_PRD_GMS_AAB_KEYSTORE', variable: 'ANDROID_PRD_GMS_AAB_KEYSTORE')
]) {
    script {
        String gmsAabInput = "${WORKSPACE}/app/build/outputs/bundle/gmsRelease/app-gms-release.aab"
        String gmsAabOutput = "${WORKSPACE}/${ARCHIVE_FOLDER}/${common.readAppVersion2()}-gms-release.aab"
        withEnv([
                "GMS_AAB_INPUT=${gmsAabInput}",
                "GMS_AAB_OUTPUT=${gmsAabOutput}"
        ]) {
            sh('jarsigner -keystore ${ANDROID_PRD_GMS_AAB_KEYSTORE} -storepass "${ANDROID_PRD_GMS_AAB_PASSWORD}" -signedjar ${GMS_AAB_OUTPUT} ${GMS_AAB_INPUT} ${KEY_ALIAS}')
        }
        println("Finish signing GMS AAB. ($gmsAabOutput) generated!")
    }
}
3.7 In stage “Archive files”, archive APK and AAB files to JFrog Artifactory file server.

withCredentials([
        string(credentialsId: 'ARTIFACTORY_USER', variable: 'ARTIFACTORY_USER'),
        string(credentialsId: 'ARTIFACTORY_ACCESS_TOKEN', variable: 'ARTIFACTORY_ACCESS_TOKEN')
]) {

    String targetPath = "${env.ARTIFACTORY_BASE_URL}/artifactory/android-mega/release/${common.artifactoryUploadPath()}/"

    withEnv([
            "TARGET_PATH=${targetPath}"
    ]) {
        common.createBriefBuildInfoFile()

        sh '''
            cd ${WORKSPACE}/archive
            ls -l ${WORKSPACE}/archive

            echo Uploading APK files
            for FILE in *.apk; do
                curl -u${ARTIFACTORY_USER}:${ARTIFACTORY_ACCESS_TOKEN} -T ${FILE} \"${TARGET_PATH}\"
            done

            echo Uploading AAB files
            for FILE in *.aab; do
                curl -u${ARTIFACTORY_USER}:${ARTIFACTORY_ACCESS_TOKEN} -T ${FILE} \"${TARGET_PATH}\"
            done

            echo Uploading documentation
            for FILE in *.txt; do
                curl -u${ARTIFACTORY_USER}:${ARTIFACTORY_ACCESS_TOKEN} -T ${FILE} \"${TARGET_PATH}\"
            done
        '''
    }
}
3.8 In stage “Deploy to Google Play Alpha”, publish the app bundle to Google Play Alpha channel. The release is set to Draft status by setting rolloutPercentage to 0.

script {
    // Get the formatted release notes
    String release_notes = common.releaseNotes(RELEASE_NOTES)

    // Upload the AAB to Google Play
    androidApkUpload googleCredentialsId: 'GOOGLE_PLAY_SERVICE_ACCOUNT_CREDENTIAL',
            filesPattern: 'archive/*-gms-release.aab',
            trackName: 'alpha',
            rolloutPercentage: '0',
            nativeDebugSymbolFilesPattern: "archive/${NATIVE_SYMBOLS_FILE}",
            recentChangeList: common.getRecentChangeList(release_notes),
            releaseName: common.readAppVersion1()
}
CI/CD results reporting
Efficient communication is vital in our CI/CD pipeline. We should swiftly deliver results to developers for seamless progression. In case of CI or CD errors, immediate insights are provided for rapid resolutions. As not all developers have direct CI/CD server access, we’ve included log files in reports. CI builds also deliver essential data like build warnings, test coverage, and lint reports, supporting developer awareness and decisions.

Sending report to MR
Developers always expect to get quick feedback after pushing any code changes in the MR, so CI/CD results are always sent to the comment in MR. The below code sends a text message to the comment of MR where the build is triggered.

Note:

The GitLab server address is saved in the environment variable GITLAB_BASE_URL , and you should replace the project ID 199 with your own one.
Note that GitLab supports Markdown and some HTML tags in MR comment, so CI/CD script can polish the format of report by using the tags.
withCredentials([usernamePassword(credentialsId: 'Gitlab-Access-Token', usernameVariable: 'USERNAME', passwordVariable: 'TOKEN')]) {
    env.MARKDOWN_LINK = message
    env.MERGE_REQUEST_URL = "${env.GITLAB_BASE_URL}/api/v4/projects/199/merge_requests/${mrNumber}/notes"
    sh 'curl --request POST --header PRIVATE-TOKEN:$TOKEN --form body=\"${MARKDOWN_LINK}\" ${MERGE_REQUEST_URL}'
}
The below method is used to upload a file to GitLab, then the returned link can be embedded in the report, so the developer can download the file from MR.

String uploadFileToGitLab(String fileName) {
    String link = ""
    withCredentials([usernamePassword(credentialsId: 'Gitlab-Access-Token', usernameVariable: 'USERNAME', passwordVariable: 'TOKEN')]) {
        final String response = sh(script: "curl -s --request POST --header PRIVATE-TOKEN:$TOKEN --form file=@${fileName} ${env.GITLAB_BASE_URL}/api/v4/projects/199/uploads", returnStdout: true).trim()
        link = new groovy.json.JsonSlurperClassic().parseText(response).markdown
        return link
    }
    return link
}
Example report of a successful CI build.


Example report of a failed CI build.


Example report of a successful CD (testing) build.


Example report of a successful CD (release) build.


Sending reports to Slack
In addition to reporting to GitLab MR, build reports are also sent to a Slack channel, to let the team be aware of the CI/CD results.

The below code can send an error message and a log file to the Slack channel.

slackSend color: "danger", message: comment
sh "curl -u $CREDENTIALS ${BUILD_URL}/consoleText -o console.txt"
slackUploadFile filePath: "console.txt", initialComment: "Android Build Log"
Collecting code analysis for CI builds
In the CI build report, we also collect build warnings, test coverage, and lint report. Here is how we achieve that:

Build warning: In the Android build log, all warnings start with w: , so we save the build log and search all warnings.
Test coverage: We rely on the JaCoCo tool to generate the test coverage into a .csv file under the path build/reports/jacoco/ of each module. A Python script is used to parse the .csv and calculate the coverage data.
Lint report: A lint report is generated in build/reports/lint-results.xml of each module. We also use a Python script to parse these XML files and calculate the summary of Lint issues.
CI/CD build time optimisations
We always pursue shorter CI/CD build time to get faster feedback loops, less wait time, and of course higher productivity. There were some optimisations we have addressed and implemented, which shortened the CI/CD build time significantly.

Use parallel stages
CI pipeline runs 3 types of tasks: build, run test, and lint check. These 3 tasks used to run sequentially one after another, but they don’t have dependencies on each other, so we utilised the Jenkins parallel stage to execute them in separate executors in parallel.

Enable Gradle cache
Gradle cache is a great mechanism to optimise Android builds. Build outputs of unchanged source code are cached, then the next build in CI/CD can skip the unchanged module by reusing the build cache. Gradle cache can benefit not only CI/CD build, but also developer’s desktop build.

In our implementation, Gradle cache files are saved in JFrog Artifactory, which has fast access to our CI/CD servers.

Parallel test execution
Given our unit test cases don’t have inter-dependencies, we have enabled parallel test execution. By fully utilising the computation power of multi CPU cores, multiple different test files can be executed in parallel.

Future development and scaling
Our CI/CD system has performed quite well since it was set up, but still, we strive to keep improving all aspects to make it faster, more robust, and easier to maintain. Here are some potential improvements we consider to apply in the future.

Reduce Android build time
To optimise our Android build time, we continuously explore new tools and methods as our codebase grows. One potential improvement is to use the grand new Kotlin K2 compiler once it’s stable.

Move some CI/CD logic to Gradle’s buildSrc
We’re considering a shift in our CI/CD strategy by moving existing logic to Gradle’s buildSrc . Currently, our CI/CD processes are implemented in Groovy language due to Jenkins Pipeline requirements. However, Groovy lacks robust support in Android Studio, making development and debugging less enjoyable for Android developers. buildSrc offers a compelling alternative, harnessing the power of Kotlin, which aligns better with the Android ecosystem and enjoys superior Android Studio support. This transition would also allow us to replace specialised Python scripts with Kotlin, simplifying our development toolchain.

Dockerise Jenkins servers
We’re exploring the possibility of migrating our CI/CD infrastructure from Jenkins to Docker. Currently, our Jenkins agents reside on physical servers, demanding a fresh toolchain installation for each new agent added to the cluster. This maintenance approach is error-prone and cumbersome. By transitioning to Docker, we can streamline the management of our build environments. Docker offers a more efficient and consistent way to configure and maintain our toolsets and dependencies across all instances of Jenkins agents.

Conclusion
We have now introduced the integral components of our Android CI/CD system here at MEGA. We hope this serves as a practical example for others navigating similar infrastructure challenges in the Android development landscape. We will never stop further enhancing our CI/CD systems to ensure better speed and reliability. If you want to check further details, our CI/CD scripts are publicly sourced alongside MEGA’s Android code on GitHub. Feel free to explore and adapt these resources to your own CI/CD journey. Thank you.




* */