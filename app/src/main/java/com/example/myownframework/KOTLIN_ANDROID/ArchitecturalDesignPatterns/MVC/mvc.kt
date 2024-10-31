package com.example.myownframework.Kotlin_Android.ArchitecturalDesignPatterns.MVC

/*MVC: Model-View-Controller
---------------------------
In Android, the MVC (Model-View-Controller) architecture is one of the older architectural patterns,
though it’s less common nowadays in favor of more modern patterns like MVVM or MVI. Nevertheless,
understanding MVC can be helpful as it forms the basis for understanding other architectures.
Here’s an example of how MVC might be implemented in an Android application:

1. Model
The Model represents the data layer. It handles the business logic and communication with the
database or network.

Example: A simple User class with properties like name and email, and methods to fetch user data.

data class User(val name: String, val email: String)
class UserRepository {
    fun getUser(): User {
        // This would normally fetch data from a database or network
        return User(name = "John Doe", email = "john.doe@example.com")
    }
}

2. View
The View is responsible for the UI. It displays data to the user and sends user actions to the Controller.
Example: An Activity or Fragment that displays user information.

class UserActivity : AppCompatActivity() {

   private lateinit var controller: UserController
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        controller = UserController(this)
        controller.getUserInfo()
    }

    fun displayUserInfo(user: User) {
        // Assuming there are TextViews with these IDs
        findViewById<TextView>(R.id.nameTextView).text = user.name
        findViewById<TextView>(R.id.emailTextView).text = user.email
    }
}
3. Controller
The Controller acts as an intermediary between the Model and the View. It responds to user input from the View and updates the Model or View accordingly.
Example: A UserController that handles the logic of fetching the user data and updating the View.

class UserController(private val view: UserActivity) {

    private val userRepository = UserRepository()
    fun getUserInfo() {
        val user = userRepository.getUser()
        view.displayUserInfo(user)
    }
}
How it works:
View (UserActivity) starts and creates an instance of the Controller (UserController).
The Controller requests data from the Model (UserRepository).
The Model fetches or creates the data and sends it back to the Controller.
The Controller updates the View with the data.

Advantages :
Separation of Concerns: Each component has a clear responsibility.
Reusability: The Model can be reused in different Views.

Disadvantages:
Complexity: As the application grows, the Controller can become bloated with logic.
Tight Coupling: The View and Controller are often tightly coupled, making unit testing difficult.
For modern Android development, it's recommended to use patterns like MVVM, which better separates
concerns and supports testability.*/