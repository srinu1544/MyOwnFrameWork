package com.example.myownframework.Kotlin_Android.Strings.java

/*

The StringBuilder class in Java is used to create mutable or changeable strings of characters.
It acts as a replacement for the String Class in Java. It creates a mutable sequence of
characters instead of an immutable one as the String Class does.


The StringBuilder class provides high performance compared with other string classes,
and it is not thread-safe and provides other methods for various purposes.

Here are some of the methods of the StringBuilder class:
-------------------------------------------------------
append(): This method appends the specified string to the end of the StringBuilder object.
insert(): This method inserts the specified string at the specified position in the StringBuilder object.
delete(): This method deletes the specified number of characters from the StringBuilder object, starting at the specified position.
reverse(): This method reverses the order of the characters in the StringBuilder object.
length(): This method returns the length of the StringBuilder object.
capacity(): This method returns the current capacity of the StringBuilder object.

ensureCapacity(): This method ensures that the capacity of the StringBuilder object
 is at least the specified capacity.

trimToSize(): This method trims the capacity of the StringBuilder object to the length
of the string.

The StringBuilder class is a very useful class for string manipulation, and it is used
 in many different applications.



fun withArgs(vararg args: String): String {
    return buildString {
        append(route)
        args.forEach { arg ->
            append("/$arg")
        }
    }

 */

