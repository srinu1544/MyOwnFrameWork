package com.example.myownframework.Kotlin_Android.Utils

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.bumptech.glide.load.resource.drawable.DrawableResource
import com.example.myownframework.R


object Utils {
    @Composable
    fun AndroidArch(id : Int) {
        Column {
            Image(painter = painterResource(id = id), contentDescription = null)
        }
    }
}


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


