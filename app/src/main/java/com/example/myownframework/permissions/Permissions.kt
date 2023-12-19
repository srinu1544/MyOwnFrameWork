package com.example.myownframework.permissions

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.camera.core.CameraX
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.myownframework.permissions.ui.theme.MyOwnFrameWorkTheme

class permissions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!hasRequiredPermissons()){
            ActivityCompat.requestPermissions(this, CAMERAX_PERMISSIONS,0)
        }
        setContent {
            MyOwnFrameWorkTheme {

            }
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


@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    MyOwnFrameWorkTheme {
        Greeting4("Android")
    }
}