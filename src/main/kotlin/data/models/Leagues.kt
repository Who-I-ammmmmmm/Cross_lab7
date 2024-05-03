package data.models


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Leagues(
    @SerializedName("countries")
    val countries: List<League>,
)