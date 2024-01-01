package com.example.myownframework.Kotlin_Android.keywords

/*

Throw :
-------

Throw keyword is used to throw an exception in Kotlin. It is used to throw a custom exception.
To throw an exception object we will

*/


fun main(){

    drivingLicence(19)
}

fun drivingLicence(age : Int){

    if (age <= 18){
        throw ArithmeticException("Not eligible for driving licence")
    }else {
        println("You are eligible for driving licence")
    }
}

