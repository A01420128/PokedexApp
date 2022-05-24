package mx.tec.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class PokemonResultResponse(
    @SerializedName("url") var url: String
)
