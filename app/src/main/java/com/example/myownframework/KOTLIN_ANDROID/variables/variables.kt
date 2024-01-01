package com.example.myownframework.Kotlin_Android.variables

/*
package com.example.practiceapp.variables

 variables in kotlin :
 ---------------------

Val  - Immutable
Var  - Mutable
c Type Explicit Variables
d  Type Inference:
e Nullable Variables:
F Late-Initialized Variables:
G Constants:

In Kotlin, variables are used to store and manipulate data. Kotlin provides several ways to declare and use variables, and it offers type inference, which means you don't always have to explicitly specify the data type of a variable.

a)  val :

 These variables are read-only and cannot be reassigned after initialization. They are similar to `final`
  variables in Java.

val count = 0
count = 10 // Reassigning is not allowed

b)  var :

        These variables can be reassigned after initialization. They are similar to regular variables
         in most programming languages.

var count = 0
count = 10 // Reassigning is allowed




c.)Type Explicit Variables:

You can explicitly specify the data type of a variable by using a colon (`:`) after the   variable name.

val age: Int = 25
var balance: Double = 1000.50



d. ) Type Inference:

In many cases, Kotlin can automatically infer the data type based on the value assigned to the variable.

val x = 5 // Infers Int
val message = "Hello, World!" // Infers String


e.) Nullable Variables:
To declare a variable that can hold null values, you can use the nullable type by adding a `?` after the type.
var nullableString: String? = null


F.) Late-Initialized Variables:
For variables that cannot be initialized immediately, you can use the `lateinit` modifier. However,
you need to ensure that these variables are initialized before accessing them, or they will throw an exception.

lateinit var name: String
// ... later in the code
name = "Alice"

G )Constants:
In addition to `val`, you can use the `const` modifier to declare compile-time constants inside an object or a
companion object. Constants must be of a primitive type or a string.

object Constants {
    const val PI = 3.14159
}

Remember that Kotlin encourages the use of `val` (immutable variables)
 over `var` (mutable variables) whenever possible to make your code more predictable and less error-prone.

Link : https://chat.openai.com/share/5868d851-57bc-4c67-ab7f-1b91b46a5a7f
*/
