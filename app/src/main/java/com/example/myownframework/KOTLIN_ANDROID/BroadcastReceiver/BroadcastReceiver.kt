package com.example.myownframework.Kotlin_Android.BroadcastReceiver

/*In Android, a Broadcast Receiver is a component that allows your app to receive and respond to system-wide
broadcast messages, as well as messages from other apps or components within your own app. These broadcast
messages are typically used to announce events or state changes, and apps can register Broadcast Receivers to
listen for specific broadcasts and take action accordingly.

Here are some key points to understand about Broadcast Receivers in Android:

Broadcast Messages :
Broadcast messages are Intent objects that are sent by the system or other apps to notify events or changes in
the device's state. For example, when the device's battery level changes, when a new SMS is received, or when
the device boots up, broadcast messages are sent.

Registering a Broadcast Receiver:
To listen for specific broadcast messages, you need to register a Broadcast Receiver in your AndroidManifest.xml
file or dynamically within your app's code. When a matching broadcast message is sent, your receiver will be
notified.

Static Registration:
In your AndroidManifest.xml file, you can define a receiver element with an intent filter to specify which broadcasts your receiver should listen to.

<receiver android:name=".MyReceiver">
    <intent-filter>
        <action android:name="android.intent.action.BOOT_COMPLETED" />
        <action android:name="android.intent.action.BATTERY_LOW" />
    </intent-filter>
</receiver>


Dynamic Registration vs static Registration
-------------------------------------------

Runtime adaptability: Dynamic broadcast receivers allow your app to adapt to changing requirements
or conditions. For example, if you need to modify the behavior of your receiver based on user
preferences or runtime configurations, dynamic registration provides the flexibility to do so


You can also register a broadcast receiver dynamically, which ties its operation to the lifecycle
of your activity. To register your receiver dynamically, call registerReceiver() and pass in the
BroadcastReceiver object and an intent filter.
For example: IntentFilter
intentFilter = new IntentFilter(); intentFilter.

Static Broadcast Receivers: These types of Receivers are declared in the manifest file and works even if
the app is closed. Dynamic Broadcast Receivers: These types of receivers work only if the app is active
or minimized.


Dynamic Registration:
You can also register a Broadcast Receiver dynamically in your app's code using the registerReceiver() method.

BroadcastReceiver receiver = new MyReceiver();
IntentFilter filter = new IntentFilter("android.intent.action.BOOT_COMPLETED");
filter.addAction("android.intent.action.BATTERY_LOW");
registerReceiver(receiver, filter);

Handling Broadcasts: When a matching broadcast message is received, the onReceive() method of your BroadcastReceiver
is called. You need to implement this method to specify what action should be taken in response to the broadcast.

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            // Do something when the device boots up
        } else if (intent.getAction().equals("android.intent.action.BATTERY_LOW")) {
            // Do something when the battery level is low
        }
    }
}
Broadcast Permissions:
Some broadcasts require specific permissions to be received. You may need to request these permissions in your
app's manifest or dynamically at runtime.

Unregistering a Receiver :
It's essential to unregister your Broadcast Receiver when it's no longer needed to prevent memory leaks.
Use the unregisterReceiver() method to do this.

Broadcast Receivers are a powerful way to respond to events and changes in the Android system,
allowing your app to be more interactive and responsive to user and system actions. However,
they should be used carefully, as excessive use of broadcast receivers can impact app performance
and battery life.


 Types of broadcast Receiver :

In Android, broadcast receivers are components that allow your app to receive and respond to system-wide broadcast
messages or intents. There are two main types of broadcast receivers:

Static Broadcast Receivers:

Manifest-registered receivers:
These receivers are declared in the AndroidManifest.xml file and are registered
statically. They can listen to system-wide broadcasts and are useful for responding to broadcasts even when your
app is not running. Examples include BOOT_COMPLETED, PACKAGE_ADDED, and CONNECTIVITY_CHANGE.
Dynamic Broadcast Receivers:

Context-registered receivers:
These receivers are registered and unregistered dynamically at runtime using the Context.registerReceiver() method.
They are typically used when you need to receive broadcasts while your app is running and can be unregistered when
they are no longer needed. Dynamic receivers are more flexible but require more management.
In addition to these main types, there are also a few specialized broadcast receiver categories:

Ordered Broadcast Receivers:
These receivers are used to receive broadcasts in a specific order. They can modify the data in the broadcast
or even cancel it before it reaches other receivers in the chain. You can set the priority of an ordered receiver
to determine the order in which it receives broadcasts.

Local Broadcast Receivers:
These receivers are used to send and receive broadcasts within your app's process.
They are more efficient than system-wide broadcasts because they don't incur the overhead of inter-process communication. You can use the LocalBroadcastManager class to implement local broadcasts.

Sticky Broadcasts (deprecated):
Sticky broadcasts are deprecated as of Android 5.0 (API level 21) and should not be used in new applications.
They allowed a broadcast to be "sticky," meaning that it would be remembered and delivered to future registered
receivers even after the broadcast was sent. This behavior led to various issues, and alternatives like
SharedPreferences or ContentProvider should be used instead.

Broadcast receivers are a powerful way to receive and react to system events in your Android application,
but it's important to use them judiciously as they can impact your app's performance and responsiveness.
Additionally, be mindful of background processing and battery consumption when using broadcast receivers,
especially for long-running tasks.






 */

