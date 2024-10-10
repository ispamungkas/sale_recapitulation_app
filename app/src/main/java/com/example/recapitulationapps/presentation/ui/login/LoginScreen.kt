package com.example.recapitulationapps.presentation.ui.login

import androidx.compose.animation.Animatable
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recapitulationapps.R
import com.example.recapitulationapps.presentation.component.common.ButtonComponent
import com.example.recapitulationapps.presentation.component.common.TextFieldComponent
import com.example.recapitulationapps.presentation.component.load.LoadingComponent
import kotlinx.coroutines.delay

@Composable
fun LoginScreen(modifier: Modifier = Modifier, onCLick: () -> Unit) {
    var isPopupShow by remember {
        mutableStateOf(false)
    }
    var status by remember {
        mutableStateOf(false)
    }
    var isLoad by remember {
        mutableStateOf(false)
    }
    val backgroundColor = remember { Animatable(Color.Transparent) }

    LaunchedEffect(key1 = isPopupShow) {
        if (isPopupShow) {
            backgroundColor.animateTo(targetValue = Color(0x99000000), animationSpec = tween(0))
        } else {
            backgroundColor.animateTo(targetValue = Color.Transparent, animationSpec = tween(300))
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 15.dp)
            .background(color = backgroundColor.value)
    ) {
        Column(
            modifier = modifier
                .align(alignment = Alignment.Center),
        ) {
            Image(
                modifier = Modifier
                    .size(125.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.icon_app),
                contentDescription = stringResource(R.string.app_name)
            )
            Spacer(modifier = Modifier.padding(top = 34.dp))
            Text(
                modifier = Modifier.padding(vertical = 15.dp),
                text = stringResource(R.string.let_sign_you_in),
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Text(
                text = stringResource(R.string.welcome_back),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Thin
                )
            )
            Text(
                modifier = Modifier.padding(
                    bottom = 15.dp
                ),
                text = stringResource(R.string.you_have_been_missed),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Thin
                )
            )
            TextFieldComponent(
                type = "Email",
                modifier = Modifier.padding(vertical = 5.dp)
            ) {

            }
            TextFieldComponent(
                type = "Password",
                modifier = Modifier.padding(vertical = 5.dp)
            ) {

            }
            ButtonComponent(modifier = Modifier.padding(top = 15.dp) ,message = "Moving to Second Screen", isLoading = isLoad ) {
                isLoad = !isLoad
            }
        }

        AnimatedVisibility(
            modifier = Modifier.align(Alignment.BottomCenter),
            visible = isPopupShow,
            enter = slideInVertically(
                initialOffsetY = {
                    it
                },
                animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)
            ),
            exit = slideOutVertically(
                animationSpec = tween(
                    300,
                    easing = FastOutLinearInEasing
                )
            )
        ) {
            if (!status) {
                LoadingComponent(status = status)
                LaunchedEffect(key1 = status) {
                    delay(3000)
                    status = true
                }
            } else {
                LoadingComponent(status = status)
                LaunchedEffect(key1 = status) {
                    delay(3000)
                    isPopupShow = false
                }
            }

        }
    }
}

@Preview(
    showBackground = true,
    device = "id:pixel_5"
)
@Composable
fun LoginScreenPreview(modifier: Modifier = Modifier) {
    LoginScreen {}
}