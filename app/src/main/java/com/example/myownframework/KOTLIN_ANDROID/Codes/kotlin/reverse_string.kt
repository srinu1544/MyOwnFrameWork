package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

fun main(){
    reverseString()
}

fun reverseString(){
    val name = "srinivas"
    var reverse = ""
    for (i in name.length-1 downTo 0){
        reverse += name[i]
    }
    println(reverse)
}