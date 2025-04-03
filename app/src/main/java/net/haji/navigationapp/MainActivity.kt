package net.haji.navigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.haji.navigationapp.multiScreenPages.ui.HomeScreen
import net.haji.navigationapp.multiScreenPages.ui.Routes
import net.haji.navigationapp.multiScreenPages.ui.Screen1
import net.haji.navigationapp.multiScreenPages.ui.Screen2
import net.haji.navigationapp.multiScreenPages.ui.Screen3
import net.haji.navigationapp.ui.theme.NavigationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Routes.homeScreen, builder = {
                composable(Routes.homeScreen) {
                    HomeScreen(name = "Home", navController = navController)
                }
                composable(Routes.screen1) {
                    Screen1(name = "Screen 1", navController = navController)
                }
                composable(Routes.screen2) {
                    Screen2(name = "Screen 2", navController = navController)
                }
                composable(Routes.screen3) {
                    Screen3(name = "Screen 3", navController = navController)
                }
            })

        }
    }
}

