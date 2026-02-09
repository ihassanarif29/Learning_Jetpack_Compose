package com.example.learningjetpackcompose.screens

sealed class Screens(val screen:String){
    data object HomeScreen: Screens("home")
    data object ProfileScreen: Screens("profile")
    data object NotificationsScreen: Screens("notifications")
    data object SearchScreen: Screens("search")
    data object SettingScreen: Screens("setting")
}