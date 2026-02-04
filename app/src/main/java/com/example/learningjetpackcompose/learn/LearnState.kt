package com.example.learningjetpackcompose.learn

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun StateExamplePreview(){
    //SimpleVariableExample()
    StateVariableExample()
}

@Composable
fun SimpleVariableExample(){
    var age = 0

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                age++
                Log.v("My-Logs", "age variable value is = $age")
            }
        ) {
            Text("I am $age years old")
        }
    }
}

@Composable
fun StateVariableExample(){
    var age by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                age++
                Log.v("My-Logs", "age variable value is = $age")
            }
        ) {
            Text("I am $age years old")
        }
    }
}