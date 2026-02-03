package com.example.learningjetpackcompose.positioning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun RowAlignmentExamplesPreview(){
    RowTopAlignmentExample()
    //RowCenterVerticalAlignmentExample()
    //RowBottomAlignmentExample()
}


@Composable
fun RowTopAlignmentExample(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .size(20.dp,500.dp)
                .background(Color.Black)
        )
    }
}

@Composable
fun RowCenterVerticalAlignmentExample(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(20.dp,500.dp)
                .background(Color.Black)
        )
    }
}

@Composable
fun RowBottomAlignmentExample(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Box(
            modifier = Modifier
                .size(20.dp,500.dp)
                .background(Color.Black)
        )
    }
}


