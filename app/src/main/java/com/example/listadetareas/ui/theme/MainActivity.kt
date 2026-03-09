package com.example.listadetareas.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.listadetareas.ui.theme.ListaDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPrevia() {
    ListaDeTareasTheme {
        TaskApp()
    }
}