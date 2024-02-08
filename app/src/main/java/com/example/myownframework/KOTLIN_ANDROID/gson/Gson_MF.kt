package com.example.myownframework.Kotlin_Android.Gson

import com.google.gson.Gson

/*  -> Gson is an open-source Java library developed by Google.
    -> it can convert Java objects to JSON and vice versa.
     -> It can work with arbitrary Java objects, including pre-existing objects
     that you do not have source code of

      Why do we use GSON?
It provides simple toJson() and fromJson() methods to convert Java objects to
JSON and vice-versa
It allows pre-existing unmodifiable objects to be converted to and from JSON
It also provides extensive support for Java Generics
It allows custom representations for objects
GSON supports arbitrarily complex objects
(with deep inheritance hierarchies and extensive use of generic types)
GSON is a standardized library that is managed by Google
It is a reliable, fast, and efficient extension of the Java standard library.
This library is highly optimized
*/




object GsonHelloWorld {
    @JvmStatic
    fun main(args: Array<String>) {
        // init class
        val place = Place()
        place.name = "World"

        val human = Human()
        human.message = "Hi"
        human.place = place

        // convert to json
        val gson = Gson()
        val jsonString = gson.toJson(human)
        // print "json {"message":"Hi","place":{"name":"World"}}"
        println("json $jsonString")

        // convert from json
        val newHuman = gson.fromJson(jsonString, Human::class.java)
        newHuman.say() // print "Hi , World!"
    }

    private class Human {
        var message: String? = null
        var place: Place? = null

        fun say() {
            println()
            println(message + " , " + place!!.name + "!")
        }
    }

    private class Place {
        var name: String? = null
    }
}
