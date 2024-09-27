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
fun JavaScript(navController: NavController) {
    val description = "Javascript es un lenguaje de programación, o lo que es lo mismo, un mecanismo \n" +
            "con el que podemos decirle a nuestro navegador que tareas debe realizar, en qué \n" +
            "orden y cuantas veces (por ejemplo). \n" +
            "Muchas de las tareas que realizamos con HTML y CSS se podrían realizar con \n" +
            "Javascript. De hecho, es muy probable que al principio nos parezca que es mucho \n" +
            "más complicado hacerlo con Javascript, y que por lo tanto no merece la pena. Sin \n" +
            "embargo, con el tiempo veremos que Javascript nos ofrece una mayor flexibilidad y \n" +
            "un abanico de posibilidades más grande, y que bien usadas, pueden ahorrarnos \n" +
            "bastante tiempo."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("JavaScript", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Text(description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.js),
            contentDescription = "JavaScript logo",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.jscodigo),
            contentDescription = "JavaScript example",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Botones de navegación
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { navController.navigate("python") }) {
                Text("python")
            }
            Button(onClick = { navController.navigate("mysql") }) {
                Text("mysql")
            }
        }
    }
}

