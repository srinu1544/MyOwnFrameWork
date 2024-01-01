package com.example.myownframework.Kotlin_Android.Differences

/*By the official definitions,

View binding allows us to more easily write code that interacts with views.
Once view binding is enabled in a module, it generates a binding class for each XML layout
file present in that module. An instance of a binding class contains direct references to all
views that have an ID in the corresponding layout.

The Data Binding Library is a support library that allows you to bind UI components in your
layouts to data sources in your app using a declarative format rather than programmatically.

Differences View Binding and Data Binding

View Binding library is faster than Data Binding library as it is not utilising annotation
processors underneath, and when it comes to compile time speed View Binding is more efficient.

The one and only function of View Binding is to bind the views in the code. While Data Binding
offers some more options like Binding Expressions, which allows us to write expressions the
connect variables to the views in the layout.

Data Binding library works with Observable Data objects, you don't have to worry about refreshing
the UI when underlying data changes.

Data Binding library provides us with Binding Adapters.

Data Binding library provides us with Two way Data Binding, this is a technique of binding your
 objects to xml layouts, so that both object and layout can send data to each other.*/