package com.example.apidemo.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRepository {

    private val movieApiService: MovieApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        movieApiService = retrofit.create(MovieApi::class.java)
    }

    suspend fun getNowPlayingMovies(): MovieResponse {
        return movieApiService.getNowPlayingMovies()
    }
}