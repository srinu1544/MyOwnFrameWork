package com.example.myownframework.Kotlin_Android.Others

/*

Refer : https://digital.ai/catalyst-blog/communicating-between-android-apps/

There are two ways for Android apps to interact:

Intents: Pass data from one application to another.
Services: One application provides functionality for others to use.

Here are some ways to communicate between two Android applications:

Have Application B expose a Service with an API defined in AIDL, and have Application A
bind to that service.
Send a broadcast Intent from Application A to Application B.
Use a ContentProvider.
Bind to a remote service in the other app.
Use Messenger and handler to communicate.
You can't directly access methods of Activity in different app*/