// NavGraph.kt
package com.example.cupcakeapp1.navigation

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cupcakeapp1.data.DataSource
import com.example.cupcakeapp1.ui.FlavorScreen
import com.example.cupcakeapp1.ui.StartOrderScreen

@Composable
fun CupcakeNavGraph() {
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "start"
    ) {
        // Pantalla de inicio: seleccionar cantidad
        composable("start") {
            StartOrderScreen(
                quantityOptions = DataSource.quantityOptions,
                onNextButtonClicked = { selectedQuantity ->
                    navController.navigate("flavor/$selectedQuantity")
                }
            )
        }

        // Pantalla de selección de sabores
        composable(
            route = "flavor/{quantity}",
            arguments = listOf(navArgument("quantity") { type = NavType.IntType })
        ) { backStackEntry ->
            val quantity = backStackEntry.arguments?.getInt("quantity") ?: 1
            FlavorScreen(
                selectedQuantity = quantity,
                onConfirmOrder = {
                    Toast.makeText(
                        context,
                        "¡Felicidades! Confirmaste tu pedido",
                        Toast.LENGTH_LONG
                    ).show()
                    navController.popBackStack("start", inclusive = false)
                }
            )
        }
    }
}
