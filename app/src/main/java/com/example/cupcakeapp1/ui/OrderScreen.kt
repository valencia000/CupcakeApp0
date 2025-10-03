package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OrderScreen(
    quantity: Int,
    flavors: List<String>,
    onOrderConfirmed: () -> Unit,   // 👈 este es el callback correcto
    modifier: Modifier = Modifier
) {
    var selectedFlavor by remember { mutableStateOf(flavors.first()) }

    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Selecciona tu sabor:")

        // Radios para los sabores
        flavors.forEach { flavor ->
            Row(
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (flavor == selectedFlavor),
                    onClick = { selectedFlavor = flavor }
                )
                Text(flavor)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onOrderConfirmed,   // 👈 usamos el callback
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar pedido")
        }
    }
}
