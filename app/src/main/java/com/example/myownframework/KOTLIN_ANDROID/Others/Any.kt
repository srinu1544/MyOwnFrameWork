package com.example.myownframework.Kotlin_Android.Others

/*The any() function in Kotlin is used to check if a collection contains any element
that satisfies a given condition. It takes a lambda expression as its argument, which is
used to test each element of the collection. The function returns true if any element of
the collection satisfies the condition, or false otherwise.

For example, the following code checks if a list of numbers contains any even numbers:*/


fun main(args: Array<String>) {

    val numbers = listOf(1, 2, 3, 4, 5)

    val anyEven = numbers.any { it % 2 == 0 }

    println(anyEven) // true
}