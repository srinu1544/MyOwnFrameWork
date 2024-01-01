package com.example.myownframework.Kotlin_Android.Others

/*

 please refer :
 https://developer.android.com/build/multidex#kts

64 k method , And if minimum sdk 21 and above it will enable by default

If your app has a minSdk of API 20 or lower and your app and the libraries it references exceed
65,536 methods, you encounter the following build error that indicates your app has reached the
limit of the Android build architecture:


trouble writing output:
Too many field references: 131000; max is 65536.
You may try using --multi-dex option.

Older versions of the build system report a different error, which is an indication of the same
problem:


Conversion to Dalvik format failed:
Unable to execute dex: method ID not in [0, 0xffff]: 65536
These error conditions display a common number: 65536. This number represents the total
number of references that can be invoked by the code within a single Dalvik Executable
(DEX) bytecode file. This page explains how to move past this limitation by enabling
an app configuration known as multidex, which allows your app to build and read multiple DEX files.

About the 64K reference limit
Android app (APK) files contain executable bytecode files in the form of Dalvik Executable
(DEX) files, which contain the compiled code used to run your app. The Dalvik Executable
specification limits the total number of methods that can be referenced within a single
DEX file to 65,536—including Android framework methods, library methods, and methods
in your own code.

In the context of computer science, the term kilo, or K, denotes 1024 (or 2^10). Because 65,536
is equal to 64x1024, this limit is referred to as the _64K reference limit_.

Multidex support prior to Android 5.0
Versions of the platform prior to Android 5.0 (API level 21) use the Dalvik runtime for executing
app code. By default, Dalvik limits apps to a single classes.dex bytecode file per APK. To get
around this limitation, add the multidex library to the module-level build.gradle or
build.gradle.kts file:


 */