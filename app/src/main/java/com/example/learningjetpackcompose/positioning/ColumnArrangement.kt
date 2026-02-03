package com.example.learningjetpackcompose.positioning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
fun ColumnArrangementExamplesPreview(){
    //ColumnTopArrangementExample()
    //ColumnCenterArrangementExample()
    //ColumnBottomArrangementExample()
}

@Composable
fun ColumnTopArrangementExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier
                .size(20.dp,500.dp)
                .background(Color.Black)
        )
    }
}

@Composable
fun ColumnCenterArrangementExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(20.dp,500.dp)
                .background(Color.Black)
        )
    }
}

@Composable
fun ColumnBottomArrangementExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Box(
            modifier = Modifier
                .size(20.dp,500.dp)
                .background(Color.Black)
        )
    }
}