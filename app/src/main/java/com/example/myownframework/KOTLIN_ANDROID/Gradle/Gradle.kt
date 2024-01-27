package com.example.myownframework.Kotlin_Android.Gradle

/*


https://www.youtube.com/watch?v=o0M4f5djJTQ&ab_channel=PhilippLackner


Gradle is a build automation tool for Android that automates the process
of building and publishing apps. It's based on Groovy and Kotlin, and
is flexible enough to build almost any type of software.

Gradle's features include:
--------------------------
Managing dependencies
Defining custom build logic
Customizing, configuring, and extending the build process
Creating multiple APK files for your app with different features using the same project
Reusing code and resources
Gradle also supports the automatic download of dependencies and many repositories,
including Maven and Ivy.

Gradle is based on the concepts of Apache Ant and Apache Maven, and
introduces a Groovy- and Kotlin-based domain-specific language. It
supports languages including Java, Kotlin, Groovy, Scala, C/C++, and JavaScript

Gradle is so called build automator it take all the project configurations that we
define in these gradle files and executes different tasks in the right order to
put every thing together to an executable app.





They are two types of gradles in android project

Gradle (Project)
Gradle (module app gradle)

Gradle(projet) :
----------------
It contains some kind of configuration about our project example compose version
use whole project contains some plugins like kotlin plugin


Gradle (Module app):
--------------------
This this we have android block which we just define specific configuration so
configuration specific to app here for example compile sdk , we define our package name



GradleW (Gradle wrapper ) :
----------------------------
 It is a binary file executable
 It kind of script that install specific version of Gradle that we specify
 and then actually run specific tasks so every thing gradle can really do considered a
 task .

 BuildTypes :
 ------------

 specify at which stage at which kind of whole development lifecycle


 source set :
 -----------

 we can create a source set based on product flowers
 app -> click new
 Directory


*/