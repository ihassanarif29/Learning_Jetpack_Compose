package com.example.learningjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.ui.theme.CWHPrimary

@Preview(showSystemUi = true)
@Composable
fun TopAppBarExamplePreview(){
    TopAppBarExample()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample(){

    val context = LocalContext.current.applicationContext
    val navigationIconHandler = {
        Toast.makeText(context,"Navigation icon clicked", Toast.LENGTH_SHORT).show()
    }

    TopAppBar(
        title = {
            Image(
                painter = painterResource(R.drawable.title),
                "Title",
                modifier = Modifier.size(160.dp)
            )
        },
        navigationIcon = {
            IconButton(onClick = {navigationIconHandler}) {
                Icon(
                    Icons.Rounded.Menu,
                    "Icon",
                    tint = CWHPrimary,
                    modifier = Modifier.size(26.dp)
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            Color.White,
            navigationIconContentColor = CWHPrimary
        ),
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    Icons.Default.Search,
                    "Search Icon",
                    tint = CWHPrimary,
                    modifier = Modifier.size(26.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    Icons.Default.MoreVert,
                    "MoreVert Icon",
                    tint = CWHPrimary,
                    modifier = Modifier.size(26.dp)
                )
            }
        }
    )
}