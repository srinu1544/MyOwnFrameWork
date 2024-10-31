package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/*
DisposableEffect is a side-effect API in Jetpack Compose designed for managing resources
or performing setup and cleanup operations when a composable enters or exits the composition.
This makes it ideal for tasks that require both initialization and cleanup, such as setting up
listeners, subscribing to data streams, or managing hardware resources like sensors.



*/

@Composable
fun BatteryLevelListener(context: Context) {
    DisposableEffect(Unit) {
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                // Handle battery level changes here
            }
        }
        context.registerReceiver(receiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

        onDispose {
            context.unregisterReceiver(receiver)
        }
    }
}

/*example 2 */


@Composable
fun DataListener(dataFlow: Flow<String>) {
    DisposableEffect(dataFlow) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            dataFlow.collect { data ->
                // Handle new data here
            }
        }

        onDispose {
            job.cancel() // Cancel the coroutine when composable leaves
        }
    }
}

