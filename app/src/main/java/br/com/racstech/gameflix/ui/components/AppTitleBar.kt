package br.com.racstech.gameflix.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.racstech.gameflix.R
import br.com.racstech.gameflix.ui.theme.mediumSpacer
import br.com.racstech.gameflix.ui.theme.titlesFamily

@Composable
fun AppTitleBar() {
    Column(
        Modifier
            .fillMaxWidth()
            .testTag(stringResource(id = R.string.app_name))
            .background(color = Color.Black),
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(
            modifier = Modifier
                .height(mediumSpacer)
                .fillMaxWidth()
        )
        Box(modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .offset(x = 0.dp, y = (-24.dp)),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "GAMEFLIX",
                modifier = Modifier
                    .fillMaxWidth(),
                color = Color.Red,
                fontFamily = titlesFamily,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 38.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppTitleBarPreview() {
    AppTitleBar()
}