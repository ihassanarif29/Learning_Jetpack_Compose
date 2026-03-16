package com.example.learningjetpackcompose.components

import android.view.Display
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun DisplayNavComponent(){
    //NavComponentUsingKeyword()
    NavComponentUsingSealedClass()
}


@Composable
fun NavComponentUsingKeyword(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainScreen"){
        composable("MainScreen"){
            MainScreen(navController = navController)
        }
        composable("HomeScreen"){
            HomeScreen(navController = navController)
        }
    }
}

@Composable
fun NavComponentUsingSealedClass(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.MainScreen.toString()){
        composable(route = Destinations.MainScreen.toString()){
            MainScreen(navController = navController)
        }
        composable(route = Destinations.HomeScreen.toString()){
            HomeScreen(navController = navController)
        }
    }
}

@Composable
fun MainScreen(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Main Screen", fontSize = 34.sp)
        Button(
            onClick = {
                // this is used for keywords
                //navController.navigate("HomeScreen")

                // this is used for sealed class
                navController.navigate(Destinations.HomeScreen.toString())

                // this is used for handle back button
                //navController.popBackStack(Destinations.HomeScreen.toString(),inclusive = false)
            }
        ) {
            Text(text = "Go to Home Screen")
        }
    }
}

@Composable
fun HomeScreen(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Home Screen", fontSize = 34.sp)
        Button(
            onClick = {
                // this is used for keywords
                //navController.navigate("MainScreen")

                // this is used for sealed class
                //navController.navigate(Destinations.MainScreen.toString())

                // this is used for handle back button
                navController.popBackStack(Destinations.MainScreen.toString(),inclusive = false)

            }
        ) {
            Text(text = "Go to Main Screen")
        }
    }
}