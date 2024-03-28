package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main(){


   // val isprime = isPrimeNumber(5)
   // println("$isprime")


    val primeNumbers = arrayListOf<Int>()
    for (i in 0..100){
        if (isPrimeNumber(i)) {
            print("$i,")
        }
    }

}

fun isPrimeNumber(n : Int) : Boolean {

    if (n==0 || n==1){
        return false
    }
    if (n==2){
        return true
    }

    for (i in 2..n/2){
        if (n % i == 0){
            return false
        }
    }

    return true;
}