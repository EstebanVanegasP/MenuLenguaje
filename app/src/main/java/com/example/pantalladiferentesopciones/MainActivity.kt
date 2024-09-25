package com.example.pantalladiferentesopciones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pantalladiferentesopciones.navegacion.PantallaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                PantallaNav()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface {
            content()
        }
    }
}

@Composable
fun PantallaNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "pantalla_principal") {
        composable("pantalla_principal") { PantallaPrincipal(navController) }
        composable("kotlin") { Kotlin(navController) }
        composable("java") { Java(navController) }
        composable("python") { Python(navController) }
        composable("javascript") { JavaScript(navController) }
        composable("mysql") { MySQL(navController) }
    }
}


