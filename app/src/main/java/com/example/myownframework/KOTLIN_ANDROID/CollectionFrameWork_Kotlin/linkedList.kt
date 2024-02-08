package com.example.myownframework.Kotlin_Android.CollectionFrameWork_Kotlin

import java.util.LinkedList

/*
A linked list is a data structure that consists of a series of nodes, each of which contains a value
and a reference to the next node in the list. Linked lists are often used to implement queues and
stacks, and they can also be used to represent data that is naturally sequential, such as a list of
students in a class or a list of items in a shopping cart.

In Kotlin, linked lists can be implemented using the LinkedList class. The LinkedList class provides
a number of methods for adding, removing, and searching for elements in a list. It also provides
methods for iterating over the elements in a list.*/


fun linkedList() {

    // Create a new linked list
    val linkedList = LinkedList<Int>()

// Add some elements to the list
    linkedList.add(1)
    linkedList.add(2)
    linkedList.add(3)

// Print the elements in the list
    println(linkedList) // prints "[1, 2, 3]"

// Remove an element from the list
    linkedList.remove(1)

// Print the elements in the list
    println(linkedList) // prints "[2, 3]"

// Search for an element in the list
//    val element = linkedList.find(2)

 //   if (element != null) {
 //       println("The element ${element} is in the list")
 //   } else {
//      println("The element ${element} is not in the list")
//    } // prints "Th
}
