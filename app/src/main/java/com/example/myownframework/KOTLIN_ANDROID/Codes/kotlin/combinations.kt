package com.example.myownframework.Kotlin_Android.Codes.kotlin

/*_n C_r=\frac{n !}{r ! (n-r) !}
_n C_r	=	number of combinations
n	=	total number of objects in the set
r	=	number of choosing objects from the set


*/



fun nCr(n: Int, r: Int): Int {
    if (r > n / 2) {
        return nCr(n, n - r)
    }
    var result = 1
    for (i in 1..r) {
        result *= n - i + 1
        result /= i
    }
    return result
}

fun main(args: Array<String>) {
    val n = 5
    val r = 2
    println(nCr(n, r))
}