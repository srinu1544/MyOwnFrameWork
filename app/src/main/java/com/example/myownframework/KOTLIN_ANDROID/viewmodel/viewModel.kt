package com.example.myownframework.Kotlin_Android.Viewmodel

/*

view model :
--------------
-> viewmodel is a class that is designed to store and manage ui related data in a lifecycle
conscious way

-> ViewModel classes are used to store the data even the configuration changes like rotating screen

-> ViewModel is one of the most critical class of the Android Jetpack Architecture Component
 that support data for UI components

-> Its purpose is to hold and manage the UI-related data. Moreover, its main function is
to maintain the integrity and allows data to service during configuration changes
like screen rotations.


Any kind of configuration change in Android devices tends to recreate the whole activity of
the application. It means the data will be lost if it has been not saved and restored
properly from the activity which was destroyed. To avoid these issues, it is recommended
to store all UI data in the ViewModel instead of an activity



What is ViewModel?
View Model is a lifecycle aware class, designed to store and manage UI related data.
It a main component in MVVM architecture. When a view model is created,
it is stored inside activity or fragment manager.


The ViewModel class is a business logic or screen level state holder.
 It exposes state to the UI and encapsulates related business logic.
 Its principal advantage is that it caches state and persists it through
 configuration changes. This means that your UI doesn’t have to fetch data
 again when navigating between activities, or following configuration changes,
 such as when rotating the screen.

Persistence
ViewModel allows persistence through both the state that a ViewModel holds,
 and the operations that a ViewModel triggers. This caching means that you
 don’t have to fetch data again through common configuration changes, such
 as a screen rotation.

Scope
When you instantiate a ViewModel, you pass it an object that implements the
ViewModelStoreOwner interface. This may be a Navigation destination,
Navigation graph, activity, fragment, or any other type that implements
the interface. Your ViewModel is then scoped to the Lifecycle of the
ViewModelStoreOwner. It remains in memory until its ViewModelStoreOwner
goes away permanently.

A range of classes are either direct or indirect subclasses of the ViewModelStoreOwner
interface. The direct subclasses are ComponentActivity, Fragment, and NavBackStackEntry.
 For a full list of indirect subclasses, see the ViewModelStoreOwner reference.


When the fragment or activity to which the ViewModel is scoped is destroyed,
asynchronous work continues in the ViewModel that is scoped to it. This is the
key to persistence.

For more information, see the section below on ViewModel lifecycle.

SavedStateHandle
SavedStateHandle allows you to persist data not just through configuration
changes, but across process recreation. That is, it enables you to keep the
UI state intact even when the user closes the app and opens it at a later time.

Access to business logic

Even though the vast majority of business logic is present in the data layer,
the UI layer can also contain business logic. This can be the case when combining
 data from multiple repositories to create the screen UI state, or when a particular
  type of data doesn’t require a data layer.


ViewModel is the right place to handle business logic in the UI layer.
The ViewModel is also in charge of handling events and delegating them to
other layers of the hierarchy when business logic needs to be applied to
modify application data.

Advantages:
Lifecycle aware: Viewmodel is lifecycle aware. It is automatically cleared
when the lifecycle they are observing gets permanently destroyed.

Hold and share UI data: Viewmodel holds all the UI data which are exposed to
UI handling classes via live data. These data can be shared between different
 fragments within an Activity scope.

Survives in rotation and retains data: It survive the rotation process when current
instance of activity is destroyed and new one is created so all the data it contains
remains there.

It provides access to business logic: It provide access to business logic from model
class or repo to your UI ie. fragments or activity.



*/