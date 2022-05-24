package mx.tec.pokedex.navegacion

// Sealed brinda control sobre herencia. La subsclases de esta clase se tienen que conocer en tiempo
// de compilacion.
sealed class NavegacionPantallas(val pantalla : String) {
    object PrimeraPantalla: NavegacionPantallas("primera_pantalla")
    object PokemonsPantalla: NavegacionPantallas("pokemons_pantalla")
}
