package com.example.learningjetpackcompose.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learningjetpackcompose.components.NavigationDrawerBottomNavigationBottomSheetExample
import com.example.learningjetpackcompose.ui.theme.CWHDarkPurple
import com.example.learningjetpackcompose.ui.theme.CWHLightPurple
import com.example.learningjetpackcompose.ui.theme.CWHPrimary

@Preview(showSystemUi = true)
@Composable
fun LoginScreenExamplePreview(){
    LoginScreenExample({})
}

@Composable
fun LoginScreenExample(onLoginSuccess: () -> Unit) {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    val context = LocalContext.current.applicationContext

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 26.dp, vertical = 140.dp)
    ) {
        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            label = { Text(text = "Username") },
            shape = RoundedCornerShape(20.dp),
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
            colors = TextFieldDefaults.colors(
                focusedLeadingIconColor = CWHPrimary,
                unfocusedLeadingIconColor = CWHLightPurple,
                focusedLabelColor = CWHPrimary,
                unfocusedLabelColor = CWHLightPurple,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = CWHDarkPurple,
                unfocusedIndicatorColor = CWHDarkPurple,
                unfocusedPlaceholderColor = CWHDarkPurple
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Password") },
            shape = RoundedCornerShape(20.dp),
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            colors = TextFieldDefaults.colors(
                focusedLeadingIconColor = CWHPrimary,
                unfocusedLeadingIconColor = CWHLightPurple,
                focusedLabelColor = CWHPrimary,
                unfocusedLabelColor = CWHLightPurple,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = CWHDarkPurple,
                unfocusedIndicatorColor = CWHDarkPurple,
                unfocusedPlaceholderColor = CWHDarkPurple
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            visualTransformation = PasswordVisualTransformation()
        )

        Button(
            onClick = {
                if(authenticate(username,password)){
                    onLoginSuccess()
                    Toast.makeText(context,"Login Successful", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(context,"Invalid Username or Password", Toast.LENGTH_SHORT).show()
                }
            },
            colors = ButtonDefaults.buttonColors(CWHDarkPurple),
            modifier = Modifier
                .fillMaxWidth()
                .padding(60.dp,8.dp)
        ) {
            Text("Login", fontSize = 18.sp)
        }
    }
}

private fun authenticate(username: String, password: String): Boolean{
    val validUsername = "admin"
    val validPassword = "admin123"
    return username == validUsername && password == validPassword
}

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "Login"){
        composable ("Login")
        {
            LoginScreenExample(onLoginSuccess = {
                navController.navigate("Home"){
                    popUpTo(0)
                }
            })
        }
        composable("Home")
        {
            NavigationDrawerBottomNavigationBottomSheetExample()
        }
    }
}