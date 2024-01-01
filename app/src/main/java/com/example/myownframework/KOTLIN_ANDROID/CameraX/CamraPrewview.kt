package com.example.myownframework.KOTLIN_ANDROID.CameraX

import androidx.camera.view.LifecycleCameraController
import androidx.camera.view.PreviewView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun cameraPrewView(controller : LifecycleCameraController,
                   modifier : Modifier= Modifier )  {
    val lifecycleOwner = LocalLifecycleOwner.current
    AndroidView(factory = {PreviewView(it).apply {
        this.controller = controller
        controller.bindToLifecycle(lifecycleOwner)
    }},
        modifier = Modifier)

}
