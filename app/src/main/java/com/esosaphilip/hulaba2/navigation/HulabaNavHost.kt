package com.esosaphilip.hulaba2.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.esosaphilip.hulaba2.componentsforUi.HulabaTopAppBar

@Composable
fun HulabaNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.HomeScreen.route) {
        composable(BottomNavItem.HomeScreen.route) { /* Home Screen UI */ }
        composable(BottomNavItem.WordScreen.route) { /* Word Screen UI */ }
        composable(BottomNavItem.CalenderScreen.route) { /* Calender Screen UI */ }
        composable(BottomNavItem.NoteScreen.route) { /* Note Screen UI */ }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HulabaApp(){
    val navController = rememberNavController()
    Scaffold(
        topBar = { HulabaTopAppBar() },
        bottomBar = { HulabaBottomNavigation(navController)}
    ) {
        HulabaNavHost(navController = navController )
    }
}
