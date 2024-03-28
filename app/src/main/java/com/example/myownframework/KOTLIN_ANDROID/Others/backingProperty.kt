package com.example.myownframework.Kotlin_Android.Others

/*
backing property :
------------------
->  encapsulation the property variable in your class
->  It is very useful to safe guard from access out side a class
->  with the backing we can not change the values from out side the class



*/


class Studentt {

    private val _hobbies = mutableListOf<String>()
    val hobbies :  List<String>

        get() {
            return _hobbies
        }

    fun addHobbies(hobbie : String){
        _hobbies.add(hobbie)
    }

}

fun main() {

    val studentt = Studentt()
    studentt.addHobbies("cricket")


    studentt.hobbies.forEach {
        println(it)
    }



}