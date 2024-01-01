package com.example.myownframework.Kotlin_Android.Differences

/*Serialization and deserialization are two fundamental processes in Android (and in programming in general)
related to converting data into a format suitable for storage or transmission and then converting it back
to its original form. Here's the key difference between them:

Serialization:

Definition: Serialization is the process of converting an object's state or data into a byte stream or
another format that can be easily stored or transmitted. In Android, this often involves converting complex
objects into a format that can be saved to disk (e.g., in a file) or sent over the network
(e.g., in JSON or XML).

Use Cases:
Serialization is commonly used when you want to save the state of an object or pass it between different
parts of an application or between applications. For example, when you save an object to SharedPreferences,
you are serializing it into a format that can be stored as a string.

Example:
Converting a Java object into a JSON string to send to a web server is an example of serialization.
The object's properties are transformed into a format suitable for transmission.

Deserialization:

Definition:
Deserialization is the process of converting a serialized (byte stream or other format)
data back into an object or data structure that can be used in the program. In Android, this often
involves taking data that was previously serialized and restoring it to its original state.

Use Cases:
 Deserialization is used when you want to retrieve data that was previously serialized,
whether it's from disk, over the network, or any other source. After deserialization, you can work
with the data as an object or data structure.

Example:
Parsing a JSON string received from a web server and converting it into a Kotlin or Java
object is an example of deserialization. The data is transformed from its transmitted format back
into an object for further processing.

In summary, serialization is the process of converting an object or data into a format suitable for storage
or transmission, while deserialization is the process of converting that serialized data back into its
original form so that it can be used within the program. These processes are essential for tasks like saving
and loading data, exchanging information over the network, and more in Android development.





*/