package com.example.cupcakeapp1.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cupcakeapp1.ui.StartOrderScreen
import com.example.cupcakeapp1.ui.OrderScreen

@Composable
fun CupcakeNavGraph(
    navController: NavHostController,
    quantityOptions: List<Pair<Int, Int>>,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "start_order",
        modifier = modifier
    ) {
        composable("start_order") {
            StartOrderScreen(
                quantityOptions = quantityOptions,
                onNextButtonClicked = { cantidad ->
                    // Navegar a la pantalla de pedido con la cantidad seleccionada
                    navController.navigate("order/$cantidad")
                },
                modifier = Modifier.fillMaxSize()
            )
        }

        composable("order/{cantidad}") { backStackEntry ->
            val cantidad = backStackEntry.arguments?.getString("cantidad")?.toIntOrNull() ?: 0
            OrderScreen(cantidad = cantidad)
        }
    }
}
