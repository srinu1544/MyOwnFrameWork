package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun stringLegthWiseSorting() {


    // Create an array of strings
    val strings = arrayOf("AA", "BB","AAB","AAAB", "hello", "world", "kotlin")

    // Sort the array by string length
    strings.sortWith(compareBy { it.length })

    // Print the sorted array
    for (string in strings) {
        println(string)
    }

}

fun main(){
    stringLegthWiseSorting()
}