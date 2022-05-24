package mx.tec.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.tec.pokedex.navegacion.NavegacionApp
import mx.tec.pokedex.service.PrimeraPantalla
import mx.tec.pokedex.ui.theme.PokedexTheme

/*
Para la lista se necesitan:
¿definir un renglón en xml?
no hay xml

¿tener una clase Adapter y una clase ViewHolder?
tampoco, va en la funcion de compose

¿Se requiere de una lista de datos?
si, recibimos una lista en Pokemones

¿en qué hilo se crea la lista?
En el mismo hila en donde corre la interfaz grafica.

 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavegacionApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokedexTheme {
        NavegacionApp()
    }
}