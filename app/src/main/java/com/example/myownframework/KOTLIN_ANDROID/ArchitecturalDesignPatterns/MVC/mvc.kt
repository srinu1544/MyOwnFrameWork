package com.example.myownframework.Kotlin_Android.ArchitecturalDesignPatterns.MVC

/*MVC: Model-View-Controller
---------------------------
The controller and the view component have a one-to-many relationship.
As the name suggests, MVC contains 3 components. Model, View, and Controller.

MVC separates the application logic.

1. Model:
The model represents the data classes that hold data from the controller or view. It also
handles different data manipulation methods that are required for business logic.

2. View
The view is the UI representation classes that face the users and handle interactions
with the XML, Activity, and Fragments. It also makes requests to the controller class upon
the different user interactions.

3. Controller
The controller is responsible for handling the incoming request from the view class,
performing operations on the model classes, and passing them back to the view class for
the user. Mostly controller contains the API call logic and other calculations.

The view handles all the presentation, and the controller tells the model and view what to
perform. MVC codes are easy to maintain and can be used for small-scale applications.
MVC can be more complex and hard to understand in terms of complexity and updates.*/