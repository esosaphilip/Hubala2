package com.esosaphilip.hulaba2.componentsforUi

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.esosaphilip.hulaba2.R
import com.esosaphilip.hulaba2.ui.theme.Hulaba2Theme

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HulabaTopAppBar(){
    Box {
        CenterAlignedTopAppBar(
            title = {},
            navigationIcon = {
                TopAppBArMenuIcon()
            },
           actions = {
                TopAppBArNotiIcon(imageVector = Icons.Filled.Notifications)
           }
        )
    }
}

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WordPageTopAppBar() {
    Box {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            navigationIcon = {
                TopAppBArNotiIcon(imageVector = Icons.AutoMirrored.Filled.ArrowBack)
            },
            title = {
                CenterTopAppBarText(stringResource(id = R.string.wordHeadText))
            }
        )
    }
}

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudyPageTopAppBar() {
    Box {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            navigationIcon = {
                TopAppBArNotiIcon(imageVector = Icons.AutoMirrored.Filled.ArrowBack)
            },
            title = {
                CenterTopAppBarText(stringResource(id = R.string.studyHeadText))
            }
        )
    }
}



@Composable
fun TopAppBArNotiIcon(
    imageVector: ImageVector
) {
    IconButton(onClick = { /* doSomething() */ }) {
        Icon(
            imageVector = imageVector,
            contentDescription = "Localized description"
        )
    }
}
@Composable
fun TopAppBArMenuIcon() {
    IconButton(
        onClick = { /* doSomething() */ }
        ) {
        Icon(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Localized description"
        )
    }
}
@Composable
fun CenterTopAppBarText(name: String) {
    Text(
        name,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadText(name: String) {
    Text(text = name, style = MaterialTheme.typography.titleLarge)
}

@Composable
fun ExtendedIcons(painter: Painter) {
    Icon(painter = painter, contentDescription = null )
}

@Composable
fun EnterWordTextField(
    words: String,
    saveWordFunction : () -> Unit
) {
  OutlinedTextField(value = words , onValueChange = {saveWordFunction()} )
}


@Composable
fun EnterTopicTextField(
    topics: String,
    saveTopicFunction: () -> Unit,

) {
    OutlinedTextField(
        value = topics ,
        onValueChange = {saveTopicFunction()},
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        shape = MaterialTheme.shapes.small
    )
}
@Preview(showBackground = true)
@Composable
fun PreviewEnterTopic() {
   Hulaba2Theme {
       EnterTopicTextField(
           topics = " ",
           saveTopicFunction = {/** latter to poseidon  **/}
       )
   }
}
@Composable
fun BottomNavigationIcon(icon : Int ) {
    Icon(
        painterResource(icon) ,
        contentDescription = null,
        tint = Color.Green
    )
}



