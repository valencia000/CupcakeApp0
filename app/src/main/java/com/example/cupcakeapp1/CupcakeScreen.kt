package com.example.cupcakeapp1

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcakeapp1.ui.theme.CupcakeApp1Theme

//  Pantalla principal de la app
@Composable
fun CupcakeApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Greeting(
            name = "Android",
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize() //  asegura que el texto se vea
        )
    }
}

//  Composable reutilizable que muestra un saludo
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "¡Hola desde CupcakeApp, $name! 🧁",
        modifier = modifier
    )
}

//  Preview que muestra toda la app
@Preview(showBackground = true)
@Composable
fun CupcakeAppPreview() {
    CupcakeApp1Theme {
        CupcakeApp()
    }
}

