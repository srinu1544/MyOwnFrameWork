package com.example.myownframework.Kotlin_Android.javajava.collectionframework.Cursor

import java.util.LinkedList


fun main(){

    val linkedList = LinkedList<String>()

    linkedList.add("balakrishna")
    linkedList.add("venky")
    linkedList.add("chiru")
    linkedList.add("nag")

    var listIterator = linkedList.listIterator()
    while (listIterator.hasNext()){
        var name = listIterator.next()
        if (name.equals("balakrishna")){
            listIterator.remove()
        }else if (name.equals("nag")){
            listIterator.set("chaitu")
        }else if (name.equals("chiru")){
            listIterator.add("charan")
        }
    }

    println(linkedList)

}

/*ListIterator :
----------------
it is bi-directonal cursor  */


