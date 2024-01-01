package com.example.myownframework.Kotlin_Android.Others

/*

please refer :
https://abhiappmobiledeveloper.medium.com/android-singleliveevent-of-livedata-for-ui-event-35d0c58512da

SingleLiveEvent is a subclass of MutableLiveData that handles events and is aware
of the view's lifecycle. It is designed for handling events, while LiveData provides
an observable data holder for UI updates.

To observe an event only once using SingleLiveEvent, you can create a general "Event" class.
You can give it functions like observe(owner, observer) and observeForever(observer).

The Event class is a generic class that acts as a wrapper for data exposed via a LiveData
that represents an event. It is used for handling one-time events like navigation and
showing Snackbar messages.

The Live Event library on GitHub holds a class to handle single live events in Android
MVVM architectural pattern. This class is extended from the LiveData class.

*/