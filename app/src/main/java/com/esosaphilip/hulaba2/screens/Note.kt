package com.esosaphilip.hulaba2.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.esosaphilip.hulaba2.componentsforUi.StudyPageTopAppBar
import com.esosaphilip.hulaba2.ui.theme.Hulaba2Theme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoteScreen(){
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            StudyPageTopAppBar()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /**presses++ **/ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { _ ->
        StudyList()
    }
}

@Composable
fun StudyList(){
    /** LazyColumn {
    items(
    items = /**messages**/,
    key = {// message ->
    // Return a stable + unique key for the item
    //  message.id
    }
    ) { //message ->
    //  MessageRow(message)
    }
    }
     **/
}




@Preview(showBackground = true)
@Composable
fun NoteScreenPreview(){
    Hulaba2Theme {
        NoteScreen()
    }
}
