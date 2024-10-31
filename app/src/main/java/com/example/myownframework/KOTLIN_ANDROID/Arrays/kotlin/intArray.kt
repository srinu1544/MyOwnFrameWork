package com.example.myownframework.KOTLIN_ANDROID.Arrays.kotlin



fun main(){
    createArrays()
}

fun createArrays() {



    var arr1 = intArrayOf(1,2,3,4,5,6,7)
    println(arr1.joinToString(""))

    var arr2 = IntArray(5)
    arr2[0] = 1
    arr2[1] = 2
    arr2[2] = 3
    arr2[3] = 4
    arr2[4] = 5
    println(arr2.joinToString(","))

    var arr3 = IntArray(4) { it -> it }
    println(arr3.joinToString(","))

    var arr4 = arrayOf(1,2,3,4,5)
    println(arr4.joinToString(""))

    var arr5 = Array(5) {it -> print(it+1)}.joinToString()




}