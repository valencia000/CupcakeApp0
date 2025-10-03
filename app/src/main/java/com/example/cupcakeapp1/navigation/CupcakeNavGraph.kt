package com.example.cupcakeapp1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cupcakeapp1.ui.StartOrderScreen
import com.example.cupcakeapp1.ui.FlavorScreen
import com.example.cupcakeapp1.ui.PickupScreen
import com.example.cupcakeapp1.ui.ConfirmationScreen
import com.example.cupcakeapp1.data.DataSource

@Composable
fun CupcakeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "start_order"
    ) {

        // 1️⃣ Start Order Screen
        composable("start_order") {
            StartOrderScreen(
                quantityOptions = DataSource.quantityOptions,
                onNextButtonClicked = { quantity ->
                    navController.currentBackStackEntry?.savedStateHandle?.set("quantity", quantity)
                    navController.navigate("flavor_selection")
                }
            )
        }

        // 2️⃣ Flavor Screen
        composable("flavor_selection") {
            val quantity = navController.previousBackStackEntry
                ?.savedStateHandle?.get<Int>("quantity") ?: 1

            FlavorScreen(
                quantity = quantity,
                flavors = DataSource.flavors,
                onNextButtonClicked = { flavor, subtotal ->
                    navController.currentBackStackEntry?.savedStateHandle?.set("flavor", flavor)
                    navController.currentBackStackEntry?.savedStateHandle?.set("subtotal", subtotal)
                    navController.navigate("pickup")
                }
            )
        }

        // 3️⃣ Pickup Screen
        composable("pickup") {
            val flavor = navController.previousBackStackEntry
                ?.savedStateHandle?.get<String>("flavor") ?: "Cupcake"
            val subtotal = navController.previousBackStackEntry
                ?.savedStateHandle?.get<Int>("subtotal") ?: 0

            PickupScreen(
                flavor = flavor,
                subtotal = subtotal,
                pickupDate = "",
                onNextButtonClicked = { date ->
                    navController.currentBackStackEntry?.savedStateHandle?.set("pickupDate", date)
                    navController.navigate("confirmation")
                }
            )
        }

        // 4️⃣ Confirmation Screen
        composable("confirmation") {
            val flavor = navController.previousBackStackEntry
                ?.savedStateHandle?.get<String>("flavor") ?: "Cupcake"
            val subtotal = navController.previousBackStackEntry
                ?.savedStateHandle?.get<Int>("subtotal") ?: 0
            val pickupDate = navController.previousBackStackEntry
                ?.savedStateHandle?.get<String>("pickupDate") ?: "N/A"

            ConfirmationScreen(
                flavor = flavor,
                subtotal = subtotal,
                pickupDate = pickupDate,
                onOrderConfirmed = {
                    navController.popBackStack("start_order", inclusive = false)
                }
            )
        }
    }
}
