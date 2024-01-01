package com.example.myownframework.Kotlin_Android.deligate.standard

import kotlin.properties.Delegates


/*Vetoable is a property delegate in Kotlin that allows you to intercept and veto
the assignment of a value to a property. This can be useful for enforcing certain
conditions on the value of a property, such as ensuring that it is always positive
or that it does not exceed a certain limit.

To use vetoable, you first need to define a property delegate function that takes the old
and new values of the property as parameters and returns a Boolean value. If the function
 returns true, the new value is assigned to the property; otherwise, the assignment is
 vetoed and the property remains unchanged.*/




class Worker {

    var age: Int by Delegates.vetoable(18) { _, oldValue, newValue ->
        if (newValue < 18) {
            println("Age cannot be less than 18")
            false // Veto the change
        } else {
            true
        }
    }
}

fun main(){

    val worker = Worker()
    worker.age = 17


}