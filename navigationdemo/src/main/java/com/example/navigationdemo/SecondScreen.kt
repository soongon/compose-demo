package com.example.navigationdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationdemo.ui.theme.CompseDemoTheme


@Composable
fun SecondScreen(navController: NavController, backStackEntry: NavBackStackEntry? = null) {
    val url = backStackEntry?.arguments?.getString("url")

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Second Screen $url",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            navController.navigate(Screen.Last.route)
        }) {
            Text(text = "Go to Last")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSecondScreen() {
    CompseDemoTheme {
        val mockNavController = rememberNavController()
        SecondScreen(mockNavController)
    }
}