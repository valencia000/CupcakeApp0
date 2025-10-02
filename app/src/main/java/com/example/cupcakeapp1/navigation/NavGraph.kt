package com.example.cupcakeapp1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cupcakeapp1.data.DataSource
import com.example.cupcakeapp1.ui.OrderScreen
import com.example.cupcakeapp1.ui.StartOrderScreen

object CupcakeScreens {
    const val StartOrder = "start_order"
    const val Order = "order"
}

@Composable
fun CupcakeNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = CupcakeScreens.StartOrder
    ) {
        composable(CupcakeScreens.StartOrder) {
            StartOrderScreen(
                quantityOptions = DataSource.quantityOptions,
                onNextButtonClicked = { quantity ->
                    navController.navigate("${CupcakeScreens.Order}/$quantity")
                }
            )
        }

        composable(
            route = "${CupcakeScreens.Order}/{quantity}",
            arguments = listOf(navArgument("quantity") { type = NavType.IntType })
        ) { backStackEntry ->
            val quantity = backStackEntry.arguments?.getInt("quantity") ?: 1
            OrderScreen(quantity = quantity)
        }
    }
}
