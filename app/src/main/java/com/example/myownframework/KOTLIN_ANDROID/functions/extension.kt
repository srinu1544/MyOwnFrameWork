package com.example.myownframework.Kotlin_Android.functions

import androidx.annotation.Keep


/*In Kotlin, an extension function is a powerful feature that allows you to add new functions to
existing classes without modifying their source code. This is especially useful for adding
functionality to classes from external libraries or classes that you cannot modify, such as
standard library classes*/




fun Int.graterThan(other:Int) : Int {
    if (this > other){
        return this
    }else {
        return other
    }



}

fun main(){

     val grater = 10.graterThan(11)
     println(grater)

    val sub = 10.sub(5)
    println(sub)
}

fun Int.sub(other : Int) : Int {

    val result = this-other
    return result

}