package com.example.myownframework.Kotlin_Android.Deligate.standard

import kotlin.properties.Delegates

/*

The lazy keyword in Kotlin is used to initialize a property when it is first accessed.
This can be useful for improving performance, as it avoids initializing properties
that are never used.

To use the lazy keyword, you need to add the kotlinx.coroutines.lazy dependency to
your project. Once you have added the dependency, you can use the lazy keyword to
declare a property as follows:


The instance only when it is needed and we can achieve this thing using lazy delegate
 It creates one instance at a time  */

class StudentHeavy {

    init {
        println("student heavy initialized")
    }
}

class Student {

    val studentheavy by lazy { StudentHeavy() }

    var marks : Int by Delegates.observable(50) { property, oldValue, newValue ->

        println("old value $oldValue")
        println("new value $newValue")
    }

}


val myProperty by lazy {
    // This code will only be executed when myProperty is first accessed.
    // ...
}

fun main(){

    val student = Student()
    //student.studentheavy


    student.marks = 60
    student.marks = 70
}