package com.example.cupcakeapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.compose.rememberNavController
import com.example.cupcakeapp1.data.DataSource
import com.example.cupcakeapp1.navigation.CupcakeNavGraph
import com.example.cupcakeapp1.ui.theme.CupcakeAppTheme
import com.example.cupcakeapp1.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeAppTheme {
                val navController = rememberNavController()
                CupcakeNavGraph(
                    navController = navController,
                    quantityOptions = DataSource.quantityOptions,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(R.dimen.padding_medium))
                )
            }
        }
    }
}
