package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin.operations

/*Retrieving or parts of collection

1) slice



*/


fun main(){
    val list = listOf("NA","nani", "babi", "srinivas", "sai","roja", "sai roja","Ramoju")
    //println(list.slice(2..4))
    //println(list.slice(0..4 step 2))
    //println(list.slice(setOf(2,3,4)))

    // take and drop
    //println(list.take(3))
    //println(list.drop(2))

   // println(list.takeWhile { it.length > 1 })
   // println(list.dropWhile { it.length <= 2 })

    // take while and drop while
    //println(list.takeWhile { it.get(0) > 's' })
    //println(list.dropWhile { it.get(0) >  's' })

    //println(list.takeLast(2))
    //println(list.dropLast(2))

    //println(list.takeLastWhile { it.get(0) > 's' })
    //println(list.dropLastWhile { it.get(0) >  's' })

    //println(list.chunked(3))
    println("windowed : ${list.windowed(3,2,false)}")

}