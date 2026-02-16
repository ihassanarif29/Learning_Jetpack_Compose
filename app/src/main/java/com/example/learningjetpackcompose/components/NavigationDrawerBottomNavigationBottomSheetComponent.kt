package com.example.learningjetpackcompose.components

import android.R
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
import com.example.learningjetpackcompose.ui.theme.CWHLighGray
import com.example.learningjetpackcompose.ui.theme.CWHPrimary
import kotlinx.coroutines.launch

@Preview(showSystemUi = true)
@Composable
fun NavigationDrawerBottomNavigationBottomSheetExamplePreview(){
    NavigationDrawerBottomNavigationBottomSheetExample()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerBottomNavigationBottomSheetExample(){

    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope ()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext

    val selected = remember{
        mutableStateOf(Icons.Default.Home)
    }
    val sheetState = rememberModalBottomSheetState ()
    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet{
                Box(
                    modifier = Modifier
                        .background(CWHLighGray)
                        .fillMaxWidth()
                        .height(150.dp)
                ){
                    Text("")
                }
                Divider()
                //Home
                NavigationDrawerItem(
                    label = {Text("Home", color = CWHPrimary)},
                    selected = false,
                    icon = {Icon(Icons.Default.Home, contentDescription = "Home Icon", tint = CWHPrimary)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.HomeScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                //Profile
                NavigationDrawerItem(
                    label = {Text("Profile", color = CWHPrimary)},
                    selected = false,
                    icon = {Icon(Icons.Default.Person, contentDescription = "Profile Icon", tint = CWHPrimary)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.ProfileScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                //Notifications
                NavigationDrawerItem(
                    label = {Text("Notifications", color = CWHPrimary)},
                    selected = false,
                    icon = { Icon(Icons.Default.Notifications, contentDescription = "Notification Icon", tint = CWHPrimary)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.NotificationsScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                Divider()
                //Search
                NavigationDrawerItem(
                    label = {Text("Search", color = CWHPrimary)},
                    selected = false,
                    icon = {Icon(Icons.Default.Search, contentDescription = "Search Icon", tint = CWHPrimary)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.SearchScreen.screen){
                            popUpTo(0)
                        }
                    }
                )
                //Setting
                NavigationDrawerItem(
                    label = {Text("Settings", color = CWHPrimary)},
                    selected = false,
                    icon = {Icon(Icons.Default.Settings, contentDescription = "Setting Icon", tint = CWHPrimary)},
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
            topBar ={
                val coroutineScope = rememberCoroutineScope()
                //Top Bar
                TopAppBar(
                    title = {
                        Image(
                            painter = painterResource(com.example.learningjetpackcompose.R.drawable.title),
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
                    ),
                    actions = {
                        IconButton(onClick = {
                            navigationController.navigate(Screens.SearchScreen.screen){
                                popUpTo(0)
                            }
                        }) {
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
            },
            //Bottom Bar
            bottomBar = {
                BottomAppBar(
                    containerColor = CWHLighGray
                ) {
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

}

