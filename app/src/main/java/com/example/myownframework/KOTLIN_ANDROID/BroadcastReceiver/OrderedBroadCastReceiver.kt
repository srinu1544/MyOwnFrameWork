package com.example.myownframework.Kotlin_Android.BroadcastReceiver

/*
https://www.sanfoundry.com/java-andorid-program-demonstrate-ordered-broadcast

In Android, an ordered broadcast receiver is a broadcast receiver that sends broadcasts
to each receiver in order. The order is determined by the android:priority attribute.

Ordered broadcasts are also known as synchronous broadcasts. The broadcast with the
highest priority executes first, and broadcasts with the same priority do not follow any order.

In ordered mode, a receiver can abort the broadcast so that receivers with a lower priority
do not receive it.
Broadcast receivers allow applications to receive intents that are broadcast by the system or
by other applications. They can register for system and application events, and when that event
happens, the registered receivers get notified.

There are two types of broadcast receivers:

Ordered broadcasts: Synchronous broadcasts that are done in proper order.
Normal broadcasts: Asynchronous and unordered broadcasts. These receivers run unordered or all at a time,
sometimes

*/