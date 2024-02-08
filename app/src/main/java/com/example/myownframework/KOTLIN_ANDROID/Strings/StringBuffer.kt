package com.example.myownframework.Kotlin_Android.services

/*StringBuffer in Java is a mutable string class. It means that the content of a
 StringBuffer object can be changed after it has been created. StringBuffer is
 thread-safe, whereas StringBuilder is not.


Here are some of the advantages of using StringBuffer over String:

StringBuffer is mutable, whereas String is immutable.
 This means that you can modify the content of a StringBuffer
 object after it has been created, but you cannot modify the content of a String object.

StringBuffer is thread-safe, whereas StringBuilder is not. This means that
multiple threads can safely access and modify a StringBuffer object without causing any problems.

StringBuffer is more efficient than StringBuilder for certain operations,
such as concatenation.

Here are some of the disadvantages of using StringBuffer over String:
---------------------------------------------------------------------
StringBuffer is slower than StringBuilder for certain operations, such as insertion and deletion.
StringBuffer uses more memory than StringBuilder.

Here are some of the methods of StringBuffer:
--------------------------------------------
append(): This method appends a string to the end of the StringBuffer object.
insert(): This method inserts a string at a specified position in the StringBuffer object.
delete(): This method deletes a character or a substring from the StringBuffer object.
reverse(): This method reverses the order of the characters in the StringBuffer object.
capacity(): This method returns the current capacity of the StringBuffer object.
length(): This method returns the length of the StringBuffer object.
toString(): This method converts the StringBuffer object to a String object.




note :  StringBuffer implements Comparable in Java SE 11 & JDK 11.
 the default capacity of string buffer is 16 */


fun main() {
    val stringBuffer = StringBuffer()
    println(stringBuffer.capacity())
}