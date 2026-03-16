package com.example.learningjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.ui.theme.CWHGray
import com.example.learningjetpackcompose.ui.theme.CWHPrimary

@Preview(showSystemUi = true)
@Composable
fun FloatingActionButtonExamplePreview(){
    //FloatingActionButtonExample()
    ExtendedFloatingActionButtonExample()
}


@Composable
fun FloatingActionButtonExample(){

    val context = LocalContext.current.applicationContext

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        FloatingActionButton(
            onClick = { Toast.makeText(context,"Floating Action Button Clicked", Toast.LENGTH_SHORT).show()},
            containerColor = CWHGray,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomEnd)
        ) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = null, tint = CWHPrimary)
        }
    }
}

@Composable
fun ExtendedFloatingActionButtonExample(){
    val context = LocalContext.current.applicationContext

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ExtendedFloatingActionButton(
            onClick = { Toast.makeText(context,"Extended Floating Action Button Clicked", Toast.LENGTH_SHORT).show()},
            containerColor = CWHGray,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomEnd)
        ) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = null, tint = CWHPrimary)
            Text(text = "Menu", fontSize = 16.sp, color = CWHPrimary, modifier = Modifier.padding(4.dp))
        }
    }
}