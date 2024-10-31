package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*SnapshotFlow is a function in Jetpack Compose that converts Compose State into a Kotlin Flow.
This is useful when you need to observe a changing state in a composable and respond to
those changes in a flow-based manner, such as launching side effects, collecting data updates,
or working with coroutines. It bridges Jetpack Compose’s state management and Kotlin’s Flow API
*/


@Composable
fun ScrollObserverExample() {
    val scrollState = rememberLazyListState()

    LaunchedEffect(Unit) {
        snapshotFlow { scrollState.firstVisibleItemIndex }
            .collect { index ->
                if (index > 10) {
                    // Perform an action when scrolled past the 10th item
                    println("Scrolled past item 10!")
                }
            }
    }

    LazyColumn(state = scrollState) {
        items(100) { index ->
            Text("Item #$index", modifier = Modifier.padding(16.dp))
        }
    }
}

/*In this example:
snapshotFlow { scrollState.firstVisibleItemIndex } converts the firstVisibleItemIndex
of the LazyListState into a Flow.

The Flow emits whenever the firstVisibleItemIndex changes, allowing you to respond to scroll
events without triggering recomposition for every item.


Use Cases for SnapshotFlow
Scroll and Gesture Observers: When you need to react to UI gestures, scroll events, or any state changes without causing frequent recompositions.
Asynchronous Data Collection: For collecting data updates or changes in state in a coroutine-based manner, which might trigger a network call, analytics event, or some other operation.
Complex State Transitions: When dealing with UI states where transitions between states are important, SnapshotFlow can help manage these changes in a Flow-based reactive way.



*/
