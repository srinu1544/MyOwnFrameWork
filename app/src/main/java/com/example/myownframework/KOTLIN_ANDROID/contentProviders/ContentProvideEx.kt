package com.example.myownframework.Kotlin_Android.contentProviders

import android.content.ContentUris
import android.net.Uri

import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.app.ActivityCompat
import coil.compose.AsyncImage
import com.example.myownframework.KOTLIN_ANDROID.contentProviders.ui.theme.MyOwnFrameWorkTheme
import java.util.Calendar


/* first take the user permission read media images */

class ContentProvideEx : ComponentActivity() {

     private val viewModel by viewModels<ImagesViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityCompat.requestPermissions(
            this,
            arrayOf(android.Manifest.permission.READ_MEDIA_IMAGES),
            0
        )


        val projection = arrayOf(
            MediaStore.Images.Media._ID,
            MediaStore.Images.Media.DISPLAY_NAME
        )

        val milliYesturday = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR , -2)
        }.timeInMillis

        val section = "${MediaStore.Images.Media.DATE_TAKEN } >= ?"
        val sectionArgs = arrayOf(milliYesturday.toString())

        val sortOrder = "${MediaStore.Images.Media.DATE_TAKEN} DESC "

        contentResolver.query(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            projection,
            section,
            sectionArgs,
            sortOrder,
        )?.use { cursor ->
                val idColumn = cursor.getColumnIndex( MediaStore.Images.Media._ID)
                val nameColumn  = cursor.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME)

                val images = mutableListOf<Image>()
                while (cursor.moveToNext()) {
                    val id = cursor.getLong(idColumn)
                    val name = cursor.getString(nameColumn)
                    val uri = ContentUris.withAppendedId(
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI,id)

                    images.add(Image(id,name,uri))
                }
            viewModel.updateImages(images)
        }

        setContent {
            MyOwnFrameWorkTheme {
                // A surface container using the 'background' color from the theme
                LazyColumn(
                    modifier = Modifier.fillMaxSize()

                ) {
                    items (viewModel.images) { image ->
                        Column(modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally) {
                          AsyncImage(model = image.uri, contentDescription = null)
                            Text(text = image.name)
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



data class Image(
    val id : Long,
    val name :  String ,
    val uri : Uri
) {}