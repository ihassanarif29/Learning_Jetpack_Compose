package com.example.learningjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun CheckBoxExamplePreview(){
    CheckBoxExample()
}

@Composable
fun CheckBoxExample(){
    val todoList : List<String> = listOf("Buy Groceries", "Co to Shopping","Create a Project","Create a Profile","Pay Bills")
    val context = LocalContext.current.applicationContext

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(start = 40.dp, top = 100.dp)
        ) {
            todoList.forEach {
                todoItem ->
                var checkedItem by remember {
                    mutableStateOf(false)
                }

                Row{
                    Checkbox(checked = checkedItem, onCheckedChange = {
                        checkedStatus -> checkedItem = checkedStatus
                        Toast.makeText(context, "$todoItem is $checkedItem", Toast.LENGTH_SHORT).show()
                    })
                    Text(text = todoItem, fontSize = 22.sp)
                }
            }
        }
    }

}