package com.example.myownframework.Kotlin_Android.Differences

/*In Android, a thread is a stream of machine-code instructions that a processor executes.
A handle is a logical association with a shared resource, such as a file, memory location, or window.

A thread is a generic processing task that can do most things, but it cannot update the UI.
 A handler is a background thread that allows communication with the UI thread.

Here are some differences between threads and handlers:
Threads :
---------
A stream of sequential machine-code instructions that the processor executes
A unit of execution in a process
Use a thread if you want to keep the main thread free to do other things
Handlers :
----------
A background thread that allows communication with the UI thread
A component that can be attached to a thread
Works in conjunction with another component, Looper, which is in charge of message processing
in a particular thread
Each Handler can be associated with one single thread and that thread's message queue*/