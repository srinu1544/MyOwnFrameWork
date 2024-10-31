package com.example.myownframework.Kotlin_Android.Scope_Functions

/*

with
Usage Scenarios
---------------
with is useful when you need to perform multiple operations on an object without
having to refer to it multiple times. Instead of repeating the object name,
you can access its properties and methods directly within the lambda.

In Kotlin, the with function is a higher-order function that is often used to simplify code
when working with an object. It allows you to call multiple functions on an object without
repeatedly referencing the object itself. The with function takes two parameters


Return  - lambda result
Context object - this


 */

class Person {

    var name : String = "Srinivas"
    var age : Int = 26
}

fun main(){

    var person = Person()
    //println(person.name)
    //println(person.age)

   var ageAfter5 : Int  = with(person) {
        println(name)
        println(age)
        age+5 // this is lambda result
    }

    println(ageAfter5)
}


