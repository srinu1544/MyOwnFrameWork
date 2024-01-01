package com.example.myownframework.Kotlin_Android.classes;


/*
In Kotlin, the open keyword is used to declare a class, function, or property as open for extension.
When you mark a class, function, or property with the open keyword, it means that other classes can
inherit from that class, override that function, or override that property. This is a fundamental
concept in Kotlin's support for object-oriented programming and inheritance.


by default all the class, functions , variables  in kotlin are final
if you try to inherit a class necessary to put open keyword in front of the class

-> if you want to override function or variable necessary to put open keyword


*/


class Home : Furniture() {
    override fun chair() {
        super.chair()
    }

    override var totalCost: Int
        get() = super.totalCost
        set(value) {}


}

open class Furniture {

    open fun chair(){
        println("plastic chair")
    }

    open var totalCost : Int = 100000
}
