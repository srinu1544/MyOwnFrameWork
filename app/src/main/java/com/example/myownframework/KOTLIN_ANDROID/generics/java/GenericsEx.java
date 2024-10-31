package com.example.myownframework.KOTLIN_ANDROID.generics.java;

import java.util.ArrayList;
import java.util.List;

/* Generics in java

->  Generics in Java are a feature introduced in Java 5
->  That  allow you to define classes, interfaces, and methods with type parameters.
->  This enables code to be more flexible, reusable, and type-safe.
-> Type safety
-> Type casting problems
*/

// examples
// 1 )  Generic Classes:
//A generic class can operate on objects of various types while providing compile-time type safety.

 class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }



    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        Integer value = integerBox.getItem();

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        String text = stringBox.getItem();
}


// 2) Generic Methods:
// A generic method can be defined with a type parameter that is independent of any generic type parameters
// of the class it is defined in.

     public class Utility {
         public static <T> void printArray(T[] array) {
             for (T element : array) {
                 System.out.println(element);
             }
         }

         public static void main(String[] args) {
             Integer[] intArray = {1, 2, 3};
             String[] stringArray = {"A", "B", "C"};
             printArray(intArray);
             printArray(stringArray);
         }
     }


  // 3) Bounded Type Parameters:

   //  Bounded type parameters restrict the types that can be used as arguments for a generic type.
    //  Upper Bound

     public <T extends Number> void printDouble(T number) {
         System.out.println(number.doubleValue());
     }

     // Usage
    // printDouble(10); // Integer
    // printDouble(10.5); // Double


   //  Lower Bound:
/*
   public static void addNumbers(List<? super Integer> list) {
       list.add(10);
   }
*/

     // Usage
    // List<Number> numbers = new ArrayList<>();
    // addNumbers(numbers);

     //  4) Wildcard (?):
     // Wildcards represent an unknown type and can be used for flexibility.
     // Unbounded Wildcard
     public void printList(List<?> list) {
         for (Object item : list) {
             System.out.println(item);
         }
     }

     // Upper Bounded Wildcard:
     public void addNumbers(List<? extends Number> list) {
         // Can read numbers from the list
         Number n = list.get(0);
     }

     // Lower Bounded Wildcard
     public void addInteger(List<? super Integer> list) {
         list.add(1); // Can add Integers
     }

     //5) Generic Interfaces:
     //Just like classes, interfaces can also be generic.
     public interface Pair<K, V> {
         K getKey();
         V getValue();
     }

     public class OrderedPair<K, V> implements Pair<K, V> {
         private K key;
         private V value;

         public OrderedPair(K key, V value) {
             this.key = key;
             this.value = value;
         }

         public K getKey() { return key; }
         public V getValue() { return value; }
     }

 }


 /*Generics in Java Interview Questions
What are Generics in Java?
Answer: Generics allow you to write flexible, reusable, and type-safe code. They enable classes, interfaces, and methods to operate on different data types without compromising type safety, by enforcing type checks at compile time.

Why are Generics used in Java?
Answer: Generics are used to:
Provide compile-time type safety.
Eliminate the need for casting.
Enable code reusability.
Make the code more flexible and maintainable.

What is type erasure in Java?
Answer: Type erasure is the process by which the Java compiler removes all generic type information during compilation. This means that generic type parameters are replaced with their bounds (or Object if no bounds are specified), and casts are inserted when necessary to maintain type safety.

What is the difference between List<?> and List<Object>?
Answer: List<?> is a list of an unknown type, allowing any type of elements but limiting operations that can be performed (primarily reading). List<Object> is a list that can hold any object type, allowing any object to be added to the list.

What is the difference between ? extends T and ? super T?
Answer:? extends T: This wildcard restricts the unknown type to be a subtype of T. It's used when you want to read from a structure but not modify it.
? super T: This wildcard restricts the unknown type to be a supertype of T. It's used when you want to write to a structure but are less concerned with reading from it.

Can you create a generic array in Java?
Answer: No, you cannot directly create an instance of a generic array in Java due to type erasure. However, you can work around this limitation using a cast:

@SuppressWarnings("unchecked")
T[] array = (T[]) new Object[size];

What are the limitations of Generics in Java?
Answer:Cannot create instances of generic types.
Cannot create arrays of parameterized types.
Cannot use primitives as type parameters.
Type information is erased at runtime due to type erasure.
What is a reifiable type and a non-reifiable type?

Answer:
Reifiable Type: A type that retains its type information at runtime (e.g., int, String, List<?>).
Non-Reifiable Type: A type that does not retain its complete type information at runtime (e.g., List<T>, List<String>).
Summary
Generics are a powerful feature in Java that enables developers to write more general, type-safe, and reusable code. Understanding how to use generics, including bounded types, wildcards, and type erasure, is crucial for writing effective Java programs and is a common topic in technical interviews.*/

