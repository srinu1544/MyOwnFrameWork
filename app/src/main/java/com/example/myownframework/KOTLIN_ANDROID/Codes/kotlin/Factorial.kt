package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main(){

     println( factorial(7));

    greet


}

fun factorial(n: Long): Long {
    return if (n == 1L) 1 else n * factorial(n - 1)
}

val greet = { println("i am lambda") }




