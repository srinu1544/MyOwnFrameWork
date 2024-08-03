package com.example.myownframework.Kotlin_Android.Scope_Functions

/* if you want to do some additional object configurations or operations *

Return - context object
context - it */


class Person3 {
    var name = "srinivas"
}


fun main() {

    val persion3 = Person3()
    persion3.also {
        it.name = "sai srinivas"
        println(it.name)
    }

    val numbersList : MutableList<Int> = mutableListOf(1,2,3)

  val duplicateNumbers =   numbersList.also {

        //println(it)
        it.add(4)
        //println(it)
  }


    println(numbersList)
    println(duplicateNumbers )
}