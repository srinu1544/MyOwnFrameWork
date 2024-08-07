package com.example.myownframework.Kotlin_Android.AboutAndroid

/*
please refer :
https://developer.android.com/topic/architecture


Mobile app user experiences :

A typical Android app contains multiple app components, including activities, fragments,
 services, content providers, and broadcast receivers. You declare most of these app components
 in your app manifest. The Android OS then uses this file to decide how to integrate your app
 into the device's overall user experience. Given that a typical Android app might contain
 multiple components and that users often interact with multiple apps in a short period of
 time, apps need to adapt to different kinds of user-driven workflows and tasks.


Keep in mind that mobile devices are also resource-constrained, so at any time, the operating
system might kill some app processes to make room for new ones.

Given the conditions of this environment, it's possible for your app components to be launched
individually and out-of-order, and the operating system or user can destroy them at any time.
Because these events aren't under your control, you shouldn't store or keep in memory any
application data or state in your app components, and your app components shouldn't depend
on each other.

Common architectural principles
If you shouldn't use app components to store application data and state, how should you design
 your app instead?

As Android apps grow in size, it's important to define an architecture that allows the app to
scale, increases the app's robustness, and makes the app easier to test.


An app architecture defines the boundaries between parts of the app and the responsibilities each
part should have. In order to meet the needs mentioned above, you should design your app architecture
to follow a few specific principles.


Separation of concerns
The most important principle to follow is separation of concerns. It's a common mistake to write
all your code in an Activity or a Fragment. These UI-based classes should only contain logic that
handles UI and operating system interactions. By keeping these classes as lean as possible, you
can avoid many problems related to the component lifecycle, and improve the testability of these
classes.

Keep in mind that you don't own implementations of Activity and Fragment; rather, these are just
glue classes that represent the contract between the Android OS and your app. The OS can destroy
them at any time based on user interactions or because of system conditions like low memory.
To provide a satisfactory user experience and a more manageable app maintenance experience,
it's best to minimize your dependency on them.

Drive UI from data models
Another important principle is that you should drive your UI from data models, preferably persistent
models. Data models represent the data of an app. They're independent from the UI elements and other
components in your app. This means that they are not tied to the UI and app component lifecycle,
but will still be destroyed when the OS decides to remove the app's process from memory.


Persistent models are ideal for the following reasons:

Your users don't lose data if the Android OS destroys your app to free up resources.

Your app continues to work in cases when a network connection is flaky or not available.

If you base your app architecture on data model classes, you make your app more testable and robust.

Single source of truth
When a new data type is defined in your app, you should assign a Single Source of Truth (SSOT) to it.
The SSOT is the owner of that data, and only the SSOT can modify or mutate it. To achieve this,
the SSOT exposes the data using an immutable type, and to modify the data, the SSOT exposes
functions or receive events that other types can call.

This pattern brings multiple benefits:

It centralizes all the changes to a particular type of data in one place.
It protects the data so that other types cannot tamper with it.
It makes changes to the data more traceable. Thus, bugs are easier to spot.
In an offline-first application, the source of truth for application data is typically a database.
In some other cases, the source of truth can be a ViewModel or even the UI.

Unidirectional Data Flow
The single source of truth principle is often used in our guides with the Unidirectional
Data Flow (UDF) pattern. In UDF, state flows in only one direction. The events that modify
the data flow in the opposite direction.

In Android, state or data usually flow from the higher-scoped types of the hierarchy to the
lower-scoped ones. Events are usually triggered from the lower-scoped types until they reach
the SSOT for the corresponding data type. For example, application data usually flows from
data sources to the UI. User events such as button presses flow from the UI to the SSOT where
the application data is modified and exposed in an immutable type.

This pattern better guarantees data consistency, is less prone to errors, is easier to debug and
brings all the benefits of the SSOT pattern.

Recommended app architecture
This section demonstrates how to structure your app following recommended best practices.

Note: The recommendations and best practices present in this page can be applied to a broad
spectrum of apps to allow them to scale, improve quality and robustness, and make them easier
to test. However, you should treat them as guidelines and adapt them to your requirements as
needed.




*/