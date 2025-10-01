package com.example.cupcakeapp1

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcakeapp1.ui.StartOrderScreen
import com.example.cupcakeapp1.ui.theme.CupcakeAppTheme

@Composable
fun CupcakeApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        StartOrderScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    CupcakeAppTheme {
        CupcakeApp()
    }
}


