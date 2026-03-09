package com.example.listadetareas.ui.theme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun BottomNavigationBar() {
    var selected by remember { mutableIntStateOf(0) }

    NavigationBar {
        NavigationBarItem(
            selected = selected == 0,
            onClick = { selected = 0 },
            label = { Text(text = "Pendientes") },
            icon = { Icon(imageVector = Icons.Default.List, contentDescription = null) }
        )
        NavigationBarItem(
            selected = selected == 1,
            onClick = { selected = 1 },
            label = { Text(text = "Completadas") },
            icon = { Icon(imageVector = Icons.Default.Check, contentDescription = null) }
        )
    }
}