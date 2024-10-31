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
----------------
Android Studio > Refactor Menu > Migrate to AndroidX...
It will analyze and will open Refractor window in bottom. Accept changes to be done.



What is AndroidX?
AndroidX is a major improvement to the original Android Support Library, which is used to provide backward compatibility and new features across different Android API levels. AndroidX is a part of Jetpack, which is a suite of libraries to help developers write high-quality apps easier and more consistently across Android versions.

Key features of AndroidX:

Backward Compatibility: Provides support for older Android versions while introducing new features and APIs for newer ones.
Consistent Updates: AndroidX libraries are updated separately from the Android platform, which means faster releases of bug fixes and new features.
Package Refactoring: AndroidX packages follow a consistent naming convention, starting with androidx. (e.g., androidx.appcompat), instead of the previous android.support package names.
Decoupling from Platform Updates: AndroidX is not tied to the Android platform, so you can use new versions of the libraries without needing a new version of Android.
Jetpack Integration: AndroidX is tightly integrated with Android Jetpack libraries, making development more modular and efficient.
AndroidX Interview Questions
What is AndroidX and why was it introduced?

Answer: AndroidX is an extension of the Support Library with improved modularity, decoupling from the platform, and enhanced backward compatibility. It was introduced to ensure better and more consistent library updates, easier library naming, and improved functionality through Jetpack.
How do you migrate an existing project to AndroidX?

Answer: Android Studio provides an automated refactoring tool to migrate a project to AndroidX. You can do this by navigating to Refactor > Migrate to AndroidX.... This will refactor the old android.support libraries to the new androidx packages.
What is the difference between the Android Support Library and AndroidX?

Answer: The Android Support Library used android.support package names and was updated less frequently. AndroidX, on the other hand, uses a new consistent naming convention (androidx.) and is part of Android Jetpack, allowing it to be updated more frequently, independently of the Android OS.
What are the key benefits of using AndroidX?

Answer: Key benefits include faster library updates, improved backward compatibility, integration with Jetpack, modularization, and a consistent API surface across different versions of Android.
Can you continue to use the Android Support Library in new projects?

Answer: No, the Android Support Library is deprecated, and new projects should use AndroidX. Future development will be focused on AndroidX, so developers are encouraged to migrate existing projects to AndroidX as well.
Explain the purpose of the androidx.appcompat library.

Answer: The androidx.appcompat library is a part of AndroidX and provides backward-compatible versions of many Android UI components, including AppCompatActivity, Toolbar, and support for Material Design components.
What are the Jetpack libraries and how are they related to AndroidX?

Answer: Jetpack is a collection of libraries that help developers follow best practices, reduce boilerplate code, and simplify complex tasks. All Jetpack libraries are a part of AndroidX, making them modular, consistent, and frequently updated.
What is the purpose of androidx.lifecycle?

Answer: The androidx.lifecycle package provides classes and interfaces to help manage Android lifecycle-aware components, such as ViewModel, LiveData, and LifecycleOwner. These components help handle configuration changes, memory leaks, and lifecycle-related events efficiently.
Can you explain what androidx.fragment.app.Fragment is? How is it different from the previous Fragment class?

Answer: androidx.fragment.app.Fragment is the AndroidX version of the Fragment class. It improves upon the older android.app.Fragment class by providing backward compatibility and new features like FragmentFactory, improved Fragment lifecycle management, and better integration with ViewModels and LiveData.
What is the purpose of the androidx.work library?

Answer: The androidx.work library is a part of Jetpack and provides a powerful API for scheduling deferrable, asynchronous tasks. It handles constraints like network availability, battery level, and storage space, ensuring tasks are executed under optimal conditions.
Would you like to dive deeper into any of these topics or discuss any particular areas of AndroidX?


*/