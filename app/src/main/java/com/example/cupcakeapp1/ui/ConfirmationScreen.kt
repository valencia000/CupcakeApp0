package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConfirmationScreen(
    flavor: String,
    subtotal: Int,
    onOrderConfirmed: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("¡Felicidades!", style = MaterialTheme.typography.titleMedium)
        Spacer(Modifier.height(16.dp))
        Text("Tu pedido: $flavor")
        Text("Subtotal: $subtotal")
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = onOrderConfirmed,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar pedido")
        }
    }
}

