package br.com.racstech.gameflix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import br.com.racstech.gameflix.ui.screens.HomeScreen
import br.com.racstech.gameflix.ui.theme.GameFlixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameFlixTheme {
                // A surface container using the 'background' color from the theme
                App()
            }
        }
    }
}

@Composable
fun App() {
    GameFlixTheme() {
        HomeScreen()
    }
}