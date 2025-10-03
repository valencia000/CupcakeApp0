package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ConfirmationScreen(
    flavor: String,
    subtotal: Int,
    pickupDate: String,
    onOrderConfirmed: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text("¡Felicidades! Confirmaste tu pedido")
        Spacer(Modifier.height(8.dp))
        Text("Sabor: $flavor")
        Text("Subtotal: $subtotal")
        Text("Fecha de retiro: $pickupDate")
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = onOrderConfirmed,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Finalizar pedido")
        }
    }
}
