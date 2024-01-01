package com.example.myownframework.Kotlin_Android.Intents

/*

https://www.youtube.com/watch?v=IWXYV1dC2FQ&t=322s&ab_channel=PhilippLackner


In Android development, an "intent" is a messaging object that is used to request an action
from another app component, such as an activity, service, or broadcast receiver. Intents are
a fundamental part of the Android system, facilitating communication between different parts
of an Android application or between different Android applications. They are typically used
to trigger activities, start services, or broadcast events.

There are two main types of intents in Android:

Explicit Intent:

An explicit intent specifies the target component (usually by its class name) to which the
message should be delivered. It is used to start a specific component within your own app
or another app, provided that you know the exact component you want to launch. For example,
you can use an explicit intent to start a specific activity within your app.

Implicit Intent:

An implicit intent does not specify the exact target component but instead describes the type
of action to be performed and may include data that describes what should be done. Android's
system then resolves the implicit intent and starts the appropriate component based on the
available registered components that can handle the action. Implicit intents are typically
used when you want to delegate a task to another app without specifying a particular app.
For example, you can use an implicit intent to request the system to open a web page,
send an email, or share content.

Intent filter :

Specifies the types of intents that an activity, service, or broadcast receiver can respond to.
An intent filter declares the capabilities of its parent component: what an activity or service
can do and what types of broadcasts a receiver can handle.

An "intent filter" is a component of an Android app's manifest file (AndroidManifest.xml) that
declares which types of intents the component is capable of handling. When an implicit intent
is sent, the Android system scans the intent filters of registered components to determine
which one is best suited to handle the intent.
The component with the best matching intent filter is then invoked.

For example, if you want to open a web URL using an implicit intent, you can specify the
action as "android.intent.action.VIEW" and provide the data (the URL) as part of the intent.
If multiple apps on the device have registered intent filters that can handle this action
and data, the user will be presented with a list of available apps to choose from
(e.g., web browsers).

Intent filters are crucial for making your app's components discoverable to other apps and
for enabling inter-app communication in Android. They define the actions, categories, and
data that your component can respond to, allowing other apps to interact with your app in
a standardized way.





*/