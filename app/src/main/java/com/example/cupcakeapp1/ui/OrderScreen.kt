package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val flavorOptions = listOf("Vainilla", "Chocolate", "Fresa")

@Composable
fun OrderScreen(quantity: Int) {
    var selectedFlavor by remember { mutableStateOf(flavorOptions[0]) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Cantidad seleccionada: $quantity", style = MaterialTheme.typography.titleMedium)
        Text("Selecciona tu sabor favorito:", style = MaterialTheme.typography.bodyLarge)

        flavorOptions.forEach { flavor ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (flavor == selectedFlavor),
                        onClick = { selectedFlavor = flavor }
                    )
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = (flavor == selectedFlavor),
                    onClick = { selectedFlavor = flavor }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(flavor)
            }
        }

        Button(
            onClick = { /* Confirmar orden */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar orden")
        }
    }
}
