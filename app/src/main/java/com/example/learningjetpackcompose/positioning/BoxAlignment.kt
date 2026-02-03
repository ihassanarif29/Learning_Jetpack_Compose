package com.example.learningjetpackcompose.positioning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun BoxAlignmentExamplesPreview(){
    //BoxStartAlignment()
    BoxAllAlignments()
}


@Composable
fun BoxStartAlignment(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp)
            .background(Color.Cyan),
        contentAlignment = Alignment.TopStart
    ){
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow),
        ){
            Text("Top Start", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun BoxAllAlignments(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp)
            .background(Color.Cyan),
    ){
        Text("Top Start", fontSize = 16.sp, modifier = Modifier.align(Alignment.TopStart))
        Text("Top Center", fontSize = 16.sp, modifier = Modifier.align(Alignment.TopCenter))
        Text("Top End", fontSize = 16.sp, modifier = Modifier.align(Alignment.TopEnd))
        Text("Center Start", fontSize = 16.sp, modifier = Modifier.align(Alignment.CenterStart))
        Text("Center", fontSize = 16.sp, modifier = Modifier.align(Alignment.Center))
        Text("Center End", fontSize = 16.sp, modifier = Modifier.align(Alignment.CenterEnd))
        Text("Bottom Start", fontSize = 16.sp, modifier = Modifier.align(Alignment.BottomStart))
        Text("Bottom Center", fontSize = 16.sp, modifier = Modifier.align(Alignment.BottomCenter))
        Text("Bottom End", fontSize = 16.sp, modifier = Modifier.align(Alignment.BottomEnd))
    }
}