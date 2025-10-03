package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SummaryScreen(
    selectedFlavor: String,
    quantity: Int,
    onConfirmOrder: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Resumen del pedido")
        Text(text = "Sabor: $selectedFlavor")
        Text(text = "Cantidad: $quantity")

        Button(onClick = onConfirmOrder) {
            Text(text = "Confirmar pedido")
        }
    }
}
