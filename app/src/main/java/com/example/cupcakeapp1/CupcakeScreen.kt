package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CupcakeScreen(
    quantity: Int,
    flavor: String,
    subtotal: Int,
    onConfirmOrder: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Resumen de tu pedido",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Cantidad: $quantity",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Sabor: $flavor",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Subtotal: $$subtotal",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = onConfirmOrder,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar Pedido")
        }
    }
}

