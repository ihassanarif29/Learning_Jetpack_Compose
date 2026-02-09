package com.example.learningjetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.R
import com.example.learningjetpackcompose.screens.HomeScreenExample
import com.example.learningjetpackcompose.screens.NotificationScreenExample
import com.example.learningjetpackcompose.screens.ProfileScreenExample
import com.example.learningjetpackcompose.screens.Screens
import com.example.learningjetpackcompose.screens.SearchScreenExample
import com.example.learningjetpackcompose.screens.SettingsScreenExample
import com.example.learningjetpackcompose.ui.theme.CWHLighGray
import com.example.learningjetpackcompose.ui.theme.CWHPrimary
import kotlinx.coroutines.launch

@Preview
@Composable
fun NavigationDrawerExamplePreview(){
    NavigationDrawerExample()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerExample(){
    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope ()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(CWHLighGray)
                ){
                    Text("Header")
                }
                Divider()
                // Home Drawer Item
                NavigationDrawerItem(
                    label = {Text("Home", color = CWHPrimary)},
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Home,"Home Icon", tint = CWHPrimary) },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.HomeScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                // Profile Drawer Item
                NavigationDrawerItem(
                    label = {Text("Profile", color = CWHPrimary)},
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Person,"Profile Icon", tint = CWHPrimary) },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.ProfileScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                // Notification Drawer Item
                NavigationDrawerItem(
                    label = {Text("Notifications", color = CWHPrimary)},
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Notifications,"Notifications Icon", tint = CWHPrimary) },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.NotificationsScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                // Search Drawer Item
                NavigationDrawerItem(
                    label = {Text("Search", color = CWHPrimary)},
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Search,"Search Icon", tint = CWHPrimary) },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.SearchScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                // Settings Drawer Item
                NavigationDrawerItem(
                    label = {Text("Settings", color = CWHPrimary)},
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Settings,"Settings Icon", tint = CWHPrimary) },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.SettingScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
            }
        }
    ) {
        Scaffold(
            topBar = {
                val coroutineScope = rememberCoroutineScope ()
                TopAppBar(
                    title = {
                        Image(
                            painter = painterResource(R.drawable.title),
                            "Title",
                            modifier = Modifier.size(160.dp)
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
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
                    )
                )
            }
        ) { paddingValues ->
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
}