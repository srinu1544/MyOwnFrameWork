package com.example.myownframework.Kotlin_Android.Navigation.navigation_compose

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@SuppressLint("SuspiciousIndentation")
@Composable
fun Nav() {

  val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A"){

        composable(route = "A") {
            ScreenA(navController)
        }

        composable(route = "B/{id}" , arguments = listOf(navArgument("id"){
            type = NavType.StringType
        })){

            it.arguments?.getString("id")?.let { it1 -> Log.d("Args", it1) }
            ScreenB(navController)

        }

        composable(route = "C"){
            ScreenC(navController)
        }

    }
}