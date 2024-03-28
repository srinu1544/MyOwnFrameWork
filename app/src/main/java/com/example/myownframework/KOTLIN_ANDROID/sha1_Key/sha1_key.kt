package com.example.myownframework.Kotlin_Android.Sha1_Key

/*



In Android development, an SHA-1 key (Secure Hash Algorithm 1) is a unique 40-character string
that acts as a digital fingerprint for your app's signing certificate. It serves crucial purposes
in identification, verification, and security:


Key Roles:

App Identification: The SHA-1 key uniquely identifies your app among others, ensuring correct
attribution and usage tracking.

Security: It safeguards app integrity by verifying that updates originate from the authorized
developer and haven't been tampered with.

Access to Google Services: Many Google services, like Maps, Analytics, and Sign-In, require
you to register your app's SHA-1 key to grant access and ensure authorized usage.

Third-Party Integrations: Certain third-party libraries and services may also request your
 app's SHA-1 key for verification and integration purposes.

Common Use Cases:

Google Play Services Integration: To use Google Maps, Analytics, or Sign-In, you'll need to
register your app's SHA-1 key in the Google Cloud Console.

Firebase Integration: Similarly, Firebase features like Authentication and Crashlytics
 require SHA-1 registration for security and access control.

Third-Party SDKs and APIs: Some third-party libraries and APIs may also leverage SHA-1
keys for authentication and authorization.



Procedure to create sha1 key in android studio
-----------------------------------------------
To generate SHA1 and SHA256 keys in Android Studio, you can do the following:


-> file
-> settings
-> Experimental
-> Right side confugure all task gradel sync (enable this)
-> click apply button
-> click ok button
-> now open file
-> sync project with gradel file
-> now open gradle in right side
-> Projectname -> tasks ->  android -> signinreports
-> now you can see sha1 key Run tab at the bottom of the window


Using Keytool (Command-Line):
-----------------------------

Open a terminal and navigate to your project's "android" directory.
Run the command: keytool -list -v -keystore <keystore_path> -alias <alias_name>
Replace <keystore_path> with the path to your keystore file.
Replace <alias_name> with the alias for your signing certificate.

Additional Notes:
------------------

If you're using Google Play App Signing, you can find your app's SHA-1 key in the Google
Play Console under "Release > Setup > App Integrity."
It's essential to keep your SHA-1 key confidential to maintain app security.
Different build variants (debug and release) may have different SHA-1 keys.


The SHA1 and SHA256 keys will be displayed in the Run tab at the bottom of the window
If you're using a newer version of Android Studio (4.2 or later), the signingReport task
may not be visible in the Run Gradle Task dialog box. To find it,
you can go to Tasks > Android > signingReport.
The SHA-1 fingerprint is a string of 40 hexadecimal digits,
usually in pairs separated by spaces or other non-alphanumeric delimiters.
Certain Google Play services (such as Google Sign-in and App Invites) require
you to provide the SHA-1 of your signing certificate */