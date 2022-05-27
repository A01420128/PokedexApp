package mx.tec.pokedex.data

import com.google.gson.annotations.SerializedName

data class PokemonResultResponse(
    @SerializedName ("name") val name: String,
    @SerializedName("url") var url: String
)
