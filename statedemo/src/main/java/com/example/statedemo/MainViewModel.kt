package com.example.statedemo

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _nameInput = mutableStateOf("")

    val nameInput: State<String> get() = _nameInput

    fun setNameInput(newName: String) {
        _nameInput.value = newName
    }


}