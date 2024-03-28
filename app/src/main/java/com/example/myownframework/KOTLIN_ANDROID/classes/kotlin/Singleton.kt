package com.example.myownframework.Kotlin_Android.Classes.kotlin


/*In Kotlin, a singleton is an object that has only one instance throughout the
 application lifecycle. Kotlin provides a simple and concise way to create
 singletons using the object keyword.


 In Kotlin, an object is a special class that only has one instance. It is a way to create a singleton,
which is a design pattern that restricts the instantiation of a class to one object. Objects can be
used to encapsulate data and behavior, and they can also be used to implement singletons.
To declare an object in Kotlin, you use the object keyword. For example, the following code declares

Their is no constructor in object
by default object is thread safe

 */

object MySingleton {
    fun doSomething() {
        println("Doing something in MySingleton")
    }
}


fun main(){

    MySingleton.doSomething()
}