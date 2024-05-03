package data.models


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Teams(
    @SerializedName("teams")
    val teams: List<Team>,
)