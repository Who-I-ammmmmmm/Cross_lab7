package data.models


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Players(
    @SerializedName("player")
    val player: List<Player>,
)