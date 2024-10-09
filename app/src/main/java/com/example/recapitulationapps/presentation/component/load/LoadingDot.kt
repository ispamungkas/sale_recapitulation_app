package com.example.recapitulationapps.presentation.component.load

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

@Composable
fun LoadingDot(color: Color, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(shape = CircleShape)
            .background(color)
    ) {

    }
}