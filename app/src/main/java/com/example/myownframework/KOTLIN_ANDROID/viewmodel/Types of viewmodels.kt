package com.example.myownframework.Kotlin_Android.Viewmodel

/*

In Android development, the term "ViewModel" typically refers to the architecture
 component ViewModel, which is part of the Android Jetpack library. However,
 there are other types of ViewModels that might be used in different contexts.
 Here, I'll outline the main types of ViewModels in Android development:

Android Jetpack ViewModel:
--------------------------
This is the most common type of ViewModel used in Android development.
 It's part of the Android Jetpack library and is designed to store and
 manage UI-related data in a lifecycle-conscious way. Jetpack ViewModel
 survives configuration changes such as screen rotations, ensuring that
 data is retained across configuration changes.

Custom ViewModels:
------------------
Sometimes, developers create custom ViewModel classes tailored to specific
requirements in their applications. These custom ViewModels may encapsulate
business logic, data manipulation, or any other functionality that is not directly
related to UI but supports the UI components.

Architecture-specific ViewModels:
-----------------------------------
Depending on the architecture pattern being used in an Android application
(e.g., MVVM - Model-View-ViewModel, MVP - Model-View-Presenter, etc.),
developers might create ViewModels tailored to fit the chosen architecture.
For instance, in MVVM, you would typically have ViewModel classes that interact
with the model and expose data to the View (UI) layer.

Unit Test ViewModels:
---------------------
In the context of unit testing, developers might create test-specific ViewModels to
isolate and test specific components of the application logic. These test ViewModels
are typically created to facilitate unit testing without relying on the actual
application ViewModel implementation.

Third-party or library-specific ViewModels:
-------------------------------------------
In addition to the standard Android Jetpack ViewModel, there might be other ViewModel
implementations provided by third-party libraries or frameworks that cater to specific
needs or architectural preferences.

like : Dagger ViewModel , hilt viewModel

While the Android Jetpack ViewModel is the most commonly used type, developers might
leverage other types of ViewModels depending on the requirements of their application
and the architectural patterns they follow.


*/