package mx.tec.pokedex.mvmm

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mx.tec.pokedex.data.PokemonResultResponse
import mx.tec.pokedex.service.PokemonApiService
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

//Pregunta 8. Porque el hilo de ejecución que ocupa es del del ViewModel.
class PokemonViewModel: ViewModel() {
    var listaPokemons : List<PokemonResultResponse> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")

    fun getPokemons() {
        viewModelScope.launch {
            val apiService = PokemonApiService.getInstance()
            try {
                val pokemons = apiService.getPokemonsList()
                listaPokemons = pokemons.results
                Log.i("Pokedex", listaPokemons.toString())
            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}