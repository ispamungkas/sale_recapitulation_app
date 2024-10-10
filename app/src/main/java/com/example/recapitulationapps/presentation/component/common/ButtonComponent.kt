package com.example.recapitulationapps.presentation.component.common

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recapitulationapps.presentation.component.load.LoadingIndicator

@Composable
fun ButtonComponent(modifier: Modifier = Modifier, message: String, isLoading: Boolean = false, onClick: () -> Unit) {
    val contentAlpha by animateFloatAsState(targetValue = if (isLoading) 0f else 1f)
    val loadingAlpha by animateFloatAsState(targetValue = if (isLoading) 1f else 0f)

        Button(
            modifier = modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(size = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            elevation = ButtonDefaults.buttonElevation(),
            onClick = onClick
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                LoadingIndicator(
                    modifier = Modifier.graphicsLayer(alpha = loadingAlpha),
                    animating = isLoading,
                )
                Box(
                    modifier = Modifier.graphicsLayer(alpha = contentAlpha)
                ) {
                    Text(
                        text = message, style = MaterialTheme.typography.titleMedium.copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontWeight = FontWeight.ExtraBold
                        )
                    )
                }
            }
        }
}

@Preview(
    showBackground = true
)
@Composable
fun PreviewButtonComponent(modifier: Modifier = Modifier) {
    ButtonComponent(message = "Kirim") {

    }
}