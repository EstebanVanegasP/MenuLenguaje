package com.example.pantalladiferentesopciones.navegacion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PantallaPrincipal(navController: NavController) {
    val languages = listOf("Kotlin", "Java", "Python", "JavaScript", "MySQL")
    var selectedLanguage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text("Lenguajes de Programación", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn {
            items(languages) { language ->
                ListItem(
                    modifier = Modifier.clickable {
                        selectedLanguage = language
                        navController.navigate(language.lowercase())
                    },
                    headlineContent = { Text(language) },
                    supportingContent = { if (language == selectedLanguage) Text("Seleccionado") }
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text("Lenguaje seleccionado: $selectedLanguage", style = MaterialTheme.typography.bodyMedium)
    }
}