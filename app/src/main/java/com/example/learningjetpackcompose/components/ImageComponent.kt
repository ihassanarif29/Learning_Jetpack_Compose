package com.example.learningjetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningjetpackcompose.R

@Preview(showSystemUi = true)
@Composable
fun ImageExamplesPreview(){
    ImageExample()
}

@Composable
fun ImageExample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(painterResource(R.drawable.icon),"Icon Vector")
    }
}