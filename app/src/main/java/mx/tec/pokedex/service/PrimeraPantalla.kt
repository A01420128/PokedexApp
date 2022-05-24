package mx.tec.pokedex.service

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import mx.tec.pokedex.navegacion.NavegacionPantallas

@Composable
fun PrimeraPantalla(navController: NavController) {
    // Configuta elementos de la pantalla. En este caso cambio el titulo de la barra de arriba.
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Pokedex")
            
        }
    }) {
        Detalle(navController)
    }
}

@Composable
fun Detalle(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Primera Pantalla")
        Button(onClick = { navController.navigate(route = NavegacionPantallas.PokemonsPantalla.pantalla)}) {
            Text(text = "Click para ver pokemons")
        }
    }
}
