package com.example.myownframework.Kotlin_Android.Scope_Functions

/*https://www.geeksforgeeks.org/kotlin-scope-function/

-> Scope functions in Kotlin are a set of functions that allow you to
execute a block of code within the context of an object

They provide a temporary scope when you call the function on the object with a
lambda expression. In this scope, the function can access the object without its name.


// let
val name: String? = "John Doe"

name?.let {
  println("Hello, $it!")
}

// run
val user = User("John Doe", 30)

user.run {
  println("Name: $name")
  println("Age: $age")
}

// with
val user = User("John Doe", 30)

with(user) {
  println("Name: $name")
  println("Age: $age")
}

// apply
val user = User("John Doe", 30)

user.apply {
  name = "Jane Doe"
  age = 31
}

println("Name: ${user.name}")
println("Age: ${user.age}")

// also
val user = User("John Doe", 30)

user.also {
  println("Name: ${it.name}")
  println("Age: ${it.age}")
}






 */