package com.example.cupcakeapp1.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreen(
    quantityOptions: List<Pair<Int, Int>>,
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text("Selecciona la cantidad de cupcakes:")
        Spacer(Modifier.height(16.dp))
        quantityOptions.forEach { (label, quantity) ->
            Button(
                onClick = { onNextButtonClicked(quantity) },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Cantidad: $quantity")
            }
        }
    }
}

