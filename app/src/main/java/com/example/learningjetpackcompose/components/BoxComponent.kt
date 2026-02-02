package com.example.learningjetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun BoxExamplesPreview(){
    //SimpleBoxExample()
    MultiBoxExample()
}

@Composable
fun SimpleBoxExample(){
    Box (
        modifier = Modifier
            .size(150.dp)
            .background(Color.Yellow)
    ){
        Text("This is Simple Box", textAlign = TextAlign.Center)
    }
}


@Composable
fun MultiBoxExample(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(300.dp, 300.dp)
                .background(Color.Red)
        ){
            Text("This is box which is in other box",
                modifier = Modifier.align(Alignment.Center),
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}