package com.example.learningjetpackcompose.data

import androidx.annotation.DrawableRes

data class MyData(
    @DrawableRes val thumbnail: Int,
    val title: String,
    val name: String,
    val description: String
)
