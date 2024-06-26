package data.models


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class League(
    @SerializedName("idLeague")
    val idLeague: Int?,
    @SerializedName("idSoccerXML")
    val idSoccerXML: Int?,
    @SerializedName("idAPIfootball")
    val idAPIfootball: Int?,
    @SerializedName("strSport")
    val strSport: String?,
    @SerializedName("strLeague")
    val strLeague: String?,
    @SerializedName("strLeagueAlternate")
    val strLeagueAlternate: String?,
    @SerializedName("intDivision")
    val intDivision: Int?,
    @SerializedName("idCup")
    val idCup: Int?,
    @SerializedName("strCurrentSeason")
    val strCurrentSeason: String?,
    @SerializedName("intFormedYear")
    val intFormedYear: String?,
    @SerializedName("dateFirstEvent")
    val dateFirstEvent: String?,
    @SerializedName("strGender")
    val strGender: String?,
    @SerializedName("strCountry")
    val strCountry: String?,
    @SerializedName("strWebsite")
    val strWebsite: String?,
    @SerializedName("strFacebook")
    val strFacebook: String?,
    @SerializedName("strInstagram")
    val strInstagram: String?,
    @SerializedName("strTwitter")
    val strTwitter: String?,
    @SerializedName("strYoutube")
    val strYoutube: String?,
    @SerializedName("strRSS")
    val strRSS: String?,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String?,
    @SerializedName("strDescriptionDE")
    val strDescriptionDE: String?,
    @SerializedName("strDescriptionFR")
    val strDescriptionFR: String?,
    @SerializedName("strDescriptionIT")
    val strDescriptionIT: String?,
    @SerializedName("strDescriptionCN")
    val strDescriptionCN: String?,
    @SerializedName("strDescriptionJP")
    val strDescriptionJP: String?,
    @SerializedName("strDescriptionRU")
    val strDescriptionRU: String?,
    @SerializedName("strDescriptionES")
    val strDescriptionES: String?,
    @SerializedName("strDescriptionPT")
    val strDescriptionPT: String?,
    @SerializedName("strDescriptionSE")
    val strDescriptionSE: String?,
    @SerializedName("strDescriptionNL")
    val strDescriptionNL: String?,
    @SerializedName("strDescriptionHU")
    val strDescriptionHU: String?,
    @SerializedName("strDescriptionNO")
    val strDescriptionNO: String?,
    @SerializedName("strDescriptionPL")
    val strDescriptionPL: String?,
    @SerializedName("strDescriptionIL")
    val strDescriptionIL: String?,
    @SerializedName("strTvRights")
    val strTvRights: String?,
    @SerializedName("strFanart1")
    val strFanart1: String?,
    @SerializedName("strFanart2")
    val strFanart2: String?,
    @SerializedName("strFanart3")
    val strFanart3: String?,
    @SerializedName("strFanart4")
    val strFanart4: String?,
    @SerializedName("strBanner")
    val strBanner: String?,
    @SerializedName("strBadge")
    val strBadge: String?,
    @SerializedName("strLogo")
    val strLogo: String?,
    @SerializedName("strPoster")
    val strPoster: String?,
    @SerializedName("strTrophy")
    val strTrophy: String?,
    @SerializedName("strNaming")
    val strNaming: String?,
    @SerializedName("strComplete")
    val strComplete: String?,
    @SerializedName("strLocked")
    val strLocked: String?,
)