package com.example.myownframework.Kotlin_Android.CollectionFrameWork.java.Collection.set

/* HashSet :

-> insertion order can not be preserved
->
*/


fun main() {

    val hashSet : HashSet<Any> = hashSetOf()

    val bool = hashSet.add("Dar")
    //println(bool)
    val bool1 = hashSet.add(6)

    //println(bool1)

    //println(hashSet)


    val HashSet = HashSet<String>()
    HashSet.add("a")
    HashSet.add("b")
    HashSet.add("c")
    HashSet.add("d")

    println(HashSet)


}