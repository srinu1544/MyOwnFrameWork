package com.example.myownframework.Kotlin_Android.Activity

/*The lifecycle of an Android activity refers to the sequence of states that an activity goes
through during its lifetime, from the moment it is created until it is destroyed.
 Understanding the activity lifecycle is crucial for developing Android apps because it allows
 you to manage the state and behavior of your app as it interacts with the user and the system.

Here are the key stages in the lifecycle of an Android activity:

onCreated: The activity is created but not yet visible to the user. This happens when you call
 onCreate().

onStarted: The activity becomes visible, but it may not be in the foreground. This is the
onStart() phase.

onResumed: The activity is in the foreground and actively interacting with the user.
This is the onResume() phase.

onPaused: The activity loses focus but is still visible. This can happen when another
activity comes into the foreground or when a dialog appears. The onPause() method is called.

onStopped: The activity is no longer visible to the user. This can occur when the activity
is partially obscured by another activity or when the user navigates away. The onStop() method is called.

onDestroyed: The activity is completely removed from memory and is no longer part of the app's
 active state. This can happen when the system needs to free up resources or when the user
 explicitly finishes the activity. The onDestroy() method is called.

Additionally, there are a couple of callback methods like onRestart() that are called when
an activity goes from the stopped state back to the started state, without being destroyed.

Developers can override these lifecycle methods in their activity classes to perform specific
actions or manage resources at different stages of the activity's life. Properly managing the
activity lifecycle is essential for ensuring that your app behaves correctly and efficiently,
especially when handling tasks like saving and restoring state, releasing resources, or handling
configuration changes (e.g., screen rotations).

Understanding the Android activity lifecycle is crucial for building robust and responsive
Android applications.It allows developers to manage resources efficiently, save and restore
user interface state, and handle interruptions gracefully.

how to maintain backstack in android activity :
With the use of launch modes we maintain backstack in android


Clickings :
------------
Activity A

onCreate
onStart
onResume

if hoeme click
onpause

if again come to acticity
onStart
onResume

if back button click







Refer :
https://medium.com/wiselteach/activity-back-stack-and-launch-mode-part-1-693130682120*/