package com.esosaphilip.hulaba2.navigation

import androidx.annotation.DrawableRes
import com.esosaphilip.hulaba2.R

sealed class BottomNavItem(val route: String,  @DrawableRes val resourceId: Int, val label: String) {

    data object HomeScreen : BottomNavItem("home", R.drawable.home, "Home")
    data object WordScreen : BottomNavItem("word", R.drawable.word, "Word")
    data object NoteScreen : BottomNavItem("note",R.drawable.note, "Note")
    data object CalenderScreen : BottomNavItem("calender", R.drawable.calendar, "Calender")
}

val items = listOf(
    BottomNavItem.HomeScreen,
    BottomNavItem.WordScreen,
    BottomNavItem.NoteScreen,
    BottomNavItem.CalenderScreen
)
