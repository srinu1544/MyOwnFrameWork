package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main(){

    val fibonacci = arrayListOf<Int>()
    var n1 = 0
    var n2 = 1
    var n3 = 0
    val count = 20

    fibonacci.add(n1)
    fibonacci.add(n2)

    for (i in 0 until count) {
        n3 = n1 + n2
        fibonacci.add(n3)
        n1 = n2
        n2 = n3
    }
    println(fibonacci)
}

// out put
// [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946]