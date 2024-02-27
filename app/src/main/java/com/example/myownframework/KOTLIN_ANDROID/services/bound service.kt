package com.example.myownframework.Kotlin_Android.Services.AsyncTask

/*
Bound Service:
--------------
A service is bound when an application component binds to it by calling bindService().
A bound service offers a client-server interface that allows components to interact with the
service, send requests, receive results, and even do so across processes with interprocess
communication (IPC). A bound service runs only as long as another application component is
bound to it. Multiple components can bind to the service at once, but when all of them unbind,
the service is destroyed.
Although this documentation generally discusses started and bound services separately,
your service can work both ways—it can be started (to run indefinitely) and also allow binding.
It's simply a matter of whether you implement a couple of callback methods: onStartCommand()
to allow components to start it and onBind() to allow binding.

Regardless of whether your service is started, bound, or both, any application component can use
the service (even from a separate application) in the same way that any component can use an
activity—by starting it with an Intent. However, you can declare the service as private in the
manifest file and block access from other applications. This is discussed more in the section
about Declaring the service in the manifest.


*/
