package com.example.intentapp.workmanager

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.File
import kotlin.math.roundToInt


/* we won't directly initialize this call on our own that is what android system will do.
That is why it also needs this extra parameter(Context & WorkerParameters) here .
 */
class PhotoCompressionWorker(
    private val appContext: Context,
    private val params: WorkerParameters
) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        return withContext(Dispatchers.IO){
            val stringUri = params.inputData.getString(KEY_CONTENT_URI)
            val compressionTresholdInBytes = params.inputData.getLong(
                KEY_COMPRESSION_THRESHOLD,
                0L
            )
            val uri = Uri.parse(stringUri)
            val bytes = appContext.contentResolver.openInputStream(uri)?.use{
                it.readBytes()
            } ?: return@withContext Result.failure()
            // bitmap is image object that we use in android.
            val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)

            var outputBytes: ByteArray
            var quality = 100
            do{
                val outputStream = ByteArrayOutputStream()
                outputStream.use{outputStream ->
                    bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream)
                    outputBytes = outputStream.toByteArray()
                    quality -= (quality * 0.1).roundToInt()
                }
            }while(outputBytes.size > compressionTresholdInBytes && quality > 5)

            val file = File(appContext.cacheDir, "${params.id}.jpg")
            file.writeBytes(outputBytes)

            Result.success(
                workDataOf(
                    KEY_RESULT_PATH to file.absolutePath
                )
            )
        }
    }


    companion object{
        const val KEY_CONTENT_URI = "KEY_CONTENT_URI"
        const val KEY_COMPRESSION_THRESHOLD = "KEY_COMPRESSION_THRESHOLD"
        const val KEY_RESULT_PATH = "KEY_RESULT_PATH"
    }
}