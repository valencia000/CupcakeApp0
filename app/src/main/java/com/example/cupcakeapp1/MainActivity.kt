package com.example.cupcakeapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cupcakeapp1.navigation.CupcakeNavGraph
import com.example.cupcakeapp1.ui.theme.CupcakeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeAppTheme {
                CupcakeNavGraph()
            }
        }
    }
}
