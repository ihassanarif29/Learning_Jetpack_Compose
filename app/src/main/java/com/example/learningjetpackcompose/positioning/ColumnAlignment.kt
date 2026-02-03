package com.example.learningjetpackcompose.positioning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
fun ColumnAlignmentExamplesPreview(){
    //ColumnStartAlignmentExample()
    //ColumnCenterHorizontallyAlignmentExample()
    //ColumnEndAlignmentExample()
}

@Composable
fun ColumnStartAlignmentExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .size(200.dp,20.dp)
                .background(Color.Black)
        )
    }
}

@Composable
fun ColumnCenterHorizontallyAlignmentExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp,20.dp)
                .background(Color.Black)
        )
    }
}

@Composable
fun ColumnEndAlignmentExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.End
    ) {
        Box(
            modifier = Modifier
                .size(200.dp,20.dp)
                .background(Color.Black)
        )
    }
}