package com.example.myownframework.Kotlin_Android.ZZZZZZZZ

fun main() {


    val name = "madam"
    val arr = name.toCharArray()
    var reverse = ""

    for(i in arr.size-1 downTo 0) {
        reverse += arr[i]
    }

    if (name != reverse){
        println("given string is not palindrome")
    }else {
        println("given string is palindrome")
    }
}























