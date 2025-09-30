package com.example.cupcakeapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.cupcakeapp1.ui.theme.CupcakeApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CupcakeApp1Theme {
                CupcakeApp() // 👉 definido en CupcakeScreen.kt
            }
        }
    }
}
