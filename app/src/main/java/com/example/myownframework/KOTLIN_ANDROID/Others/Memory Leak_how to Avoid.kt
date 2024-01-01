package com.example.myownframework.Kotlin_Android.Others


/* please refer :

https://medium.com/android-news/9-ways-to-avoid-memory-leaks-in-android-b6d81648e35e

*/

/*what is memory leak

A memory leak in Android (or any programming environment) occurs when an application
allocates memory for objects but fails to release that memory when it is no longer needed.

Over time, this can lead to an accumulation of unused memory, causing the app to consume more and more resources,
slow down, or even crash.


Here are some ways to avoid memory leaks in Android:
Use common architectures for Android projects, such as Clean, ViewModel, or UseCase Architectures.
Take care of context.
Use applicationContext() instead of activity context when possible.
Never use static variables to declare views or activity context.
Check where and when you use different contexts.
Never use the Context as static.
You can detect memory leaks in Android apps using the Memory Profiler in Android Studio. The Memory Profiler shows a realtime graph of your app's memory use and lets you:
Capture a heap dump
Force garbage collections
Track memory allocations



*/