package com.example.myownframework.Kotlin_Android.ContentProviders

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class ImagesViewModel : ViewModel() {

    var images by mutableStateOf(emptyList<Image>())
    private set


    fun updateImages(images : List<Image> ) {
        this.images = images
    }
}