package com.example.myownframework.Kotlin_Android.multiple_back_stack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myownframework.KOTLIN_ANDROID.multiple_back_stack.ui.theme.MyOwnFrameWorkTheme


class MultipleBackStack : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyOwnFrameWorkTheme {
                val rootNavController = rememberNavController()
                val navBackStackEntry by rootNavController.currentBackStackEntryAsState()
                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            items.forEach { item ->
                                val isSelected = item.title.lowercase() ==
                                        navBackStackEntry?.destination?.route
                                NavigationBarItem(
                                    selected = isSelected,
                                    label = {
                                        Text(text = item.title)
                                    },
                                    icon = {
                                        Icon(
                                            imageVector = if (isSelected) {
                                                item.selectedIcon
                                            } else item.unselectedIcon,
                                            contentDescription = item.title
                                        )
                                    },
                                    onClick = {
                                        rootNavController.navigate(item.title.lowercase()) {
                                            popUpTo(rootNavController.graph.findStartDestination().id) {
                                                saveState = true
                                            }
                                            launchSingleTop = true
                                            restoreState = true
                                        }
                                    }
                                )
                            }
                        }
                    }
                ) { padding ->
                    NavHost(rootNavController, startDestination = "home") {
                        composable("home") {
                            HomeNavHost()
                        }
                        composable("chat") {
                            ChatNavHost()
                        }
                        composable("settings") {
                            SettingNavHost()
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun HomeNavHost() {
        val homeNavControl = rememberNavController()
        NavHost(homeNavControl, startDestination = "Home1") {
            for (i in 1..10) {
                composable("home$i") {
                    GenericScreen(text = "Home$i", onNextClick = {
                        if (i < 10) {
                            homeNavControl.navigate("home${i + 1}")
                        }
                    })
                }
            }
        }
    }

    @Composable
    fun ChatNavHost() {
        val chatNavControl = rememberNavController()
        NavHost(chatNavControl, startDestination = "chat1") {
            for (i in 1..10) {
                composable("chat$i") {
                    GenericScreen(text = "Chat$i", onNextClick = {
                        if (i < 10) {
                            chatNavControl.navigate("chat${i + 1}")
                        }
                    })
                }
            }
        }
    }

    @Composable
    fun SettingNavHost() {
        val settingNavControl = rememberNavController()
        NavHost(settingNavControl, startDestination = "setting1") {
            for (i in 1..10) {
                composable("setting$i") {
                    GenericScreen(text = "Setting$i", onNextClick = {
                        if (i < 10) {
                            settingNavControl.navigate("setting${i + 1}")
                        }
                    })
                }
            }
        }
    }

    @Composable
    fun GenericScreen(
        text: String,
        onNextClick: () -> Unit
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(text = text)
            Spacer(Modifier.height(16.dp))
            Button(onClick = onNextClick) {
                Text(text = "Next")
            }

        }

    }

    data class BottomNavigationItem(
        val title: String, val unselectedIcon: ImageVector,
        val selectedIcon: ImageVector
    )


    val items = listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home
        ),

        BottomNavigationItem(
            title = "Chat",
            selectedIcon = Icons.Filled.Email,
            unselectedIcon = Icons.Outlined.Email
        ),

        BottomNavigationItem(
            title = "Settings",
            selectedIcon = Icons.Filled.Settings,
            unselectedIcon = Icons.Outlined.Settings
        )

    )
}


