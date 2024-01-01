package com.example.myownframework.Kotlin_Android.Inheritance

/*

-> interface may not have constructor

An interface is a reference type that defines a set of abstract methods. It is similar to a class,
 but it cannot be instantiated directly. Instead, it can only be implemented by other classes.
To define an interface, you use the interface keyword, followed by the name of the interface and a
pair of curly braces. Within the curly braces, you define the abstract methods of the interface.
Here is an example of an interface:

interface IFlyable {
  fun fly()
}


This interface defines a single abstract method, fly(). Any class that implements the IFlyable
 interface must provide a concrete implementation of this method.

To implement an interface, you use the class keyword, followed by the name of the class and a pair
of curly braces. Within the curly braces, you define the properties and methods of the class.

Here is an example of a class that implements the IFlyable interface:
class Airplane : IFlyable {
  override fun fly() {
    // Code to fly the airplane
  }
}


This class defines a concrete implementation of the fly() method.

You can use an interface to define a common contract for a set of classes. This can be useful
for code reuse and maintainability.

Here is an example of how to use the IFlyable interface:
val airplane = Airplane()
airplane.fly()

This code will call the fly() method on the airplane object. The fly() method will then fly the
 airplane.

Interfaces are a powerful feature of Kotlin. They can be used to define a common contract for a
 set of classes, which can improve code reuse and maintainability.*/