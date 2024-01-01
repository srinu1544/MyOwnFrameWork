package com.example.myownframework.Kotlin_Android.keywords

/*The in keyword in Kotlin is used to check if a value is present in a collection or range.
For example, the following code will print "true" because the value 1 is present in the list

listOf(1, 2, 3).*/


fun main (){

    // example 1

    val list = listOf<String>("nani","roja","srinivas")

    val conta = "nani" in list

    println(conta)  // true


    // example 2

    val numList = listOf<Int>(1,3,4,2,4,4,4,4,)
    val conta1 = 4 in numList
    println(conta1) // true

    //example 3

    val range = 1..15
    val const3 = 10 in range
    println(const3) // true


}