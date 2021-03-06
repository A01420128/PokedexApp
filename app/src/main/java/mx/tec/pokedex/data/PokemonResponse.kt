package mx.tec.pokedex.data

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    @SerializedName("name") var name: String,
    @SerializedName("sprites") var sprites: List<PokemonSpriteResponse>
)