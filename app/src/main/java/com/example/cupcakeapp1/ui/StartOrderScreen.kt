package com.example.cupcakeapp1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cupcakeapp1.R
import com.example.cupcakeapp1.ui.theme.CupcakeAppTheme

@Composable
fun StartOrderScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))

            Image(
                painter = painterResource(R.drawable.cupcake),
                contentDescription = null,
                modifier = Modifier.width(300.dp)
            )

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))

            // Título de pedido
            Text(
                text = stringResource(R.string.order_cupcakes),
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartOrderPreview() {
    CupcakeAppTheme {
        StartOrderScreen()
    }
}

