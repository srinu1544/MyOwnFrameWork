package com.example.myownframework.CameraX

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.example.myownframework.CameraX.ui.theme.MyOwnFrameWorkTheme
import com.example.myownframework.permissions.permissions
import com.google.android.material.bottomsheet.BottomSheetBehavior

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
                    cameraPrewView(controller = controller,  modifier = Modifier
                        .fillMaxSize())
                }



                // A surface container using the 'background' color from the theme


            }
        }
    }



    private fun checkCameraPermission(){
        if (!hasRequiredPermissons()){
            ActivityCompat.requestPermissions(this, CAMERAX_PERMISSIONS,0)
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
