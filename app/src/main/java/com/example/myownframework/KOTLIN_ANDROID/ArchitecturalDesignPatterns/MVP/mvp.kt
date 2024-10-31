package com.example.myownframework.Kotlin_Android.ArchitecturalDesignPatterns.MVP

/*MVP: Model-View-Presenter
---------------------------
Initialization:
 The View (e.g., UserActivity) initializes the Presenter and passes itself to the Presenter.
The View is responsible for creating the Presenter and passing it any necessary dependencies like the UserRepository.

Data Flow:
When the View needs to display data (e.g., when the UserActivity is created), it calls a method in the
Presenter (e.g., loadUser). The Presenter then interacts with the Model (e.g., UserRepository) to fetch the required data.

Update UI:
Once the Presenter has the data, it updates the View through methods like showUser().
The View then updates the UI elements with this data.

Handle User Actions:
If the user interacts with the UI (e.g., clicks a button), the View informs the Presenter of this action.
The Presenter then processes the action, updates the Model if necessary, and updates the View with any changes.

Advantages :
Separation of Concerns: Each component has a clear responsibility, making the code more organized.
Testability: Since the Presenter doesn’t depend on Android framework components, it can be easily unit tested.
Reusability: The same Presenter can be used across different Views if they share similar logic.

Disadvantages :

Boilerplate Code: MVP often involves writing a lot of boilerplate code, especially when defining interfaces for each View.
Presenter Bloat: If not managed well, the Presenter can become too large and complex, as it handles both UI logic and business logic.
Manual Binding: The View-Presenter binding has to be done manually, which can lead to errors if not handled carefully.

Summary :
MVP in Android helps in creating a clean separation of concerns, leading to more maintainable and testable code.
While it requires more setup and can lead to some boilerplate code, it is beneficial for applications with
complex UIs or business logic. However, for modern Android development, many developers prefer using MVVM
(Model-View-ViewModel), which is more aligned with the Android architecture components and reduces some of
 the drawbacks of MVP.*/