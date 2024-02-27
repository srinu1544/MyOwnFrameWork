package com.example.myownframework.Kotlin_Android.Variables

/*

abstract val :
--------------
An abstract val is a val that is declared in an abstract class.
It cannot be reassigned in the abstract class, but it can be overridden in a subclass.*/


 interface  Demo {

   abstract val name : String

   fun nani(){

   }

}

class Name() : Demo {

    override val name: String
        get() = TODO("Not yet implemented")
}