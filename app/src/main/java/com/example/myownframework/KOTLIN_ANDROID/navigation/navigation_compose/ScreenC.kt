package com.example.myownframework.Kotlin_Android.Navigation.navigation_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ScreenC(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "scteen C", fontSize = 64.sp)
        Spacer(modifier = Modifier.height(65.dp))
        Button(onClick = { navController.navigate("A") {popUpTo("A") {inclusive = true} } }) {
            Text(text = "Go to screen A", fontSize = 40.sp)
        }
    }

}