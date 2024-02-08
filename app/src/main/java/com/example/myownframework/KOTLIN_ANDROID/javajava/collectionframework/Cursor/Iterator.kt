package com.example.myownframework.Kotlin_Android.javajava.collectionframework.Cursor

/*Iterator :
------------
we can apply iterator


Limitations of iterator
-> it is single direction cursor
-> replace capabilities are not their
-> addition of new objects not their





*/



fun main() {

    val al : ArrayList<Int> = ArrayList()
    for (i in 0..10){
        al.add(i)
    }

    println(al)

    val iterator = al.iterator()
    while (iterator.hasNext()){
        val i = iterator.next()
        if (i % 2 == 0){
            println(i)
        }else {
            iterator.remove()
        }
    }

    println(al)

}