package com.example.myownframework.Kotlin_Android.scope_functions

/*

with out using the class name this we can assign the object to the property

Certainly! You can use the apply function in Kotlin to configure the properties of
an object and return that object. It's useful when you want to perform multiple operations
on an object during its initialization.

Return - context object
context object - this
*/

class Person1{
    var name : String = ""
    var age : Int = 0

}

fun main() {
    val person1 = Person1().apply {
        name = "srinivas"
        age = 26
    }
}