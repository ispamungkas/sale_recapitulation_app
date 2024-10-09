package com.example.recapitulationapps.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recapitulationapps.utils.Utils.isEmailValid
import com.example.recapitulationapps.utils.Utils.isPasswordValid

@Composable
fun TextFieldComponent(
    modifier: Modifier = Modifier,
    value: String = "",
    type: String,
    onTextChange: (String) -> Unit
) {

    var hidePassword by remember {
        mutableStateOf(true)
    }

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth(),
        value = value,
        onValueChange = onTextChange,
        singleLine = true,
        visualTransformation = (type == "Password").let {
            if (hidePassword) PasswordVisualTransformation() else VisualTransformation.None
        },
        trailingIcon = {
            if (type == "Password") {
                Icon(
                    imageVector = if (hidePassword) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = "Icon Hide",
                    modifier = Modifier.clickable { hidePassword = !hidePassword })
            }
        },
        placeholder = {
            Text(text = "Masukan $type", style = MaterialTheme.typography.bodyMedium)
        },
        label = {
            Text(text = type, style = MaterialTheme.typography.bodyMedium)
        },
        isError = isInputError(
            type = type,
            value = value
        ),
        leadingIcon = {
            SetLeadIcon(type = type)
        },
        shape = RoundedCornerShape(corner = CornerSize(size = 10.dp))
    )
}

fun isInputError(type: String, value: String): Boolean {
    when (type) {
        "Email" -> {
            return if (value.isEmailValid()) {
                true
            } else {
                false
            }
        }

        "Password" -> {
            return if (value.isPasswordValid()) {
                true
            } else {
                false
            }
        }

        else -> {
            return false
        }
    }
}

@Composable
fun SetLeadIcon(type: String) {
    when (type) {
        "Email" -> {
            return Image(
                imageVector = Icons.Default.Email,
                contentDescription = "Text Field"
            )
        }

        "Password" -> {
            return Image(
                imageVector = Icons.Default.Lock,
                contentDescription = "Text Field"
            )
        }

        else -> {
            return
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    TextFieldComponent(
        value = "Result",
        type = "Email"
    ) {

    }
}