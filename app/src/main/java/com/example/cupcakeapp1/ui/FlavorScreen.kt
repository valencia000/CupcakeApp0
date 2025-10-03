package com.example.cupcakeapp1.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FlavorScreen(
    quantity: Int,
    flavors: List<String>,
    onNextButtonClicked: (String, Int) -> Unit
) {
    var selectedFlavor by remember { mutableStateOf(flavors.first()) }
    val subtotal = quantity * 1000  // ejemplo: 1000 por cupcake

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Selecciona sabor", style = MaterialTheme.typography.titleMedium)
        Spacer(Modifier.height(16.dp))

        flavors.forEach { flavor ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .clickable { selectedFlavor = flavor }
                    .padding(vertical = 8.dp)
            ) {
                RadioButton(
                    selected = flavor == selectedFlavor,
                    onClick = { selectedFlavor = flavor }
                )
                Spacer(Modifier.width(8.dp))
                Text(flavor)
            }
        }

        Spacer(Modifier.height(16.dp))
        Text("Subtotal: $subtotal")

        Spacer(Modifier.height(16.dp))
        Button(
            onClick = { onNextButtonClicked(selectedFlavor, subtotal) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar sabor")
        }
    }
}
