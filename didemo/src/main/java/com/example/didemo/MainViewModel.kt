package com.example.didemo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apidemo.model.Movie
import com.example.apidemo.model.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val movieRepository: MovieRepository
): ViewModel() {

    var movies: List<Movie> by mutableStateOf(emptyList())

    init {
        viewModelScope.launch {
            val movieResponse = movieRepository.getNowPlayingMovies()
            movies = movieResponse.results
        }
    }
}