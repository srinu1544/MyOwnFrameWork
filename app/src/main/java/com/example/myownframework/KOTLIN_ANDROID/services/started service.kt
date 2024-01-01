package com.example.myownframework.Kotlin_Android.services

/*started service :
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
database transaction. When the transaction is complete, the service stops itself and is destroyed.*/