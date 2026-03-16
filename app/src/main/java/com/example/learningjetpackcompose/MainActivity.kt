package com.example.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.components.BottomNavigationExample
import com.example.learningjetpackcompose.components.BottomSheetExample
import com.example.learningjetpackcompose.components.DisplayNavComponent
import com.example.learningjetpackcompose.components.NavigationDrawerBottomNavigationBottomSheetExample
import com.example.learningjetpackcompose.components.NavigationDrawerExample
import com.example.learningjetpackcompose.components.SimpleTextExample
import com.example.learningjetpackcompose.components.TopAppBarExample
import com.example.learningjetpackcompose.mvvm.CounterDisplay
import com.example.learningjetpackcompose.screens.NavGraph
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                //val navController = rememberNavController()
                //NavGraph(navController)

                CounterDisplay()
            }
        }
    }
}

