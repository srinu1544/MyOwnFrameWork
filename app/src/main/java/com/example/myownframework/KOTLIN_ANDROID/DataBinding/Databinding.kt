package com.example.myownframework.Kotlin_Android.DataBinding

/*


example in MyOwnFrameWork project

Data Binding is a library in Android that allows you to bind UI components in your layout files
directly to data sources in your app. It allows you to bind layouts and UI components to data
sources declaratively.

Data Binding offers some more options like:
Binding Expressions, which allows you to write expressions the connect variables to the views in the
layout
<data>, a container for variables used inside the layout file
To convert a layout to Data Binding, you need to:
Wrap the root element in a <layout> tag
Move the namespace definitions (the attributes that start with xmlns: ) to the new root element
You can initialize binding in Kotlin by:
Passing the MyBinding. bind function reference to your delegate
Initializing the View's binding using that function
Clearing this binding value when the views are destroyed

Two types of data binding :

Two-way data binding is a technique that binds objects to XML layouts.
This allows the layout to send data to the binding object. In a traditional or one-way data
binding setup, data only moves from the binding object to the layout.

Two-way data binding updates the data source if there are any changes in the layout,
and vice versa. This is different from one-way binding, where you only access data from
the data source and update the layout.

You can use two-way data binding to:
Bind objects to XML layouts
Update both the component and the view at the same time
Listen for events and display updated data
Share data between components in your application
You can watch videos about two-way data binding in Android on YouTube


*/