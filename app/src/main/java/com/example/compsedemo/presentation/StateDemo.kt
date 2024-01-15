package com.example.compsedemo.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StateDemo(viewModel: DemoViewModel) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = viewModel.text)
        Spacer(modifier = Modifier.height(20.dp))
        TextField(value = viewModel.text, onValueChange = {
            viewModel.updateText(it)
        })
        Spacer(modifier = Modifier.height(20.dp))
    }
}
