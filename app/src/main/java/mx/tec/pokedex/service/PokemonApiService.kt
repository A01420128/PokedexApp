package mx.tec.pokedex.service

import mx.tec.pokedex.data.PokemonListResponse
import mx.tec.pokedex.data.PokemonResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface PokemonApiService {
    // Pregunta 6. Aquí se le indica a Retrofit que va a insertar código para hacer una llamada "Get".
    @GET("pokemon")
    suspend fun getPokemonsList(): PokemonListResponse

    @GET("pokemon/{id}")
    suspend fun getPokemon(
        @Path("id") id: Int
    ): PokemonResponse


    companion object{
        var apiService: PokemonApiService? = null
        fun getInstance() : PokemonApiService{
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://pokeapi.co/api/v2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(PokemonApiService::class.java)
            }
            return apiService!!
        }

    }
}