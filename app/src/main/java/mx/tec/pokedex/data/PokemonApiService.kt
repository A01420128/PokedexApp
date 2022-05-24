package mx.tec.pokedex.response

import mx.tec.pokedex.data.response.PokemonListResponse
import mx.tec.pokedex.data.response.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApiService {
    @GET("pokemon?limit=151'")
    suspend fun getPokemons(
        @Query("limit") query: Int
    ): PokemonListResponse

    @GET("pokemon/{id}")
    suspend fun getPokemon(
        @Path("id") id: Int
    ): PokemonResponse

}