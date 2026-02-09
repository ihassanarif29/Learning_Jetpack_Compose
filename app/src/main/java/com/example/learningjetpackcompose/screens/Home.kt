package com.example.learningjetpackcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.ui.theme.CWHPrimary

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreenExample()
}

@Composable
fun HomeScreenExample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Home",
            fontSize = 36.sp,
            color = CWHPrimary
        )
    }
}