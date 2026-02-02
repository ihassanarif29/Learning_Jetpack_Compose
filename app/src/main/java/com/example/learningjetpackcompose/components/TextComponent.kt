package com.example.learningjetpackcompose.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R

@Preview(showBackground = true)
@Composable
fun TextExamplesPreview(){
    //SimpleTextExample()
    //SimpleTextExampleLoadStringFromResources()
    //ModifiedTextExample()
    //ClickableTextExample()
}

@Composable
fun SimpleTextExample(){
    Text("Welcome this is simple text example")
}

@Composable
fun SimpleTextExampleLoadStringFromResources(){
    Text(stringResource(R.string.welcome_string))
}

@Composable
fun ModifiedTextExample(){
    Text("Welcome this is simple modified text example",
        color = Color.Red,
        fontSize = 32.sp,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(22.dp)
            .background(Color.Cyan)
    )
}

@Composable
fun ClickableTextExample(){
    val clickOnText: () -> Unit = {
        Log.d("My_Tags","I am clicked")
    }
    Text("I am clickable text",
        fontSize = 32.sp,
        modifier = Modifier
            .padding(22.dp)
            .clickable(onClick = clickOnText)
        )
}