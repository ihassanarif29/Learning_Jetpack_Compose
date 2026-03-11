package com.example.learningjetpackcompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun LazyRowExamplePreview(){
    val items = listOf("item One","item two","item three","item four","item five","item six","item seven","item eight","item nine","item ten")
    LazyRowExample(items)
}

@Composable
fun LazyRowExample(itemsList: List<String>){
    LazyRow(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        items(itemsList){
            Text(text = it,
                fontSize = 30.sp,
                color = Color.Blue
            )
        }
    }
}