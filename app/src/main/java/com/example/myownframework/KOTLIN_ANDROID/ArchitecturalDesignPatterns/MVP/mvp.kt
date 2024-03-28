package com.example.myownframework.Kotlin_Android.ArchitecturalDesignPatterns.MVP

/*MVP: Model-View-Presenter
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
introduced and clean code needs to be maintained.*/