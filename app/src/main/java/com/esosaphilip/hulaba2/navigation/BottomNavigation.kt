package com.esosaphilip.hulaba2.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.esosaphilip.hulaba2.componentsforUi.BottomNavigationIcon

@Composable
fun HulabaBottomNavigation(
    navController: NavController,
    selectedItem: MutableState<BottomNavItem>
) {
    Card(
      modifier = Modifier.padding(bottom = 5.dp),
      elevation = CardDefaults.cardElevation(25.dp),
      shape = CardDefaults.shape,
      colors = CardDefaults.cardColors(
          containerColor = MaterialTheme.colorScheme.scrim
      )
    ){
        BottomNavigation {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            items.forEach { item ->
                BottomNavigationItem(
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                        selectedItem.value = item // Update selectedItem when an item is clicked
                    },
                    icon = {
                         BottomNavigationIcon(icon = item.resourceId)
                    },
                    label = { Text(item.label, color = Color.White) }
                )
            }
        }
    }
}



