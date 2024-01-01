package com.example.myownframework.Kotlin_Android.Encapsulation

/*Encapsulation is a programming technique that bundles data and methods into a single unit,
 called an object. This helps to protect the data from being accessed directly and allows the
 methods to control how the data is accessed.

In Kotlin, encapsulation is achieved by using the private and public modifiers. Private
members can only be accessed by methods within the same class, while public members can
be accessed by any code that has access to the object.


Here is an example of a class that uses encapsulation:
-----------------------------------------------------
class Person {
    private var name: String = ""
    private var age: Int = 0

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
    }
}

In this example, the name and age members are private, so they can only be accessed by the getName(), setName(), getAge(), and setAge() methods. This means that any code that wants to access the name or age of a Person object must do so through one of these methods.
Encapsulation is a powerful technique that can help to make your code more secure, readable, and maintainable.*/