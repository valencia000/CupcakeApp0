package com.example.cupcakeapp

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcakeapp.ui.theme.CupcakeAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CupcakeAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text(text = "Cupcake App") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Red, // 👈 CAMBIO VISUAL CLARO
            titleContentColor = Color.White
        ),
        modifier = modifier
    )
}

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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CupcakeAppTheme {
        CupcakeApp()
    }
}


