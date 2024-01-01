package com.example.myownframework.Kotlin_Android.Differences

/*In Android, mutable objects can change after they are created, while immutable objects cannot.


Mutable objects can change to any value or state without creating a new object.
Immutable objects cannot be changed to their value or state once they are created.
To change the contents of an immutable object, a new object must be created.

Mutable objects can be changed during runtime. For example,
MutableLiveData is a subclass of LiveData that provides mutability,
allowing the modification of its value. It is commonly used within ViewModels
to hold and expose data that can be updated over time.

To make objects immutable in a class, all fields can be made final and private. */