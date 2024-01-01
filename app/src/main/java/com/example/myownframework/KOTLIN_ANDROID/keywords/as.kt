package com.example.myownframework.Kotlin_Android.keywords

/*
as:
---
 Used for type casting.

*/

val value: Any = 10
val stringValue = value as String // Casts value to String (may throw exception)


/*as?:
------
Used for safe type casting with null check.*/

val maybeString: Any? = null
val safeStringValue = maybeString as? String // Returns null if casting fails