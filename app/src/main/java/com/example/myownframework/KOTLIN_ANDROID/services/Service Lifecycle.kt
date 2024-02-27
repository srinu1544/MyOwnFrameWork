package com.example.myownframework.Kotlin_Android.Services

/*The lifecycle of a service is much simpler than that of an activity. However,
it's even more important that you pay close attention to how your service is created
and destroyed because a service can run in the background without the user being aware.

The service lifecycle—from when it's created to when it's destroyed—can follow either of these two paths:

A started service :
-------------------
The service is created when another component calls startService(). The service then runs indefinitely
and must stop itself by calling stopSelf(). Another component can also stop the service by calling
stopService(). When the service is stopped, the system destroys it.

onCreate()
OnStartCommand()
onDestroy()

A bound service :
----------------
The service is created when another component (a client) calls bindService().
The client then communicates with the service through an IBinder interface. T
he client can close the connection by calling unbindService(). Multiple clients can
bind to the same service and when all of them unbind, the system destroys the service.
The service does not need to stop itself.

onCreate()
onBind()
onUnbind()
onDestroy()

These two paths aren't entirely separate. You can bind to a service that is already started with
startService(). For example, you can start a background music service by calling startService()
with an Intent that identifies the music to play. Later, possibly when the user wants to exercise
some control over the player or get information about the current song, an activity can bind to the
service by calling bindService(). In cases such as this, stopService() or stopSelf() doesn't actually
stop the service until all of the clients unbind




*/