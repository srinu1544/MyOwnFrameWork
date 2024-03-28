package com.example.myownframework.Kotlin_Android.Others

/*
Kapt, or Kotlin Annotation Processing Tool, is a command-line tool and build plugin for the Kotlin
programming language. It allows users to use Java annotation processors with Kotlin code,
even if the processors don't have specific support for Kotlin


Kapt works with build tools like Gradle and Maven to analyze annotated code and generate additional code.
It does this by generating Java stubs from Kotlin files that the processors can then read. Kapt compiles
 Kotlin code into Java stubs that retain information that Java annotation processors care about


To reference generated code from Kotlin, users need to use kapt. To do this, they can include the
plugin in their build.gradle file with the line:

apply plugin: 'kotlin-kapt'


*/