package mx.tec.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class PokemonSpriteResponse(
    @SerializedName("front_default") var imgUrl: String
)