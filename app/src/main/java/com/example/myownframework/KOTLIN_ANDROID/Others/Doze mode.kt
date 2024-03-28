package com.example.myownframework.Kotlin_Android.Others

/*

Android has two power-saving features that extend battery life for users by managing how apps
behave when a device isn't connected to a power source: Doze and App Standby. Doze reduces
battery consumption by deferring background CPU and network activity for apps when the device
is unused for long periods of time. App Standby defers background network activity for apps with
no recent user activity.

While the device is in Doze, apps' access to certain battery-intensive resources is deferred
until the maintenance window. The specific restrictions are listed in Power management restrictions.

Doze and App Standby manage the behavior of all apps running on Android 6.0 or higher,
regardless of whether they are specifically targeting API level 23. To help ensure the
best experience for users, test your app in Doze and App Standby modes and make any necessary
adjustments to your code. The following sections provide details.


Understand Doze
----------------

If a user leaves a device unplugged and stationary for a period of time, with the screen off,
the device enters Doze mode. In Doze mode, the system attempts to conserve battery by restricting
apps' access to network and CPU-intensive services. It also prevents apps from accessing the
network and defers their jobs, syncs, and standard alarms.

Periodically, the system exits Doze for a brief time to let apps complete their deferred activities.
During this maintenance window, the system runs all pending syncs, jobs, and alarms, and lets apps
access the network.

please refer : https://developer.android.com/training/monitoring-device-state/doze-standby

*/