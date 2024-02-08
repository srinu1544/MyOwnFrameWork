package com.example.myownframework.Kotlin_Android.javajava.collectionframework.Collection.set

import java.util.SortedSet

/*Sortedset :
*/


fun main() {


    val sortedSet:SortedSet<Int> = sortedSetOf<Int>()
    sortedSet.add(100)
    sortedSet.add(101)
    sortedSet.add(103)
    sortedSet.add(104)
    sortedSet.add(110)
    sortedSet.add(115)

    println(sortedSet.headSet(104))
    println(sortedSet.tailSet(104))
    println(sortedSet.subSet(103,110))

}