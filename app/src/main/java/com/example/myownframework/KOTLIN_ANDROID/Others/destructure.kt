package com.example.myownframework.Kotlin_Android.Others

/*Destructuring declarations is a Kotlin feature that allows you to extract values
from a collection into multiple variables in a single line of code. This can be
a more concise and readable way to write code, especially when you are working
with complex data structures. */




data class Personn(val name: String, val age: Int)

fun main(args: Array<String>) {

    val (first,second) = arrayOf(1,5)

    println(first)
    println(second)

    val personn = Personn("John Doe", 30)

    val (n, a) = personn

    println("Name: $n")
    println("Age: $a")
}