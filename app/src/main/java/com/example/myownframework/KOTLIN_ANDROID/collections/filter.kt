package com.example.myownframework.Kotlin_Android.collections

/*The filter() function in Kotlin is used to filter elements from a collection based on a given
 predicate. It returns a new collection containing only elements that meet the given condition.

 collection.filter(predicate: (T) -> Boolean): Collection<T>

 */


fun main() {


    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // [2, 4]


    remove()


}


/* remove elements above 14 in array */
fun remove() {

    var arr = mutableListOf<Int>(1,4,3,4,6,6,8,8,10,10,11,12,13,14,15,16)
    arr.removeAll(arr.filter { it >= 14 })
    println(arr)

}

// output [1, 4, 3, 4, 6, 6, 8, 8, 10, 10, 11, 12, 13]



