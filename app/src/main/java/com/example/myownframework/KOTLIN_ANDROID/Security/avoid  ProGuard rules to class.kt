package com.example.myownframework.Kotlin_Android.Security

/* avoid proguard rules to class

in proguard-rules.pro file you can like below
in -keep class com.example.** { *; }


Use class-specific rules
-------------------------
Avoid keep rules that are too broad, such as involving wildcard matching for whole
packages. Instead, opt for class-specific rules or using the @Keep annotation.

Use the -keep option
---------------------
Using -keep instead of @Keep gives you more control over what you pre
serve and what you don't. For example, you can use the option `-keep class
MyClass { MyFieldType myField; }`.


Use your own ProGuard rules
----------------------------
When you create a new module using Android Studio, the IDE creates
 a proguard-rules.pro file in the root directory of that module.
 By default, this file does not apply any rules. You can include
 your own ProGuard rules here, such as your custom keep rules.




 */