package com.example.myownframework.Kotlin_Android.Deligate.standard

import kotlin.properties.Delegates

/*when ever you want to observe the changes use observable */

//Observable properties: listeners are notified about changes to this property.

class Employ {

    var salary : Int by Delegates.observable(50) {property, oldValue, newValue ->
        println("old value $oldValue")
        println("new value $newValue")
    }

}

fun main(){

    val employ = Employ()
    employ.salary = 60
    employ.salary = 70



}