package com.example.myownframework.Kotlin_Android.Differences

/* Difference bw service and thread :
A service is simply a component that can run in the background, even when the user is not interacting
with your application, so you should create a service only if that is what you need.

If you must perform work outside of your main thread, but only while the user is interacting with your
application, you should instead create a new thread in the context of another application component.
For example, if you want to play some music, but only while your activity is running, you might create
a thread in onCreate(), start running it in onStart(), and stop it in onStop(). Also consider using
thread pools and executors from the java.util.concurrent package or Kotlin coroutines instead of the
traditional Thread class. See the Threading on Android document for more information about moving
execution to background threads.

Remember that if you do use a service, it still runs in your application's main thread by default,
so you should still create a new thread within the service if it performs intensive or blocking
 operations.*/