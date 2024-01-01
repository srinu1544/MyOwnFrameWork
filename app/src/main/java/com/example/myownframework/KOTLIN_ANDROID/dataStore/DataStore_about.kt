package com.example.myownframework.Kotlin_Android.DataStore


/*DataStore is a data storage solution for Android that stores key-value pairs and typed objects.
 It's part of Android Jetpack and is ideal for small, simple datasets.

DataStore uses Kotlin coroutines and Flow to store data asynchronously, consistently,
and transactionally. It has two implementations:

Proto DataStore: Stores typed objects backed by protocol buffers
Preferences DataStore: Stores key-value pairs

DataStore is similar to shared preferences, but it uses Kotlin and coroutines and flow to
handle reading and writing operations on separate threads*/