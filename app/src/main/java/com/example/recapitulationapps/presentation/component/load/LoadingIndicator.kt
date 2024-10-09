package com.example.recapitulationapps.presentation.component.load

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private const val IndicatorSize = 12f
private const val AnimateDurationMillis = 300
private const val AnimateDelayDurationMillis = AnimateDurationMillis / 3

@Composable
fun LoadingIndicator(
    modifier: Modifier = Modifier,
    animating: Boolean = false,
    color: Color = MaterialTheme.colorScheme.onPrimary,
    indicatorSpacing: Dp = 5.dp
) {

    val animateValue = List(size = 3) { index ->
        var animatedValue by remember { mutableStateOf(0f) }
        LaunchedEffect(key1 = animating) {
            if (animating) {
                animate(
                    initialValue = IndicatorSize / 2,
                    targetValue = IndicatorSize / 2,
                    animationSpec = infiniteRepeatable(
                        animation = tween(durationMillis = AnimateDurationMillis),
                        repeatMode = RepeatMode.Reverse,
                        initialStartOffset = StartOffset(
                            AnimateDelayDurationMillis * index
                        )
                    )
                ) { value, _ ->
                    animatedValue = value
                }
            }
        }
        animatedValue
    }
    Row(
        modifier = modifier
    ) {
        animateValue.forEach { value ->
            LoadingDot(
                modifier = Modifier
                    .padding(horizontal = indicatorSpacing)
                    .width(width = 10.dp)
                    .aspectRatio(ratio = 1f)
                    .offset(y = value.dp),
                color = color
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Pr(modifier: Modifier = Modifier) {
    LoadingIndicator()
}