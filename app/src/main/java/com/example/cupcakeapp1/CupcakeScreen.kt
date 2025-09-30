package com.example.cupcakeapp1

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcakeapp1.ui.theme.CupcakeApp1Theme

// 👉 Barra superior reutilizable
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CupcakeAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text(text = "Cupcake App") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier
    )
}

// 👉 Pantalla principal con Scaffold + TopAppBar
@Composable
fun CupcakeApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CupcakeAppBar() }
    ) { innerPadding ->
        Greeting(
            name = "Android",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

// 👉 Composable reutilizable para saludo
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// 👉 Preview de toda la app
@Preview(showBackground = true)
@Composable
fun CupcakeAppPreview() {
    CupcakeApp1Theme {
        CupcakeApp()
    }
}

