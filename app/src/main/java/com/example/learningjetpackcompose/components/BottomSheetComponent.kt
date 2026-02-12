package com.example.learningjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.screens.HomeScreenExample
import com.example.learningjetpackcompose.screens.NotificationScreenExample
import com.example.learningjetpackcompose.screens.ProfileScreenExample
import com.example.learningjetpackcompose.screens.Screens
import com.example.learningjetpackcompose.screens.SearchScreenExample
import com.example.learningjetpackcompose.screens.SettingsScreenExample
import com.example.learningjetpackcompose.ui.theme.CWHLighGray
import com.example.learningjetpackcompose.ui.theme.CWHPrimary

@Preview
@Composable
fun BottomSheetExamplePreview(){
    BottomSheetExample()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetExample(){
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember {
        mutableStateOf(false)
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
                        onClick = { showBottomSheet = true}
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

    if(showBottomSheet){
        ModalBottomSheet(
            onDismissRequest = {showBottomSheet = false},
            sheetState = sheetState
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp)
            ) {
                BottomSheetItem(
                    icon = Icons.Default.Home,
                    title = "Home"
                ) {
                    showBottomSheet = false
                    navigationController.navigate(Screens.HomeScreen.screen){
                        popUpTo(0)
                    }
                }

                BottomSheetItem(
                    icon = Icons.Default.ThumbUp,
                    title = "Like"
                ) {
                    Toast.makeText(context,"Like a Post", Toast.LENGTH_SHORT).show()
                }

                BottomSheetItem(
                    icon = Icons.Default.Share,
                    title = "Share"
                ) {
                    Toast.makeText(context,"Share a Post", Toast.LENGTH_SHORT).show()
                }

                BottomSheetItem(
                    icon = Icons.Default.Settings,
                    title = "Settings"
                ) {
                    showBottomSheet = false
                    navigationController.navigate(Screens.SettingScreen.screen){
                        popUpTo(0)
                    }
                }
            }
        }
    }
}


@Composable
fun BottomSheetItem(icon: ImageVector, title: String, onClick: () -> Unit){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable{onClick()}
    ) {
        Icon(icon, contentDescription = null, tint = CWHPrimary)
        Text(title, color = CWHPrimary, fontSize = 24.sp)
    }
}