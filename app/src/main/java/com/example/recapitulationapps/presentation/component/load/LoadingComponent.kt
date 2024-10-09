package com.example.recapitulationapps.presentation.component.load

import android.os.Build.VERSION.SDK_INT
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Dimension
import coil.size.Size
import com.example.recapitulationapps.R

@Composable
fun LoadingComponent(modifier: Modifier = Modifier, status: Boolean = false) {

    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()

    Card (
        colors = CardColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContentColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = MaterialTheme.colorScheme.onPrimary
        ),
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = if (status) "Berhasil" else stringResource(id = R.string.loading),
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )
            Image(
                painter = rememberAsyncImagePainter(model = ImageRequest.Builder(context).data(data = if (status) R.drawable.loading_icon else R.drawable.success_icon ).apply {
                    size(size = Size.ORIGINAL.copy(
                        width = Dimension(px = 100)
                    ))
                }.build() , imageLoader = imageLoader),
                contentDescription = "Loading Gif"
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    LoadingComponent()
}