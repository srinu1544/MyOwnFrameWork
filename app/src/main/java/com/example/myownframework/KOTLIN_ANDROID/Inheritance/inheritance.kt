package com.example.myownframework.Kotlin_Android.Inheritance

/*Inheritance is a mechanism that allows you to create new classes that are based on existing classes.
 This can be useful for reusing code and for creating hierarchies of classes.

In Kotlin, inheritance is implemented using the open and override keywords. A class that can be
inherited from is declared as open. A member of a class that can be overridden in a subclass is
declared as override.

When you inherit from a class, you get all of the public and protected members of the class. You
can also add your own members to the subclass. If you override a member of the superclass, you
must provide a new implementation.

Inheritance is a powerful tool that can help you to write more efficient and reusable code.
Here is an example of inheritance in Kotlin:

open class Animal {
  open fun speak() {
    println("Animal sound")
  }
}

class Dog : Animal() {
  override fun speak() {
    println("Woof!")
  }
}

class Cat : Animal() {
  override fun speak() {
    println("Meow!")
  }
}

fun main(args: Array<String>) {
  val dog = Dog()
  dog.speak() // Prints "Woof!"

  val cat = Cat()
  cat.speak() // Prints "Meow!"
}

In this example, the Animal class is the superclass. The Dog and Cat classes are subclasses of
the Animal class. The speak() method is overridden in the Dog and Cat classes to provide different
implementations.

Inheritance is a powerful tool that can help you to write more efficient and reusable code.*/