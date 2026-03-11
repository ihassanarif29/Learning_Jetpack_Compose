package com.example.learningjetpackcompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun ListExamplePreview(){
    val fruitList = listOf("Mango","Apple","Banana","Grapes","Orange")
    ListExample(fruitList)
}

@Composable
fun ListExample(fruitsList: List<String>){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        fruitsList.forEach {
            Text(text = it,
                fontSize = 30.sp,
                color = Color.Blue
            )
        }
    }
}