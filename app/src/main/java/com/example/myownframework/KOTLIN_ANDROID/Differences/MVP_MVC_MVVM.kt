package com.example.myownframework.Kotlin_Android.Differences

/*


MVC: Model-View-Controller
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
MVC can be more complex and hard to understand in terms of complexity and updates.



MVP: Model-View-Presenter
-------------------------
The presenter and the view have a one-to-one relationship. The presenter takes care of
reading/writing the data and passing the data to the View.

As the name suggests, MVP contains a total of 3 components. Model, View, and Presenter.
You can use the MVP architecture to overcome the limitations of MVC architecture. For example,
in MVC, code becomes more tightly coupled, which reduces the code’s testability and makes it
harder to refactor and change.

1. Model:
The model will continue to contain the data in simple classes, so nothing changes here.

2. View
The view is the same component we use in the MVC architecture, representing all UI-related parts
like Activity, Fragment, etc.

3. Presenter
The presenter holds all the business logic related to the particular screen or activity.
It emits the event or callback to the View class based on the changes in the data of different
model classes.

Unlike MVC, MVP uses interfaces to communicate between the presenter and view class which helps
to improve the code readability. Also, improve the modularity and testability of the code.
Generally, we can use the MVP in a large-scale project where continuous new features are
introduced and clean code needs to be maintained.



MVVM: Model-View-ViewModel
--------------------------
Allows mapping multiple views with the single view mode. The View depends on the
ViewModel, which in turns depends on the Model.


As the name suggests, MVP contains a total of 3 components. Model, View, and ViewModel.
Like many other architectures patterns, MVVM helps organize code and break programs into
modules to make code development, updating, and reuse simpler and faster. MVVM uses the
reactive programming model for lesser code.

1. Model:
The Model contains the logic for the program, which the ViewModel retrieves upon receiving
input from the user through View.

2. View
It represents the application’s user interface without any application logic.
It keeps track of the ViewModel.

3. ViewModel
The Model and the View are connected. It is in charge of changing the data from the Model.
View receives data streams from it. The View is updated via hooks or callbacks and requests
data from the Model.

As compared to the MVP, MVVM contains the observable as no presenter is available. Because of
this, MVVM creates loosely coupled code which helps to do unit testing more easily. MVVM has
less interface also as compared to MVP or MVC architecture. MVVM works as follows.
The ViewModel sits below the UI layer. It exposes the data and command objects needed to View.
You could think of this as a container object that the View goes to get its data and actions.
It pulls data from the Model.



*/