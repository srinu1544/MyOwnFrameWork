package com.example.myownframework.Kotlin_Android.utils

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.R


// for stating a activity
fun <A : Activity> Activity.startNewActivity(activity: Class<A>){
     Intent(this,activity).also{
         it.flags = Intent.FLAG_ACTIVITY_NEW_TASK
         startActivity(it)
     }
}


//if visible invisible a view
fun View.visible(isVisible : Boolean){
    visibility = if (isVisible) View.VISIBLE else View.GONE
 }


