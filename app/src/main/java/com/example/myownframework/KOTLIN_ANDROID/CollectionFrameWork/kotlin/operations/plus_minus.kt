package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin.operations

// plus and minus
fun main(){

    val list1 = listOf("nani","srinivas", "babi", "vas")
    val list2 = listOf("Roja","sai")
    val list3 = listOf("sai srinivas", "roja srinivas", "sai roja")
    val totalList = list1+list2+list3
    println(totalList - list3)
}