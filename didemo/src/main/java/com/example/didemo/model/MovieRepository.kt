package com.example.apidemo.model

class MovieRepository(
    private val movieApiService: MovieApi
) {

    suspend fun getNowPlayingMovies(): MovieResponse {
        return movieApiService.getNowPlayingMovies()
    }
}
