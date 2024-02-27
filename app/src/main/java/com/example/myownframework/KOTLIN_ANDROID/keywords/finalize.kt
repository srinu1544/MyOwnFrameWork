package com.example.myownframework.Kotlin_Android.Keywords

/*

finalize() method in Java is a method of the Object class that is used to perform cleanup
activity before destroying any object. It is called by Garbage collector before destroying the
objects from memory.


finalize() is not part of Kotlin. It is a method in Java that is called by the garbage
collector before an object is destroyed.

Kotlin does not have a finalize() method, but it does have a number of other features that can
be used to clean up resources when an object is no longer needed.

One way to clean up resources in Kotlin is to use the finally block. A finally block is a block
of code that is always executed, even if an exception is thrown. This can be used to ensure that
resources are always cleaned up, even if something goes wrong.

Another way to clean up resources in Kotlin is to use the use() function. The use() function takes
a block of code as its argument and ensures that the resources used in the block are cleaned up,
even if an exception is thrown.

Finally, Kotlin also has a number of built-in functions that can be used to clean up resources.
For example, the close() function can be used to close a file or database connection.

In general, it is best to avoid using finalize() in Kotlin. Instead, use one of the other methods
 described above to clean up resources when an object is no longer needed.


*/


