package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

fun main() {
    var a = 5
    var b = 10



    // Swapping using a temporary variable
    val temp = a
    a = b
    b = temp

    // Swapping using destructuring
    a = b.also { b = a }

    // Swapping using arithmetic operations
    a = a + b
    b = a - b
    a = a - b

    println("After swapping: a = $a, b = $b")
}