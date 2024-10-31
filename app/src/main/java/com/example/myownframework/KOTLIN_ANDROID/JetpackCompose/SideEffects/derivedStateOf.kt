package com.example.myownframework.KOTLIN_ANDROID.JetpackCompose.SideEffects

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

/*
derivedStateOf in Jetpack Compose is a function that lets you create a computed state based on other states.
 It’s specifically useful for optimizing calculations that depend on multiple state values,
 as it recalculates only when the dependent state(s) change. This optimization helps reduce
 unnecessary recompositions, making your UI more efficient and responsive.

 When to Use derivedStateOf
Expensive Calculations: When a derived value is costly to calculate and only depends on certain states, derivedStateOf helps avoid recomputing this value until necessary.
Dependent State: When you need to create a new state that depends on other states, use derivedStateOf to manage recalculations efficiently.
Reducing Recomposition: If a calculation results in a value that doesn’t change frequently, derivedStateOf ensures the recomposition happens only when it’s actually needed.



 */




@Composable
fun SearchList(items: List<String>, query: String) {
    val filteredItems by remember {
        derivedStateOf {
            items.filter { it.contains(query, ignoreCase = true) }
        }
    }

    LazyColumn {
        items(filteredItems) { item ->
            Text(item)
        }
    }
}

/*If you need to display a filtered list based on certain criteria (e.g., a search query),
derivedStateOf can optimize the recalculation of the filtered list, avoiding costly
 recompositions when unnecessary.*/