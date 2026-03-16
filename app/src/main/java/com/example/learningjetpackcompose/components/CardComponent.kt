package com.example.learningjetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.data.MyData
import com.example.learningjetpackcompose.ui.theme.CWHGray

@Preview(showSystemUi = true)
@Composable
fun CardExamplePreview(){
    CardExample()
}


@Composable
fun CardExample(){
    val myDataList = listOf(
        MyData(R.drawable.bg1,"Colors","primary color combinations","this is description"),
        MyData(R.drawable.bg2,"Crops","primary crops","this is description"),
        MyData(R.drawable.bg3,"Plants","primary plants","this is description"),
        MyData(R.drawable.bg4,"Structure","primary structures","this is description")
    )
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        items(myDataList){
            myData -> MyCard(myData = myData)
        }
    }
}

@Composable
fun MyCard(myData: MyData){
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 10.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .background(CWHGray)
        ) {
            Image(
                painter = painterResource(id = myData.thumbnail),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(16f/6f)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp)
            ) {
                Text(text = myData.title,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = myData.name,
                    color = Color.White,
                    maxLines = 1,
                    fontSize = 18.sp)
            }

        }
    }
}