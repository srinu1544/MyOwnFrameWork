package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork;

/*In Java, ListIterator is an interface that extends Iterator and provides additional functionality specifically for lists. It allows bidirectional traversal (both forward and backward) of a list and supports operations like adding, modifying, and removing elements during iteration.

Key Features of ListIterator:
Bidirectional Traversal: Unlike Iterator, which only allows forward traversal, ListIterator can traverse both forward and backward in a list.
Element Modification: It allows you to modify, remove, or add elements to the list while iterating.
List-Specific: ListIterator can only be used with lists (like ArrayList, LinkedList).
Methods in ListIterator Interface:
hasNext(): Returns true if there are more elements when traversing forward.
next(): Returns the next element when traversing forward.
hasPrevious(): Returns true if there are elements when traversing backward.
previous(): Returns the previous element when traversing backward.
nextIndex(): Returns the index of the element that would be returned by a subsequent call to next().
previousIndex(): Returns the index of the element that would be returned by a subsequent call to previous().
remove(): Removes the last element returned by next() or previous().
set(E e): Replaces the last element returned by next() or previous() with the specified element.
add(E e): Inserts the specified element into the list immediately before the element that would be returned by next().*/

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");

        // Get a ListIterator
        ListIterator<String> listIterator = names.listIterator();

        // Traverse the list forward
        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println("Index: " + listIterator.nextIndex() + ", Element: " + listIterator.next());
        }

        // Traverse the list backward
        System.out.println("\nBackward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println("Index: " + listIterator.previousIndex() + ", Element: " + listIterator.previous());
        }
    }
}
