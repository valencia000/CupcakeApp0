package com.example.cupcakeapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.cupcakeapp1.data.DataSource
import com.example.cupcakeapp1.ui.StartOrderScreen
import com.example.cupcakeapp1.ui.theme.CupcakeAppTheme
import com.example.cupcakeapp1.R

class CupcakeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeAppTheme {
                StartOrderScreen(
                    quantityOptions = DataSource.quantityOptions,
                    onNextButtonClicked = { cantidadSeleccionada ->
                        println("Cantidad seleccionada: $cantidadSeleccionada")
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(R.dimen.padding_medium))
                )
            }
        }
    }
}


