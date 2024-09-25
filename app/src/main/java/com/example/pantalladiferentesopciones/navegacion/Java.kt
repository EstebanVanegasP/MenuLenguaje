package com.example.pantalladiferentesopciones

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Java(navController: NavController) {
    val description = " Java, es un lenguaje de programación orientado a objetos, es muy popular por sus características y \n" +
            "flexibilidad,  es utilizado actualmente en muchas aplicaciones alrededor del mundo, por ejemplo en \n" +
            "aplicaciones  móviles y sistemas para empresas, entre otras.\n" +
            " Cualquier persona que quiera aprender este lenguaje, deberá conocer sus fundamentos así como los \n" +
            "de la programación orientada a objetos con la finalidad de cumplir el objetivo general de este curso."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Java", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Text(description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.java),
            contentDescription = "Java logo",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.javacodigo),
            contentDescription = "Java example",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { navController.navigate("kotlin") }) {
                Text("Anterior")
            }
            Button(onClick = { navController.navigate("python") }) {
                Text("Siguiente")
            }
        }
    }
}
