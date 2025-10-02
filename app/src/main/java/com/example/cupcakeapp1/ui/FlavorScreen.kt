package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cupcakeapp1.ui.theme.CupcakeAppTheme

@Composable
fun FlavorScreen(
    selectedQuantity: Int,
    onConfirmOrder: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Lista de sabores
    val flavors = listOf("Vainilla", "Chocolate", "Fresa", "Red Velvet")
    var selectedFlavor by remember { mutableStateOf(flavors.first()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Seleccionaste $selectedQuantity cupcake(s).")
        Text(text = "Elige el sabor:")

        flavors.forEach { flavor ->
            Row(
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (flavor == selectedFlavor),
                    onClick = { selectedFlavor = flavor }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = flavor)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                // Al presionar, ejecuta el callback
                onConfirmOrder()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar Pedido")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlavorScreenPreview() {
    CupcakeAppTheme {
        FlavorScreen(
            selectedQuantity = 6,
            onConfirmOrder = { /* preview */ }
        )
    }
}
