package br.com.racstech.gameflix.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.racstech.gameflix.R
import br.com.racstech.gameflix.ui.theme.mediumSpacer
import br.com.racstech.gameflix.ui.theme.titlesFamily
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter

@Composable
fun Highlight() {
    Column(
        Modifier
            .fillMaxWidth()
            .testTag(stringResource(id = R.string.app_name))
            .background(color = Color.Black),
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier
            .height(138.dp)
            .fillMaxWidth()
            .offset(x = 0.dp, y = (-24.dp)),
            contentAlignment = Alignment.Center
        ){
        }
    }
}

@Preview
@Composable
fun HighlightPreview() {
    Highlight()
}