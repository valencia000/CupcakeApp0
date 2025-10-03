package com.example.cupcakeapp1

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.cupcakeapp1.navigation.CupcakeNavGraph
import com.example.cupcakeapp1.data.DataSource

@Composable
fun CupcakeApp() {
    val navController = rememberNavController()
    CupcakeNavGraph(
        navController = navController,
        quantityOptions = DataSource.quantityOptions,
        flavors = DataSource.flavors
    )
}
