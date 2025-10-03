package com.example.cupcakeapp1.ui

import androidx.compose.material3.TextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
@Composable
fun PickupScreen(
    flavor: String,
    subtotal: Int,
    pickupDate: String,
    onNextButtonClicked: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var date by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        Text("Confirma tu pedido:")
        Spacer(Modifier.height(8.dp))
        Text("Sabor: $flavor")
        Text("Subtotal: $subtotal")
        Spacer(Modifier.height(16.dp))
        TextField(
            value = date,
            onValueChange = { date = it },
            label = { Text("Fecha de retiro") }
        )
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = { onNextButtonClicked(date) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar fecha")
        }
    }
}
