package com.example.myownframework.Kotlin_Android.Classes



/*An anonymous class in Kotlin is a class that is not explicitly declared with a class declaration.
It is an inner class without a name and for which only a single object is created. Anonymous inner
classes can be useful when making an instance of an object with certain “extras” such as overloading
 methods of a class or interface, without having to actually subclass a class. */


/*
interface OnClickListener {

    fun onClick()

}

fun main(){

    object : com.example.practiceapp.Kotlin_Android.classes.anonymous.OnClickListener {

        override fun onClick() {

            // do something when the button is clicked
        }

    }
}
*/





/*In this example, we are creating an anonymous inner class that implements the OnClickListener interface.
 The anonymous inner class overrides the onClick() method and provides its own implementation.

Anonymous classes can be useful for one-time use or for creating classes that are specific to a particular
 situation.*/

interface Human{
    fun think()
}

fun main() {

    var programmer : Human = object :
        Human {
        override fun think() {
            println("human think")
        }
    }
    programmer.think()
}