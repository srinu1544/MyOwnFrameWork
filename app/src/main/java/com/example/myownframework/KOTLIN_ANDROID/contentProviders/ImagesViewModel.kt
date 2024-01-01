package com.example.myownframework.Kotlin_Android.contentProviders

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myownframework.Kotlin_Android.contentProviders.Image


class ImagesViewModel : ViewModel() {

    var images by mutableStateOf(emptyList<Image>())
    private set


    fun updateImages(images : List<Image> ) {
        this.images = images
    }
}