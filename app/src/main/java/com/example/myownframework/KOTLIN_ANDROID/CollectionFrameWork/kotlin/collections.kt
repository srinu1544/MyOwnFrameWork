package com.example.myownframework.Kotlin_Android.CollectionFrameWork


//https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions#8

//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/



/*
       Immutable          Mutable
/+-------------------/----------------------/
/List   listOf<T>()  /   mutableListOf<T>() /
/--------------------/----------------------/
/Set    setOf<T>()   /   mutableSetOf<T>()  /
/--------------------/----------------------/
/Map    mapOf<K,V>() / mutableMapOf<K,V>()  /
/+-------------------/----------------------/


 */


fun main(){

 /*   val names = mutableListOf<String>("Belal","srinivas","ram")


    names.add("sai")

    println(names[0])
    println(names[1])
    println(names[3])*/


    val names = setOf<String>("sai","sree","srinivas","sai")

    names.forEach { println(it) }
}

