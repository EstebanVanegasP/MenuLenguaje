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
fun Python(navController: NavController) {
    val description = " Python es un lenguaje de programación creado por Guido van Rossum \n" +
            "a principios de los años 90 cuyo nombre está inspirado en el grupo de \n" +
            "cómicos ingleses “Monty Python”. Es un lenguaje similar a Perl, pero \n" +
            "con una sintaxis muy limpia y que favorece un código legible.\n" +
            " Se trata de un lenguaje interpretado o de script, con tipado dinámico, \n" +
            "fuertemente tipado, multiplataforma y orientado a objetos"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Python", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Text(description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.python),
            contentDescription = "Python logo",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.pythoncodigo),
            contentDescription = "Python example",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { navController.navigate("java") }) {
                Text("java")
            }
            Button(onClick = { navController.navigate("javascript") }) {
                Text("javascript")
            }
        }
    }
}

