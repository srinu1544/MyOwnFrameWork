package com.example.myownframework.Kotlin_Android.datatypes

/*


please refer : https://www.codecademy.com/resources/docs/kotlin/data-types

Data type

primitive data types and non-primitive data types :

primitive data types :
---------------------

Boolean
Byte
Char
Double
Float
Int
Long
Short

Numbers Type :
Byte
Short
Int
Long
Float
Double
char
boolean


non- primitive data types :
---------------------------

Any  -

Every Kotlin class has Any as a superclass. This means Any is the parent class of
any class you define in Kotlin. This means if you follow the chain of parents of a class
you will finally end up at Any . It's the exact equivalent of Object in Java

Arrays
Class
Enum
List
Map

Nothing -

The Nothing type in Kotlin is a special type that is used to represent a value that never exists.
If a function's return type is Nothing then that function doesn't return any value not even the
default return type Unit

Set
String
Unit  -- void in java


Kotlin, like many programming languages, has a variety of data types that allow you to work with
different kinds of data. Here are some of the common data types in Kotlin:

1. **Numbers**:
- `Byte`: 8-bit signed integer.
- `Short`: 16-bit signed integer.
- `Int`: 32-bit signed integer.
- `Long`: 64-bit signed integer.
- `Float`: 32-bit floating-point number.
- `Double`: 64-bit double-precision floating-point number.

2. **Characters**:
- `Char`: Represents a single 16-bit Unicode character.

3. **Booleans**:
- `Boolean`: Represents a true or false value.



non- primitive data types :
---------------------------

4. **Text**:
- `String`: Represents a sequence of characters.

5. **Arrays**:
- `Array`: Represents a generic array with a specified type.

6. **Collections**:
- `List`: Represents an ordered collection of elements.
- `Set`: Represents an unordered collection of unique elements.
- `Map`: Represents a collection of key-value pairs.

7. **Ranges**:
- `ClosedRange`: Represents a closed range of values, typically used with range expressions like `1..10`.

8. **Nullability**:
- Kotlin has a type modifier called `?` which can be added to any type to indicate that it can hold a null value. For example, `String?` means a nullable string.

9. **User-Defined Types**:
- You can define your own data types using classes and data classes in Kotlin.

10. **Enums**:
- `enum class`: Represents a finite set of values, often used for defining constants and symbolic values.

11. **Function Types**:
- Kotlin treats functions as first-class citizens, and you can define function types like `(Int, Int) -> Int`, which represents a function that takes two integers and returns an integer.


12. **Any and Nothing**:
- `Any`: The supertype of all non-nullable types.
- `Nothing`: A type with no values. It's often used to indicate that a function never returns normally.

13. **Type Aliases**:
- You can create custom type aliases using the `typealias` keyword to make your code more readable and maintainable.

These are some of the core data types in Kotlin. Kotlin's type system is designed to be concise, expressive, and safe, allowing you to work with a wide range of data in a clear and efficient manner.

Link :

Unit :
------

In Kotlin, the Unit type is a special type that represents the absence of a value. It is similar to the void type in
 Java, but it is a real class with a single instance.

The Unit type is used as the return type of functions that do not return any meaningful
value. For example, the following function prints a message to the console but does not
return anything:

The return type of this function is Unit, which indicates that the function does not return anything.
The Unit type can also be used as the return type of functions that return a null value.
For example, the following function returns the null value:


*/

fun getSomethingOrNull(): Unit? {
    return null
}


