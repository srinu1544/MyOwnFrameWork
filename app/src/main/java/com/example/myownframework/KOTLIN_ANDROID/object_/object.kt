package com.example.myownframework.Kotlin_Android.Object_
/*


An object is an instance of a class that consists of data specific to that object.
You can use objects or class instances interchangeably

In Kotlin, the object keyword can be used to declare a singleton object or an anonymous object.

A singleton object is an object that has only one instance. It is often used to represent global
data or functionality. To declare a singleton object, you use the object keyword followed by the
name of the object. The object declaration can contain properties and functions.

An anonymous object is an object that is not assigned a name. It is often used to create a
temporary object or to pass an object as a parameter to a function. To create an anonymous
object, you use the object keyword followed by a block of code. The block of code can contain
properties and functions.

// Declare a singleton object
object MyObject {
    var name = "My Object"
    fun printName() {
        println(name)
    }
}

// Create an anonymous object
val anonymousObject = object {
    var name = "Anonymous Object"
    fun printName() {
        println(name)
    }
}

// Use a singleton object
MyObject.printName() // Prints "My Object"

// Use an anonymous object
anonymousObject.printName() // Prints "Anonymous Object"






*/

// Expression Syntax
fun main() {

    val myObject = object {
        val valueOne = "L"
        val valueTwo = "A"
        fun sum() {
            val result = valueOne + valueTwo
            println("The sum is: $result")
        }
    }

    myObject.sum()
}
