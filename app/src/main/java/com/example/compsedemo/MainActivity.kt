package com.example.compsedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compsedemo.presentation.MovieScreen
import com.example.compsedemo.ui.theme.CompseDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //val demoViewModel = viewModel<DemoViewModel>()
            val mainViewModel = viewModel<MainViewModel>()
            //val movies: List<Movie> = sampleMovies;
            //val mainViewModel = viewModel<MainViewModel>()

            CompseDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    //ViewModelDemoScreen(mainViewModel)
                        //StateDemo(demoViewModel)
                    MovieScreen(mainViewModel.getMovies())

                }
            }
        }
    }
}