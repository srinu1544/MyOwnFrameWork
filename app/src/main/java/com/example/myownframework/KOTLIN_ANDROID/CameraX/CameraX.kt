package com.example.myownframework.Kotlin_Android.CameraX

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.example.myownframework.KOTLIN_ANDROID.CameraX.ui.theme.MyOwnFrameWorkTheme


class CameraX : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkCameraPermission()
        setContent {
            MyOwnFrameWorkTheme {
                Box(

                ) {
                    val lifecycleOwner = LocalContext.current as LifecycleOwner

                    val controller = remember {
                        LifecycleCameraController(applicationContext)
                    }
                    com.example.myownframework.KOTLIN_ANDROID.CameraX.cameraPrewView(
                        controller = controller, modifier = Modifier
                            .fillMaxSize()
                    )
                }



                // A surface container using the 'background' color from the theme


            }
        }
    }



    private fun checkCameraPermission(){
        if (!hasRequiredPermissons()){
            ActivityCompat.requestPermissions(this,
                CAMERAX_PERMISSIONS,0)
        }
    }

    private fun hasRequiredPermissons() : Boolean {
        return CAMERAX_PERMISSIONS.all {
            ContextCompat.checkSelfPermission(
                applicationContext,it) == PackageManager.PERMISSION_GRANTED
        }
    }

    companion object{
        private val CAMERAX_PERMISSIONS = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
        )
    }


}
