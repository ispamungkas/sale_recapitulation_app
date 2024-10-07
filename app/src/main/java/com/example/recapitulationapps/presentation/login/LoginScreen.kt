import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(modifier: Modifier = Modifier, onCLick: () -> Unit) {
    Column(modifier = modifier) {
        Text("halos")
        Button(onClick = onCLick) {
            Text("Move")
        }
    }
}