package com.example.myownframework.Kotlin_Android.classes_kotlin;

/*
An abstract class in Kotlin is a class that cannot be instantiated. This means you cannot create objects
of an abstract class. However, you can inherit subclasses from a Kotlin abstract class. An abstract class
is declared using the abstract keyword in front of class name.

The properties and methods of an abstract class are non-abstract unless you explicitly use the abstract
keyword to make them abstract. If you want to override these members in the child class then you just need
to use override keyword in front of them in the child class.

Abstract classes are always open.
Here is an example of an abstract class in Kotlin:
abstract class Animal {
    abstract fun makeSound()
}


This abstract class defines an abstract method called makeSound(). This method must be implemented by any
subclass of Animal.

Here is an example of a subclass of Animal:
class Dog : Animal() {
    override fun makeSound() {
        println("Woof!")
    }
}

This subclass implements the makeSound() method by printing the string "Woof!".
You can create an object of the Dog class, but you cannot create an object of the Animal class.
Abstract classes are a useful way to provide a common interface and implementation for its subclasses.*/