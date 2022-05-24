package mx.tec.pokedex.service

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PokemonsPantalla(navController: NavController) {
    // Agrega un icono que hace back y un titulo a la top app bar.
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Pokedex List")
        }
    }) {
        Pokemones()
    }
}

@Composable
private fun Pokemon(name: String) {
    val expanded = remember {
        mutableStateOf(false)
    }
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    // El elemento de visualizacion central para jetpack compose.
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp)
    ) {
        // Es un elemento que pone a sus hijos uno abajo del otro.
        Row(modifier = Modifier.padding(25.dp)) {
            Column(
                Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)
            ) {
                Text(text = "Pokemon: ")
                Text(text = name)
            }
            // Es botton de enfasis medio, que tiene un contorno.
            OutlinedButton(onClick = { expanded.value = !expanded.value }) {
                Text(if (expanded.value) "hide" else "catch")
            }
        }
    }
}

@Composable
private fun Pokemones(cameos: List<String> = List(10) { "$it"}) {
    val scrollState = rememberScrollState()
    
    Column(modifier = Modifier
        .padding(vertical = 5.dp)
        .verticalScroll(scrollState)
    ) {
        for (cameo in cameos) {
            Pokemon(name = cameo)
        }
    }
}