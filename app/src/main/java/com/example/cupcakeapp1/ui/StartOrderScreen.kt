package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreen(
    quantityOptions: List<Pair<Int, Int>>,
    onNextButtonClicked: (Int) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Selecciona cantidad", style = MaterialTheme.typography.titleMedium)
        Spacer(Modifier.height(16.dp))
        quantityOptions.forEach { (label, quantity) ->
            Button(
                onClick = { onNextButtonClicked(quantity) },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Cantidad: $quantity")
            }
        }
    }
}

