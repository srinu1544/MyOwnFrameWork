package com.example.myownframework.Kotlin_Android.Intents
/*
A PendingIntent in Android is a wrapper class that encapsulates a specific action to be taken in the
future. It is often used with features like notifications, alarms, and services to allow one
application to request a certain action to be performed by another application or component,
even if the requesting application's process is terminated or its user interface is not currently
active.

Here's how PendingIntent works:

Creation:
You create a PendingIntent by specifying an Intent that describes the action you want to
perform. This Intent can be for activities, services, or broadcast receivers.

Pending State:
The PendingIntent is not executed immediately when created. Instead, it remains in a
pending state until triggered.

Triggering:
You can trigger the PendingIntent to perform its specified action at a later time using various Android
components such as alarms, notifications, or widgets. For example, you can set a PendingIntent to be
triggered when a user clicks on a notification or at a specific time using the AlarmManager.

Security and Permissions:
PendingIntents can be used to delegate permissions and access.
The PendingIntent often carries with it the security context of the original application that created
it, ensuring that the action is executed with the appropriate permissions.

By using PendingIntent, you can enable safe and secure interaction between different parts of an Android
application or between different applications while maintaining control over permissions and security.

Here's a simple example of creating a PendingIntent for a notification:


// Create an explicit intent for an Activity in your app
Intent intent = new Intent(context, MyActivity.class);

// Create the PendingIntent
PendingIntent pendingIntent = PendingIntent.getActivity(context, requestCode, intent, flags);

// Set the PendingIntent in a notification
NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId)
        .setSmallIcon(R.drawable.notification_icon)
        .setContentTitle("My Notification")
        .setContentText("This is a sample notification")
        .setContentIntent(pendingIntent)
        .setAutoCancel(true);

// Show the notification
NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
notificationManager.notify(notificationId, builder.build());

In this example, the PendingIntent is created to open the MyActivity when the user clicks on the
notification. It's a way to defer the execution of this action until the user interacts with the
notification.*/
