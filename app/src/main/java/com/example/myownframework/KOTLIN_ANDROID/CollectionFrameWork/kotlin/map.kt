package com.example.myownframework.Kotlin_Android.CollectionFrameWork

/*

what is map in kotlin ?
----------------------
 map() transforms each element of a stream into a single element of a new stream */


fun main(){

    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }
    println(squares) // [1, 4, 9, 16, 25]

}

