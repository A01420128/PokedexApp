package mx.tec.pokedex.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.tec.pokedex.service.PokemonsPantalla
import mx.tec.pokedex.service.PrimeraPantalla

@Composable
fun NavegacionApp() {
    // RememberNavController regresa un controllador para el nav host el cual
    // administra el ComposableNavigator con el cual se puede ir a los destinos
    // definidos abajo.
    val navController = rememberNavController()

    // En el NavHOst se define la jerarquia de comopose para que pueda ocurrir la navegacion.
    NavHost(navController = navController, startDestination =
        NavegacionPantallas.PrimeraPantalla.pantalla) {
        composable(route = NavegacionPantallas.PrimeraPantalla.pantalla) {
            PrimeraPantalla(navController)
        }
        composable(route = NavegacionPantallas.PokemonsPantalla.pantalla) {
            PokemonsPantalla(navController)
        }

    }
}