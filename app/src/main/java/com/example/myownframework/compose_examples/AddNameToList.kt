package com.example.myownframework.compose_examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddNameEx(){

    var name by remember {
        mutableStateOf("")
    }

    var names by remember {
        mutableStateOf(listOf<String>(""))
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
      ) {
      Row(modifier = Modifier.fillMaxWidth()) {

          OutlinedTextField(
              value = name,
              onValueChange = { text -> name = text},
              modifier = Modifier.weight(1f)
              )
          
          Spacer(modifier = Modifier.width(16.dp))

          Button(onClick = {
              if (name.isNotBlank()){
                  names = names + name
              }}) {

              Text(text = "ADD")

          }
          
          LazyColumn{
              items(names) { currentName ->
               Text(
                   text = currentName, color = Color.Red,
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(16.dp)
               )
                Divider()

              }
          }

      }
    }
}
