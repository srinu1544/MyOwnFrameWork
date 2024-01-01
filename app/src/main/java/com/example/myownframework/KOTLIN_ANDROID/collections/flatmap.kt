package com.example.myownframework.Kotlin_Android.collections

/*what is flatmap in kotlin ?
---------------------------
FlatMap is used to combine all the items of lists into one list */


fun main(){

    val numbers = listOf(listOf(1, 2), listOf(3, 4), listOf(5))
    val flattenedNumbers = numbers.flatMap { it }
    println(flattenedNumbers) // [1, 2, 3, 4, 5]
}

