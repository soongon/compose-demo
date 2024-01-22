package com.example.apidemo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apidemo.model.Movie
import com.example.apidemo.model.MovieRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val movieRepository: MovieRepository = MovieRepository()
): ViewModel() {

    var movies: List<Movie> by mutableStateOf(emptyList())

    init {
        viewModelScope.launch {
            val movieResponse = movieRepository.getNowPlayingMovies()
            movies = movieResponse.results
        }
    }

}