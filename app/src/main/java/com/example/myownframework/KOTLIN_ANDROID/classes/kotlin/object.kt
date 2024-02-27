package com.example.myownframework.Kotlin_Android.Classes;

/*
Object :
--------

In Kotlin, an object is a special class that only has one instance. It is a way to create a singleton,
which is a design pattern that restricts the instantiation of a class to one object. Objects can be
used to encapsulate data and behavior, and they can also be used to implement singletons.
To declare an object in Kotlin, you use the object keyword. For example, the following code declares

Their is no constructor in object
by default object is thread safe


an object called MyObject:

object MyObject {
    var x = 0
    var y = 0

    fun print() {
        println("x = $x, y = $y")
    }
}

To access the properties and methods of an object, you use the dot notation.
For example,the following code prints the values of the x and y properties of the MyObject object:

MyObject.print()*/