package com.example.learningjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.screens.HomeScreenExample
import com.example.learningjetpackcompose.screens.NotificationScreenExample
import com.example.learningjetpackcompose.screens.ProfileScreenExample
import com.example.learningjetpackcompose.screens.Screens
import com.example.learningjetpackcompose.screens.SearchScreenExample
import com.example.learningjetpackcompose.screens.SettingsScreenExample
import com.example.learningjetpackcompose.ui.theme.CWHBlue
import com.example.learningjetpackcompose.ui.theme.CWHLighGray
import com.example.learningjetpackcompose.ui.theme.CWHPrimary

@Preview(showSystemUi = true)
@Composable
fun BottomNavigationExamplePreview(){
    BottomNavigationExample()
}

@Composable
fun BottomNavigationExample() {
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = CWHLighGray
            ){
                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Home
                        navigationController.navigate(Screens.HomeScreen.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if(selected.value == Icons.Default.Home) CWHPrimary else Color.White
                    )
                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Search
                        navigationController.navigate(Screens.SearchScreen.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if(selected.value == Icons.Default.Search) CWHPrimary else Color.White
                    )
                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(16.dp)
                        .weight(1f)
                ){
                    FloatingActionButton(
                        onClick = { Toast.makeText(context,"Open Bottom Sheet", Toast.LENGTH_SHORT).show()}
                    ) {
                        Icon(Icons.Default.Add,null, tint = CWHPrimary)
                    }
                }



                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Notifications
                        navigationController.navigate(Screens.NotificationsScreen.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if(selected.value == Icons.Default.Notifications) CWHPrimary else Color.White
                    )
                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Settings
                        navigationController.navigate(Screens.SettingScreen.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if(selected.value == Icons.Default.Settings) CWHPrimary else Color.White
                    )
                }
            }
        }
    ) {
        paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.HomeScreen.screen,
            modifier = Modifier.padding(paddingValues)
        ){
            composable(Screens.HomeScreen.screen){ HomeScreenExample() }
            composable(Screens.ProfileScreen.screen){ ProfileScreenExample() }
            composable(Screens.NotificationsScreen.screen){ NotificationScreenExample() }
            composable(Screens.SearchScreen.screen){ SearchScreenExample() }
            composable(Screens.SettingScreen.screen){ SettingsScreenExample() }
        }

    }
}