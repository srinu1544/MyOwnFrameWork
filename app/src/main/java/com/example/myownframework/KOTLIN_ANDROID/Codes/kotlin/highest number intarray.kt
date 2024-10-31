package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin


fun main() {
    method21()
}

fun method11 () {

    val list = intArrayOf(3,4,5,5,6,7,8,8,8,9)
    val map = mutableMapOf<Int,Int>()
    var maxCount = 0
    for (num in list) {
       if(num > maxCount){
           maxCount = num
       }
   }
   println(maxCount)

}

fun method21() {
    val a1 = 3
    val a2 = 5
    if (a1 > a2) println(a1) else println(a2)
}
