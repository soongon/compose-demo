package com.example.compsedemo.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compsedemo.model.Movie
import com.example.compsedemo.model.sampleMovies
import com.example.compsedemo.ui.theme.CompseDemoTheme

@Composable
fun MovieScreen(movies: List<Movie>) {
    MovieItemList(movies)
}

@Composable
fun MovieItemList(movies: List<Movie>) {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 6.dp
        )
    ) {
        items(movies) { movie ->
            MovieItem(title = movie.title, description = movie.description)
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 450,
    heightDp = 975,
)
@Composable
fun PreviewMovieItemList() {
    CompseDemoTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            MovieItemList(sampleMovies)
        }
    }
}