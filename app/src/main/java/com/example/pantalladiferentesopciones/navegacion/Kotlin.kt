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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Kotlin(navController: NavController) {
    val description = "Kotlin es un lenguaje de programación orientado a objetos de tipo estático desarrollado por \n" +
            "JetBrains que se dirige principalmente a la JVM. Kotlin se ha desarrollado con el objetivo de ser \n" +
            "rápido de compilar, compatible con versiones anteriores, muy seguro para el tipo, y 100% \n" +
            "interoperable con Java. Kotlin también se ha desarrollado con el objetivo de proporcionar muchas \n" +
            "de las funciones que buscan los desarrolladores de Java. El compilador estándar de Kotlin \n" +
            "permite compilarlo tanto en el bytecode de Java para la JVM como en JavaScript."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Kotlin", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Text(description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.kotlin),
            contentDescription = "Kotlin logo",
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.kotlincodigo),
            contentDescription = "Kotlin example",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { navController.navigate("pantalla_principal") }) {
                Text("pantalla principal")
            }
            Button(onClick = { navController.navigate("java") }) {
                Text("java")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewKotlinScreen() {
    Kotlin(navController = rememberNavController())
}
