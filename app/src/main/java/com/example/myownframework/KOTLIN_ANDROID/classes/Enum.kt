package com.example.myownframework.Kotlin_Android.classes;

/*
In Kotlin, an enum class is a special type of class that represents a fixed set of constants.
It's similar to enumerations in other programming languages. An enum class is defined using the
enum keyword, followed by a class declaration that contains the enum constants and, optionally,
properties and methods associated with those constants.*/


/*
when you use enun class

-> when you have a finite number of const values you can group them together in something called enum
-> Enum objects are constant values once create them can not be changed
-> Each enum constant is a separate instance of enum class
   They have properties of name and ordinal and methods of values() and valueOf()
-> you can assign own properties to each enum object using constructor
-> Enum class can implement interfaces. but they cannot inherit from abstract class or open class
-> You can use enum constants as a anonymous class




*/

interface CashBack {

    fun cashBackValue() : Float
}

enum class CreditCardType(val color : String) : CashBack {
    SILVER("gray") {
        override fun cashBackValue(): Float = 0.01f
    },
    GOLD("yellow") {
        override fun cashBackValue(): Float  = 0.02f
    },
    PLATINUM("black") {
        override fun cashBackValue(): Float = 0.03f
    }


}

fun main(){


    //Enum constants are objects of enum class type
    val myCardType : CreditCardType =
        CreditCardType.PLATINUM

    //each enum objects has two properties : ordinal and name
    //println(CreditCardType.PLATINUM.ordinal)
    //println(CreditCardType.PLATINUM.name)


    //Each enum objects are have two methods : values and valueOf()
    val values = CreditCardType.values()
    //values.forEach { println(it) }
    val v = CreditCardType.valueOf("GOLD")
    //println(v)


    // using in when statement
    when(myCardType){
        CreditCardType.SILVER -> println("silver")
        CreditCardType.GOLD -> println("gold")
        CreditCardType.PLATINUM -> println("platinum")
    }


    val goldCardColor = CreditCardType.GOLD.color
    println(goldCardColor)

    val cashBackofGold = CreditCardType.GOLD.cashBackValue()
    println(cashBackofGold)


}