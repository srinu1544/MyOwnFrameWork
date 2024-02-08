package com.example.myownframework.Kotlin_Android.javajava.collectionframework.Cursor

import java.util.Vector

fun main(){

    val vector : Vector<Int> = Vector()
    for (i in 0..10){
        vector.addElement(i)
    }
    println(vector)

    val e = vector.elements()
    println(e.javaClass)
    while (e.hasMoreElements()) {
        val i = e.nextElement()
        println(i)
    }
}