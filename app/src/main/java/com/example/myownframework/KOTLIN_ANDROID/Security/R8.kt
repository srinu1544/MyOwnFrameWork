package com.example.myownframework.Kotlin_Android.Security

/*R8 is a tool in Android Studio that can shrink, secure, and optimize Android applications.
It works with Proguard rules to convert an app's code into optimized Dalvik code. R8 can:

Reduce application size
Make apps more secure
Provide name obfuscation
R8 iterates through an application and optimizes it by removing unused classes and methods.
It runs at compile time.
To configure code shrinking in Android, you can:
Set the minifyEnabled flag to true in your build.gradle file
Enable shrinkResources to remove unneeded resources
R8 is similar to Proguard, but there are some differences



R8 R8 and Proguard are both tools used in Android. Here's some information about the differences
between them:

Kotlin support: R8 has more Kotlin support than Proguard.
Processing time: R8 is faster than Proguard, which reduces build time.
Output results: R8 gives better output results than Proguard.
App size: R8 reduces the app size by 10%, while Proguard reduces it by 8.5%.
Inlining and outlining: R8 achieves better inlining and outlining than Proguard.
Propagating constant arguments: Proguard is better at propagating constant arguments.
Integration with Android Gradle Plugin: R8 is integrated with the Android Gradle plugin,
making it easier to use and configure.

R8 also performs optimization, which rewrites code to improve its performance and further
reduce its size */