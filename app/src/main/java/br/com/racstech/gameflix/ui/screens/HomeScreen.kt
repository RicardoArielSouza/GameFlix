package br.com.racstech.gameflix.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.racstech.gameflix.ui.components.AppTitleBar

@Composable
fun HomeScreen() {
    Column {
        AppTitleBar()
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}