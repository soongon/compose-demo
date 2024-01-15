package com.example.compsedemo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.compsedemo.model.Movie
import com.example.compsedemo.model.sampleMovies

class MainViewModel: ViewModel() {

    //var count by mutableStateOf(0)
    val movies by mutableStateOf(sampleMovies)

    fun getMovies(): List<Movie> {
        return movies
    }
}