package com.example.practiceapp.Kotlin_Android.jetpack_components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.practiceapp.R


/*
Architecture
-------------
data binding
lifecycle
livedata
navigation
paging
room
viewmodel
workmanager

foundation
----------
AppCompact
Android KTX
multidex
Test

Ui
--
animation & Transitions
Auto, Tv & Wear
Emoji
Fragment
Layout
Palette

Behaviour
----------
Download manager
media & playback
permissions
Notifications
Sharing
slices




*/

@Preview
@Composable
fun AndroidJetpack(){

    Image(painter = painterResource(id = R.drawable.jetpack_libries), contentDescription = null)
}