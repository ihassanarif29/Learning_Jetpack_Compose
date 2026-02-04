package com.example.learningjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun ButtonExamplesPreview(){
    //SimpleButtonExample()
    //CustomButtonExample()
    IconButtonExample()
}


@Composable
fun SimpleButtonExample(){
    val context = LocalContext.current.applicationContext
    val onClickFunction = {
        Toast.makeText(context, "I am Clicked", Toast.LENGTH_SHORT).show()
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = onClickFunction) {
            Text("Simple Button")
        }
    }
}


@Composable
fun CustomButtonExample(){
    val context = LocalContext.current.applicationContext
    val onClickFunction = {
        Toast.makeText(context, "Custom Button Clicked", Toast.LENGTH_SHORT).show()
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onClickFunction,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            elevation = ButtonDefaults.elevatedButtonElevation(5.dp)
            ) {
            Text("Custom Button", color = Color.Black)
        }
    }
}

@Composable
fun IconButtonExample(){
    val context = LocalContext.current.applicationContext
    val onClickFunction = {
        Toast.makeText(context, "I am Clicked", Toast.LENGTH_SHORT).show()
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        IconButton(onClick = onClickFunction) {
            Icon(Icons.Default.AccountCircle,"Circle Icon")
        }
    }
}