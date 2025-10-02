package com.example.cupcakeapp1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
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
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Selecciona la cantidad de cupcakes", style = MaterialTheme.typography.titleMedium)

        quantityOptions.forEach { option ->
            Button(
                onClick = { onNextButtonClicked(option.second) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "${option.second} cupcakes")
            }
        }
    }
}
