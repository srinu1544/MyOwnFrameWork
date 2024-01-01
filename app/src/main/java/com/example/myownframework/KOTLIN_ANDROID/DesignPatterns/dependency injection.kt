package com.example.myownframework.Kotlin_Android.DesignPatterns

/*Pattern #5 👌 Dependency Injection :

Dependency injection is like moving into a furnished apartment. Everything you need is already
there. You don’t have to wait for furniture delivery or follow pages of IKEA instructions to put
it together.

In software terms, dependency injection has you provide any required objects to instantiate a
new object. This new object doesn’t need to construct or customize the objects themselves.

In Android, you might find you need to access the same complex objects from various points in your
app, such as a network client, image loader or SharedPreferences for local storage. You can inject
these objects into your activities and fragments and access them right away.

Here’s an example. Without dependency injection, representing a Car that creates its own Engine
dependency in code looks like this:



This is not an example of dependency injection because the Car class is constructing its own Engine.
This can be problematic.


What does the code look like with dependency injection? Instead of each instance of Car
constructing its own Engine object on initialization, it receives an Engine object as a parameter
in its constructor:*/