package com.example.myownframework.Kotlin_Android.Androidx

/*The androidx namespace comprises the Android Jetpack libraries. Like the Support Library,
libraries in the androidx namespace ship separately from the Android platform and provide
backward compatibility across Android releases.


AndroidX is a major improvement to the original Android Support Library, which is no longer maintained.
androidx packages fully replace the Support Library by providing feature parity and new libraries.


Need of AndroidX
AndroidX is a redesigned library to make package names more clear. So from now on android hierarchy will
be for only android default classes, which comes with android operating system and other
library/dependencies will be part of androidx (makes more sense). So from now on all the
new development will be updated in androidx.


com.android.support.** : androidx.
com.android.support:appcompat-v7 :
androidx.appcompat:appcompat com.android.support:recyclerview-v7 :
androidx.recyclerview:recyclerview com.android.support:design :
com.google.android.material:material


How to migrate current project
-------------------------------
In Android Studio 3.2 (September 2018), there is a direct option to migrate existing project to AndroidX.
 This refactor all packages automatically.


Before you migrate, it is strongly recommended to backup your project.

Existing project
-----------------
Android Studio > Refactor Menu > Migrate to AndroidX...
It will analyze and will open Refractor window in bottom. Accept changes to be done.


*/