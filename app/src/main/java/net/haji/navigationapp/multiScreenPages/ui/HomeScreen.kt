package net.haji.navigationapp.multiScreenPages.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier, navController : NavHostController) {
    Column {
        Text(text = "Hello the worlds, screen 1")
        Button(
            onClick = {navController.navigate("screen2")}
        ) {
            Text(text = "See friends list")
        }
    }
}