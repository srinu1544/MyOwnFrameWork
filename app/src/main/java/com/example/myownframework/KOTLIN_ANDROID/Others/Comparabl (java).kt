package com.example.myownframework.Kotlin_Android.Others

/* what is comparable in java
if a class implements  with comparable interface is called comparable objects


Comparable is an interface in the Java programming language that defines a natural
ordering for a class. It is used to compare objects of the same type, and to determine
their relative order. The Comparable interface has a single abstract method, compareTo(),
which takes an object of the same type as the parameter and returns an integer value.
The value returned by compareTo() indicates whether the object being compared is less
than, equal to, or greater than the object passed as an argument.

The Comparable interface is often used to implement sorting algorithms. For example, the
Arrays.sort() method sorts an array of objects in ascending order, according to the
natural ordering of the objects. The natural ordering of a class is defined by the
compareTo() method.

If a class implements the Comparable interface, objects created from that class can be sorted
using Java's sorting algorithms. For example, the following code shows how to sort an array
of Employee objects:


compareTo() :
-------------

public int compareTo(Object obj)

obj1.compareTo(obj2)

-> return -ve if obj1 has to come before obj2
-> return +ve if obj1 has to come after obj2
-> return 0 if obj1 and obj2 equal
-> null not accept

*/


fun main(){
    val v =  9.compareTo(9)
    println(v);
}



