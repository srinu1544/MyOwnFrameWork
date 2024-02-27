package com.example.myownframework.Kotlin_Android.Viewmodel

/*

view model :
--------------
-> viewmodel is a class that is designed to store and manage ui related data in a lifecycle
conscious way

-> ViewModel classes are used to store the data even the configuration changes like rotating screen

-> ViewModel is one of the most critical class of the Android Jetpack Architecture Component
 that support data for UI components

-> Its purpose is to hold and manage the UI-related data. Moreover, its main function is
to maintain the integrity and allows data to service during configuration changes
like screen rotations.


Any kind of configuration change in Android devices tends to recreate the whole activity of
the application. It means the data will be lost if it has been not saved and restored
properly from the activity which was destroyed. To avoid these issues, it is recommended
to store all UI data in the ViewModel instead of an activity


*/