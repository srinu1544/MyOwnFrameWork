package com.example.practiceapp.Kotlin_Android.services

/* Refer :
https://developer.android.com/guide/components/services

What is service and types of services ?
----------------------------------------
In the context of Android development, a service is a component of the Android operating system
that performs long-running operations in the background without a user interface. Services are
used to perform tasks that need to continue running even when the app is not in the foreground
or when the device is in a low-power state. There are several types of services in Android:

Foreground Service:
--------------------
A foreground service is a service that has a visible notification associated with it.
This notification informs the user that the service is running, and it's often used for
tasks that are considered important to the user, such as music playback or GPS tracking.
Foreground services have a higher priority and are less likely to be killed by the system.

android:fourgroundServicetype="phoneCall" // location, camera

Background Service:
-------------------
A background service is a service that runs in the background but doesn't have a visible
notification. Background services are used for tasks that are not immediately visible to
the user, such as syncing data or performing periodic checks.

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

started service :
-----------------------------
A started service is one that another component starts by calling startService(), which results in
a call to the service's onStartCommand() method.

When a service is started, it has a lifecycle that's independent of the component that started it.
The service can run in the background indefinitely, even if the component that started it is
destroyed. As such, the service should stop itself when its job is complete by calling stopSelf(),
or another component can stop it by calling stopService().

An application component such as an activity can start the service by calling startService()
and passing an Intent that specifies the service and includes any data for the service to use.
The service receives this Intent in the onStartCommand() method.

For instance, suppose an activity needs to save some data to an online database. The activity can
start a companion service and deliver it the data to save by passing an intent to startService().
The service receives the intent in onStartCommand(), connects to the Internet, and performs the
database transaction. When the transaction is complete, the service stops itself and is destroyed.


Intent Service (Deprecated in Android 10+):
-------------------------------------------
IntentService is a subclass of Service that handles asynchronous requests (Intents) one at a time
in a worker thread. It's often used for performing background tasks in response to Intents, and
it automatically stops itself when it has no more work to do.

JobScheduler (Android 5.0+):
----------------------------
JobScheduler is an API introduced in Android 5.0 (Lollipop) for scheduling background tasks that
require specific conditions, such as network connectivity or device charging. It's used to optimize
power consumption and network usage.

* minimum interval time of is 15 min

With the use of jobscheduler schedule a job when device met the specific condition
Like :
network connectivity
Device ideal
charging

WorkManager (Android Architecture Components):
----------------------------------------------
WorkManager is an Android library that schedules and runs background tasks. It's part of Android
Jetpack. WorkManager is used for tasks that need to run even if the app exits or the device restarts
Note : Minimum interval of workmanager is 15 min

WorkManager can run tasks:

When the app is not running
When the device is rebooted
When the user is outside the app
When the app is closed
One time only
Many times
Periodically

Link  : https://developer.android.com/courses/pathways/android-basics-compose-unit-7-pathway-1?hl=en


AIDL (Android Interface Definition Language):
---------------------------------------------
AIDL is used to create and communicate with services across different applications. It's
often used in situations where inter-process communication (IPC) is required.
These are some of the main types of services in Android, and each serves a specific purpose
in managing background tasks and providing functionality to Android applications. The choice
of which type of service to use depends on the requirements of your app and the nature of the
task you want to perform in the background.

*/
