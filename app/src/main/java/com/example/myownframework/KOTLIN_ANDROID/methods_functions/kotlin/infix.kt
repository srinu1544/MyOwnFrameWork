package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

/* In kotlin an infix function is a function that allows to to call it with special syntax, with out using
the traditional dot-notation and parenthesis. To declare an infix function, you use the infix modifier when
 defining the function. Infix functions are typically used to make code more readable and expressive,
 especially when working with operations that mimic natural language. */


infix fun Int.add(other : Int) : Int {
   return  this+other
}

fun main(){

    val addition = 5 add 10
    println(addition)
}

