package com.example.myownframework.Kotlin_Android.Keywords

/*

The super keyword in Kotlin is used to refer to the properties and methods superclass.
It can be used in two ways:

To call a method of the superclass.
To access a property of the superclass.

*/

open class Vehicle {

    open val car = "polo"
     open fun start() {
         println("vehical started")
     }
}

class Motorbike : Vehicle() {
    override fun start() {
        super.start()
    }


    override val car = TODO()

    init {
        println(super.car)
    }
}

fun main() {

    val motorbike = Motorbike()
    motorbike.start()
}