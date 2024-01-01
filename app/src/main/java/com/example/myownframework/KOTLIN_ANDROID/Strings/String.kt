package com.example.myownframework.Kotlin_Android.Strings

/*
String class represents character strings, we can instantiate String in two ways.

String str = "ABC";
// or
String str = new String("ABC");
String is immutable in Java. So it’s suitable to use in a multi-threaded environment. We can share it
across functions because there is no concern of data inconsistency.

When we create a String using double quotes, JVM first looks for the String with the same value in
the string pool. If found, it returns the reference of the string object from the pool. Otherwise,
it creates the String object in the String pool and returns the reference. JVM saves a lot of memory
by using the same String in different threads.

If the new operator is used to create a string, it gets created in the heap memory.

The + operator is overloaded for String. We can use it to concatenate two strings. Although internally
it uses StringBuffer to perform this action.

String overrides equals() and hashCode() methods. Two Strings are equal only if they have the same
character sequence. The equals() method is case sensitive. If you are looking for case insensitive
checks, you should use equalsIgnoreCase() method.

The string uses UTF-16 encoding for the character stream.

String is a final class. All the fields as final except “private int hash”. This field contains the
hashCode() function value. The hashcode value is calculated only when the hashCode() method is called
for the first time and then cached in this field. Furthermore, the hash is generated using the final
fields of String class with some calculations. So every time the hashCode() method is called, it will
result in the same output. For the caller, it seems like calculations are happening every time but
internally it’s cached in the hash field.
*/