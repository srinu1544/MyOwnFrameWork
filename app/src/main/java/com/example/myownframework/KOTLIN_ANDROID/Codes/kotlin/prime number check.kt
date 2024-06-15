    package com.example.myownframework.Kotlin_Android.Codes.kotlin

//2,3,4,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97  prime numbers

fun main() {

        for (i in 0..100) {
            if (isPrimeNumber(i)) {
                print("$i,")
            }
        }

}

fun isPrimeNumber(n : Int) : Boolean {

    if (n==0 || n==1){
        return false
    }
    if (n==2) {
        return true
    }

    for (i in 2..n/2){
        if (n % i == 0){
            return false
        }
    }

    return true;
}