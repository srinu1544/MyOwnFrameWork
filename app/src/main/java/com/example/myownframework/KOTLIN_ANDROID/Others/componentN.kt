package com.example.myownframework.Kotlin_Android.Others

/*In Kotlin, the componentN() functions are a set of built-in functions that allow you to
 access the elements of a data class instance.

The componentN() functions are named with the prefix component and followed by the number
of the element you want to access. For example,

to access the first element of a data class instance, you would use the component1() function.
The componentN() functions are useful when you want to access the elements of a data class
instance in a destructuring declaration. For example, the following code shows how to use
the componentN() functions to access the elements of a data class instance in a destructuring
declaration:



*/


data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {

    val person = Person("John Doe", 30) // name, age are the elements

    println("Name: ${person.component1()}")
    println("Age: ${person.component2()}")
}