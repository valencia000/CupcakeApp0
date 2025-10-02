package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreen(
    quantityOptions: List<Pair<Int, Int>>,
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Selecciona la cantidad de cupcakes:")

        quantityOptions.forEach { item ->
            Button(
                onClick = { onNextButtonClicked(item.second) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Opción ${item.second}")
            }
        }
    }
}

