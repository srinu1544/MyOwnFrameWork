package com.example.myownframework.Kotlin_Android.CollectionFrameWork

import com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin.performOperation

/*

what is map in kotlin ?
----------------------
 map() transforms each element of a stream into a single element of a new stream */

fun main() {
    val person = listOf<Person>(
        Person("nani", "ramoju" , "indian", 32),
        Person("babi", "R" , "pakistan", 34),
        Person("srinivas", "Rma" , "uk", 35),
        Person("vasu", "Ramoj" , "america", 36)
    )

    val cityandStates = listOf(
        "andhra pradesh",
        "telangana" ,
        "karnataka" ,
        "tamilnadu"
    )

    val zip =   cityandStates.zip(person)
    println(zip)

    val cities =   cityandStates.joinToString(prefix = "start : " , postfix = " : end" , separator = " ")
    println(cities)

}

data class Person (

    var first_name: String ,
    var last_name : String,
    var nationality : String,
    var age : Int

)

