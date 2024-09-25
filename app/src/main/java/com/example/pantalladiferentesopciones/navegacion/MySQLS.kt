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
fun MySQL(navController: NavController) {
    val description = " MySQL es un sistema gestor de bases de datos que se\n" +
            " puede encuadrar dentro de la categoría de los progra\n" +
            "mas open-source. " +
            "El término open-source surgió del anteriormente usado" +
            " free-software, que hacía referencia a los programas cuyo\n" +
            " código estaba disponible para el usuario, fueran gratui\n" +
            "tos o no. Como free en inglés significa libre pero tam\n" +
            "bién gratis, se prestaba bastante a confusión, por lo\n" +
            " que pasó a utilizarse open-source («código abierto»).\n" +
            " Aunque open-source no siempre implica que su uso sea\n" +
            " gratuito, MySQL sí que lo es."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("MySQL", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Text(description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.mysql),
            contentDescription = "MySQL logo",
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.mysqlcodigo),
            contentDescription = "MySQL example",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { navController.navigate("javascript") }) {
                Text("Anterior")
            }
            Button(onClick = { navController.navigate("pantalla_principal") }) {
                Text("Siguiente")
            }
        }
    }
}

