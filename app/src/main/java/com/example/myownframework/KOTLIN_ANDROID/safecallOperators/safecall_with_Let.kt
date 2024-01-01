package com.example.myownframework.Kotlin_Android.safecallOperators


/*In Kotlin, the let function is often used for safe calls when working with nullable objects.
 It allows you to perform an operation on a nullable object only if it's not null.
 Here's how you can use let for a safe call:*/


fun main() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}