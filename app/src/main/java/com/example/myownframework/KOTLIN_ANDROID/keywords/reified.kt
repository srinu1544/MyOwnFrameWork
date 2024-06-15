package com.example.myownframework.Kotlin_Android.Keywords

/*The reified keyword in Kotlin is used to access the type information of a generic
 parameter at runtime. This is useful when you need to perform type-safe operations
  on generic types, such as checking the type of a parameter or creating an instance
  of a generic class.

The reified keyword can only be used with inline functions. When you mark a
function as inline, the compiler copies the function's bytecode to every call site,
 which allows the function to access the type information of its parameters at runtime.

 inline fun <reified T> printType(value: T) {
  println(T::class.java.simpleName)
}


 */