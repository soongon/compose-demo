package com.example.compsedemo.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DemoViewModel: ViewModel() {
    private var _text = mutableStateOf("")

    val text: String
        get() = _text.value

    fun updateText(newText: String) {
        _text.value = newText
    }

}