package com.example.intentapp.contentprovider

import android.Manifest
import android.content.ContentUris
import android.icu.util.Calendar
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.app.ActivityCompat
import coil.compose.AsyncImage
import com.example.intentapp.ui.theme.IntentAppTheme

class ContentProvidersActivity : ComponentActivity() {
    private val viewModel by viewModels<ImageViewModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.READ_MEDIA_IMAGES, Manifest.permission.READ_EXTERNAL_STORAGE),
            0
        )

        val millisYesterday = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, -1)
        }.timeInMillis

        val projection = arrayOf(
            MediaStore.Images.Media._ID,
            MediaStore.Images.Media.DISPLAY_NAME,
        )

        val selection = "${MediaStore.Images.Media.DATE_TAKEN} >= ?"
        val selectionArgs = arrayOf(millisYesterday.toString())
        val sortOrder = "${MediaStore.Images.Media.DISPLAY_NAME} DESC"

        contentResolver.query(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            projection,
            null,
            null,
            sortOrder
        )?.use {cursor ->
            Log.i("contentProviders", "Number of images found: ${cursor.count}")
            val idColumn = cursor.getColumnIndex(MediaStore.Images.Media._ID)
            val nameColumn = cursor.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME)

            val images = mutableListOf<Image>()
            while(cursor.moveToNext()){
                val id = cursor.getLong(idColumn)
                val name = cursor.getString(nameColumn)
                val uri = ContentUris.withAppendedId(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    id
                )

                images.add(Image(id, name, uri))
            }
            Log.i("contentProviders", images.size.toString())
            viewModel.updateImages(images)
        }

        enableEdgeToEdge()
        setContent {
            IntentAppTheme {
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(viewModel.images){image ->
                        Column (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            AsyncImage(
                                model = image.uri,
                                contentDescription = null
                            )
                            Text(text = image.name)
                        }
                    }
                }
            }
        }
    }
}

data class Image(
    val id: Long,
    val name: String,
    val uri: Uri
)
