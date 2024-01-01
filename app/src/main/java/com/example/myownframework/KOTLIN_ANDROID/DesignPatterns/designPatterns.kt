package com.example.myownframework.Kotlin_Android.DesignPatterns

/*
Design patterns :

What Does Design Pattern Mean?

A design pattern is a repeatable solution to a software engineering problem. Unlike most program-specific solutions, design patterns are used in many programs. Design patterns are not considered finished products; rather, they are templates that can be applied to multiple situations and can be improved over time, making a very robust software engineering tool. Because development speed is increased when using a proven prototype, developers using design pattern templates can improve coding efficiency and final product readability.

Pattern #1 👌 Singleton
Pattern #2 👌 Factory
Pattern #3 👌 Builder
Pattern #4 👌 Facade
Pattern #5 👌 Dependency Injection
Pattern #6 👌 Adapter




Pattern #1 👌 Singleton

A singleton is a class that allows only a single instance of itself
to be created and gives access to that created instance. It contains
static variables that can accommodate unique and private instances of
itself. It is used in scenarios when a user wants to restrict the
instantiation of a class to only one object. This is helpful usually
when a single object is required to coordinate actions across a system.

Properties of Singleton Class

Only one instance
Globally accessible


Rules for making a class Singleton
The following rules are followed to make a Singleton class:

A private constructor
A static reference of its class
One static method
Globally accessible object reference
Consistency across multiple threads



Pattern #2 👌 Factory :

As the name suggests, Factory takes care of all the object creational logic.
In this pattern, a factory class controls which object to instantiate. Factory
pattern comes in handy when dealing with many common objects. You can use it
where you might not want to specify a concrete class.




Pattern #3 👌 Builder

Builder pattern aims to “Separate the construction of a complex object from its representation
so that the same construction process can create different representations.” It is used to
construct a complex object step by step and the final step will return the object.

Rules for making a Builder class
The following rules are followed to make a Builder class:

A private constructor
An inner class usually called Builder
function for each field to set the field value return
function build return instance of the Main class

Following is the example of Builder class in Kotlin:



Pattern #4 👌 Facade
The Facade pattern provides a higher-level interface that makes a set of other interfaces
 easier to use. The following diagram illustrates this idea in more.


Square’s Retrofit is an open-source Android library that helps you implement the Facade pattern.
 You create an interface to provide API data to client.



Pattern #5 👌 Dependency Injection :

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
in its constructor:



Pattern #6 👌 Adapter

The adapter pattern works as a bridge between two incompatible interfaces.

This pattern involves a single class which is responsible to join functionalities of independent or
incompatible interfaces. A real life example could be a case of card reader which acts as an adapter
between memory card and a laptop. You plugin the memory card into card reader and card reader into the
laptop so that memory card can be read via laptop.

to dive deep in adapter design pattern check this article below
https://www.geeksforgeeks.org/adapter-pattern/


Link :  https://medium.com/@ahmadkazimi/6-design-patterns-every-android-developer-must-know-53d912b5864b

*/

