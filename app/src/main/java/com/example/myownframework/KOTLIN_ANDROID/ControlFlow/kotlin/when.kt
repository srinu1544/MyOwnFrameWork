package com.example.myownframework.Kotlin_Android.ControlFlow.kotlin

/* when

In Kotlin, the when expression is used as a replacement for the traditional switch
statement found in many other programming languages.
It allows for more flexibility and power in branching logic.
 Here's the basic syntax:*/


fun main() {
    whenEx(0)
}


fun whenEx(x: Int) {

    when (x) {
        0 -> println("x is zero")
        1 -> println("x is one")
        else -> println("x is not zero")
    }
}



