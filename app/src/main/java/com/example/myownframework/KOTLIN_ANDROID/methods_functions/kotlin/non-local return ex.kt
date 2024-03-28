package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

/* In kotlin compiler won't allow us to exit form the enclosing function using a return inside it
this type of return is called non local return

we can use non-local returns in inline functions because the lambda will be
inlined in the call site  */


fun main() {

    nonLocalReturn()
    println("This line will not be reached if the number 3 is encountered.")
}


fun nonLocalReturn(){

    val numbers = listOf(1, 2, 3, 4, 5)

    numbers.forEach {
        if (it == 3) return@forEach // Non-local return from lambda to the caller of main
        println(it)
    }
}