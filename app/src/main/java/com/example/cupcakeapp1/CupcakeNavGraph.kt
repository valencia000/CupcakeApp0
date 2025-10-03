package com.example.cupcakeapp1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cupcakeapp1.ui.StartOrderScreen
import com.example.cupcakeapp1.ui.FlavorScreen
import com.example.cupcakeapp1.ui.ConfirmationScreen

object DataSource {
    val quantityOptions = listOf(1 to 1, 2 to 6, 3 to 12)
    val flavors = listOf("Vainilla", "Chocolate", "Fresa")
}

@Composable
fun CupcakeNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "start_order") {

        composable("start_order") {
            StartOrderScreen(
                quantityOptions = DataSource.quantityOptions,
                onNextButtonClicked = { quantity ->
                    navController.currentBackStackEntry?.savedStateHandle?.set("quantity", quantity)
                    navController.navigate("flavor_selection")
                }
            )
        }

        composable("flavor_selection") {
            val quantity = navController.previousBackStackEntry
                ?.savedStateHandle?.get<Int>("quantity") ?: 1

            FlavorScreen(
                quantity = quantity,
                flavors = DataSource.flavors,
                onNextButtonClicked = { flavor, subtotal ->
                    navController.currentBackStackEntry?.savedStateHandle?.set("flavor", flavor)
                    navController.currentBackStackEntry?.savedStateHandle?.set("subtotal", subtotal)
                    navController.navigate("confirmation")
                }
            )
        }

        composable("confirmation") {
            val flavor = navController.previousBackStackEntry
                ?.savedStateHandle?.get<String>("flavor") ?: "Cupcake"
            val subtotal = navController.previousBackStackEntry
                ?.savedStateHandle?.get<Int>("subtotal") ?: 0

            ConfirmationScreen(
                flavor = flavor,
                subtotal = subtotal,
                onOrderConfirmed = {
                    // Volver a inicio
                    navController.popBackStack("start_order", inclusive = false)
                }
            )
        }
    }
}
