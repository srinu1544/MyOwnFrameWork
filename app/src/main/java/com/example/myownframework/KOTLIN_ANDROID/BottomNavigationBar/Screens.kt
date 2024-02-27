package com.example.myownframework.kotlin_Android.bottomNavBar



sealed class Screens(val route : String) {
    object Home : Screens("home_route")
    object Chat : Screens("Chat_route")
    object Settings : Screens("Settings_route")
}
