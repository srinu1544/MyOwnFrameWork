package com.example.myownframework.Kotlin_Android.Codes.kotlin




/* remove elements above 14 in array */
fun remove() {


    var arr = mutableListOf<Int>(1,4,3,4,6,6,8,8,10,10,11,12,13,14,15,16)

    arr.removeAll(arr.filter { it >= 14 })

    println(arr)


}

// output [1, 4, 3, 4, 6, 6, 8, 8, 10, 10, 11, 12, 13]


fun main(){
   // remove()
    demo()
}


fun demo(){

    val arr = arrayOf(1,4,3,4,6,6,8,8,10,10,11,12,13,14,15,16)
    val filterlist = arr.filter { it >= 14 }
    println(filterlist)
}