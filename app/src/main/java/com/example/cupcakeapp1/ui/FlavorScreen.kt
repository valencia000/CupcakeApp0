package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.RadioButton
@Composable
fun FlavorScreen(
    quantity: Int,
    flavors: List<String>,
    onNextButtonClicked: (String, Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedFlavor by remember { mutableStateOf(flavors.first()) }
    val subtotal = quantity * 5000 // ejemplo precio unitario

    Column(modifier = modifier.padding(16.dp)) {
        Text("Selecciona el sabor:")
        Spacer(Modifier.height(16.dp))
        flavors.forEach { flavor ->
            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                RadioButton(
                    selected = flavor == selectedFlavor,
                    onClick = { selectedFlavor = flavor }
                )
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
            Text("Siguiente")
        }
    }
}
