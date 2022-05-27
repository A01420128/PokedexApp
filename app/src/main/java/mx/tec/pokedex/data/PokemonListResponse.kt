package mx.tec.pokedex.data

import com.google.gson.annotations.SerializedName

data class PokemonListResponse(
    @SerializedName("count") var count : Int,
    @SerializedName("next") val next: String,
    @SerializedName("previous") val previous: String,
    @SerializedName("results") var results : List<PokemonResultResponse>
)
