package com.example.statedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.statedemo.ui.theme.CompseDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompseDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val nameInput = remember {
                        mutableStateOf("")
                    }
                    val displayName = remember {
                        mutableStateOf("")
                    }
                    StateDemoScreen(
                        name = nameInput.value,
                        onNameChange = { nameInput.value = it },
                        onButtonClick = { nameInput.value = "" }
                    )
                }
            }
        }
    }
}

@Composable
fun StateDemoScreen(
    name: String,
    onNameChange: (String) -> Unit,
    onButtonClick: () -> Unit,
) {

    Column {
        NamedText(name)
        Row {
            NamedInputField(name, onNameChange, onButtonClick)
        }
    }

}

@Composable
fun NamedText(name: String) {
    Text(text = "이름을 입력하세요 $name")
}

@Composable
fun NamedInputField(name: String, onNameChange: (String) -> Unit, onButtonClick: () -> Unit) {
    TextField(
        value = name,
        onValueChange = onNameChange
    )
    Button(
        onClick = onButtonClick
    ) {
        Text(text = "Click")
    }
}

@Preview
@Composable
fun PreviewStateScreen() {
    //StateDemoScreen()
}