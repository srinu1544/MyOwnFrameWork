package com.example.myownframework.Kotlin_Android.ZZZZZZZZ

import androidx.compose.runtime.remember
import com.example.myownframework.Kotlin_Android.Codes.kotlin.isPrimeNumber

fun main() {

    //highestCount()

   // val fact = factotial(5)
   // println(fact)

    //printDuplicatesString()

    //fibinooci()

   /* for (i in 0..100) {
        if (isPrimeNumber(i)) {
            print("$i,")
        }
    }*/

    val child = whenEx(Father.Child3())
    println(child)

}


fun highestCount(){

    val name = "srinivas"

    val charMapCount = mutableMapOf<Char,Int>()
    for (char in name){
        charMapCount[char] = charMapCount.getOrDefault(char,0)+1
    }

    println(charMapCount)

    val map = charMapCount.maxByOrNull { it.value }
    println("${map?.key} = ${map?.value}")


}

fun factotial(n : Long) : Long {

    return if(n == 0L) 1 else n*factotial(n-1)

}

fun printDuplicatesString(){

    val name = "srinivas"
    val arr = name.toCharArray()
    val duplicates = mutableListOf<Char>()
    for (i in 0 until arr.size){
        for (j in i+1 until arr.size){
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }
        }
    }

    println(duplicates)
}

fun fibinooci(){

    var n1 = 0
    var n2 = 1
    var n3 = 0

    val count =  20

    val fibinooci = arrayListOf<Int>()
    fibinooci.add(n1);
    fibinooci.add(n2);

    for (i in 2 until count){
        n3 = n1+n2
        fibinooci.add(n3)
        n1 = n2
        n2 = n3
    }

    println(fibinooci)


}

fun primeNum(n:Int) : Boolean {

   if(n==0 || n==1){
        return false
   }

    if (n==2){
        return true
    }

    for (i in 2 .. n/2){
        if (n % i == 0){
            return false
        }

    }

    return true

}


fun whenEx(member : Father) {


     when(member){

         is Father.Child1 -> println("girl")
         is Father.Child2 -> println("girl")
         is  Father.Child3-> println("boy")
         is Father.Child4 -> println("girl")
         else -> {}
     }


}

sealed class Father {

    class Child1  : Father()
    class Child2  : Father()
    class Child3  : Father()
    object Child4 : Father()
}

fun primeNumber(n : Int) : Boolean  {

    if (n == 0|| n == 1 ) {
      return false
    }

    if (n == 2){
        return true
    }

    for (i in 2 .. n/2){
        if (n % i == 0){
            return false
        }
    }


    return true


}


fun findPait(arr : IntArray, target : Int) : Pair<Int, Int>? {

    val map = hashMapOf<Int,Int>()

    for (num in arr){
        val compliment = target - num
        if (map.containsKey(compliment)){
            return  Pair(compliment,num)
        }

            map[num] = num
    }

    return null

}





























