package com.example.compsedemo.model

data class Movie (
    val title: String,
    val description: String,
)

val sampleMovies = listOf(
    Movie(title = "The Shawshank Redemption", description = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."),
    Movie(title = "The Godfather", description = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."),
    Movie(title = "The Dark Knight", description = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."),
    Movie(title = "12 Angry Men", description = "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence."),
    Movie(title = "Schindler's List", description = "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis."),
    Movie(title = "Pulp Fiction", description = "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption."),
    Movie(title = "Inception", description = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O."),
    Movie(title = "Fight Club", description = "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more."),
    Movie(title = "Forrest Gump", description = "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75."),
    Movie(title = "The Matrix", description = "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.")
)
