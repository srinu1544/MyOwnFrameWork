package com.example.myownframework.Kotlin_Android.Differences

/*Which method to use for registering your BroadcastReceiver depends on what your app does
with the system event. I think there are basically two reasons why your app wants to know
about system-wide events:

Your app offers some kind of service around these events

Your app wants to react graciously to state changes

Examples for the first category are apps that need to work as soon as the device is booted or
that must start some kind of work whenever an app is installed. Battery Widget Pro or App2SD
are good examples for these kinds of apps. For this type you must register the BroadcastReceiver
in the Manifest file.

Examples for the second category are events that signal a change to circumstances your app might
rely on. Say your app depends on an established Bluetooth connection. You have to react to a
state change – but only when your app is active. In this case there is no need for a statically
registered broadcast receiver. A dynamically registered one would be more reasonable.

There are also a few events that you are not even allowed to statically register for.
An example for this is the Intent.ACTION_TIME_TICK event which is broadcast every minute.
Which is a wise decision because a static receiver would unnecessarily drain the battery.

 */