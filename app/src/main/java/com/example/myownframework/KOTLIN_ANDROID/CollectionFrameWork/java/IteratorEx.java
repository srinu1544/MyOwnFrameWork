package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.java;


import java.util.ArrayList;
import java.util.Iterator;

/*In Java, the Iterator is an interface that belongs to the Java Collections Framework (introduced in Java 1.2).
It is used to traverse or iterate through a collection (like List, Set, etc.) in a sequential manner.

Key Features of Iterator:
Traversal: It allows forward iteration over a collection.
Element Removal: It provides a method to remove elements from the underlying collection during iteration.
Fail-Fast: If the collection is modified after the iterator is created (except through the iterator’s own remove() method), it throws a ConcurrentModificationException.
Methods in the Iterator Interface:
hasNext():
Returns true if there are more elements to iterate over.
Example: boolean hasNext()
next():
Returns the next element in the iteration.
Throws NoSuchElementException if no more elements are present.
Example: E next()
remove():
Removes the last element returned by the iterator from the underlying collection.
Can be called only once per call to next().
Example: void remove()
It throws IllegalStateException if next() hasn’t been called before remove() or if remove() is called multiple times in a row.

iterator can not be access on map directly but we can assess with some trick
it only access Collection classes  (Map is not coming under Collection it is separate)




*/
public class IteratorEx {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");

        // Get an Iterator
        Iterator<String> iterator = names.iterator();

        // Traverse the list using the Iterator
        while (iterator.hasNext()) {
            if (iterator.next() == "Jane") {
                iterator.remove();
            }
        }

        System.out.println(iterator);
    }
}
