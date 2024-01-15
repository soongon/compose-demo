package com.example.compsedemo.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compsedemo.model.sampleMovies
import com.example.compsedemo.ui.theme.CompseDemoTheme

@Composable
fun MovieItem(title: String, description: String) {
    Card(
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 6.dp)
            .wrapContentHeight(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            MovieThumbnail(
                thumbnails = Icons.Filled.Favorite,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(CircleShape),

            )
            Spacer(modifier = Modifier.width(16.dp))
            MovieDetails(
                title = title,
                description = description,
                modifier = Modifier

            )
        }
    }
}

@Composable
private fun MovieDetails(title: String, description: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun MovieThumbnail(thumbnails: ImageVector, modifier: Modifier) {
    Icon(
        imageVector = thumbnails,
        contentDescription = "",
        modifier = modifier,

    )
}

@Preview(
    showBackground = true,
    widthDp = 450,
    heightDp = 975,
)
@Composable
fun PreviewMovieItem() {
    CompseDemoTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            MovieItem(sampleMovies[0].title, sampleMovies[0].description)
        }
    }
}