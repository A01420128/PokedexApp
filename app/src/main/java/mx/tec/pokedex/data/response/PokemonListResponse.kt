package mx.tec.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class PokemonListResponse(
    @SerializedName("count") var count : Int,
    @SerializedName("results") var results : List<PokemonResultResponse>
)
