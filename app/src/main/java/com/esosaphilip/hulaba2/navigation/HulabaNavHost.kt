package com.esosaphilip.hulaba2.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.esosaphilip.hulaba2.componentsforUi.HulabaTopAppBar
import com.esosaphilip.hulaba2.screens.CalenderScreen
import com.esosaphilip.hulaba2.screens.HomeScreen
import com.esosaphilip.hulaba2.screens.NoteScreen
import com.esosaphilip.hulaba2.screens.WordScreen

@Composable
fun HulabaNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.HomeScreen.route) {
        composable(BottomNavItem.HomeScreen.route) { HomeScreen() }
        composable(BottomNavItem.WordScreen.route) { WordScreen() }
        composable(BottomNavItem.CalenderScreen.route) { CalenderScreen() }
        composable(BottomNavItem.NoteScreen.route) { NoteScreen() }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HulabaApp(){
    val navController = rememberNavController()
    val selectedItem = remember { mutableStateOf<BottomNavItem>(BottomNavItem.HomeScreen) } // Use mutableStateOf instead of mutableIntStateOf
    Scaffold(
        topBar = {
            if (selectedItem.value == BottomNavItem.HomeScreen) {
                HulabaTopAppBar()
            }
        },
        bottomBar = { HulabaBottomNavigation(navController, selectedItem)}
    ) {
        HulabaNavHost(navController = navController)
    }
}
