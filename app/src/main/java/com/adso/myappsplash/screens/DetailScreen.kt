package com.adso.myappsplash.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.LineHeightStyle

import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.adso.myappsplash.R
import com.adso.myappsplash.data.Movie


@Composable
fun DetailScreen(movie: Movie, navController: NavController) {
    MovieDetail(movie = movie)
}
@Composable
fun MovieDetail(movie: Movie) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = movie.drawable),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Name",
            fontSize = 18.sp,
            textDecoration = TextDecoration.Underline,
            color = Color.Red,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(
                    horizontal = 10.dp,
                    vertical = 5.dp
                )
        )
        Text(
            text = movie.name,
            fontSize = 14.sp,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(
                    horizontal = 10.dp,
                    vertical = 5.dp
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(Movie(name = "Deadpool 3", drawable = R.drawable.deadpool3),rememberNavController())
}