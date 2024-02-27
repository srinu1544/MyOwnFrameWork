package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

/*
-> In Kotlin, the invoke function is a special operator function that allows you to treat
an object as if it were a function.

-> This means you can call an object like a function by using the () Parentheses operator.

-> This is especially useful when you want to make an instance of
a class callable like a function, providing a more natural and concise
syntax for certain operations.*/



class MyFunction() {

     operator fun invoke(x: Int, y: Int): Int {
        return x + y
    }
}


fun main() {

    val myFunction = MyFunction()
    val result =  myFunction(5,6)
    println(result)

}

