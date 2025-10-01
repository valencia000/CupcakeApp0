package com.example.cupcakeapp1.data  // <- paquete correcto según tu proyecto

import com.example.cupcakeapp1.R      // <- R ahora apunta al paquete correcto

object DataSource {
    val quantityOptions = listOf(
        Pair(R.string.one_cupcake, 1),
        Pair(R.string.six_cupcakes, 6),
        Pair(R.string.twelve_cupcakes, 12)
    )
}
