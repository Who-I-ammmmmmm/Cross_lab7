package data.models


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Team(
    @SerializedName("idTeam")
    val idTeam: String?,
    @SerializedName("idSoccerXML")
    val idSoccerXML: Int?,
    @SerializedName("idAPIfootball")
    val idAPIfootball: String?,
    @SerializedName("intLoved")
    val intLoved: Int?,
    @SerializedName("strTeam")
    val strTeam: String?,
    @SerializedName("strTeamShort")
    val strTeamShort: String?,
    @SerializedName("strAlternate")
    val strAlternate: String?,
    @SerializedName("intFormedYear")
    val intFormedYear: String?,
    @SerializedName("strSport")
    val strSport: String?,
    @SerializedName("strLeague")
    val strLeague: String?,
    @SerializedName("idLeague")
    val idLeague: String?,
    @SerializedName("strLeague2")
    val strLeague2: String?,
    @SerializedName("idLeague2")
    val idLeague2: String?,
    @SerializedName("strLeague3")
    val strLeague3: String?,
    @SerializedName("idLeague3")
    val idLeague3: String?,
    @SerializedName("strLeague4")
    val strLeague4: String?,
    @SerializedName("idLeague4")
    val idLeague4: String?,
    @SerializedName("strLeague5")
    val strLeague5: String?,
    @SerializedName("idLeague5")
    val idLeague5: String?,
    @SerializedName("strLeague6")
    val strLeague6: String?,
    @SerializedName("idLeague6")
    val idLeague6: String?,
    @SerializedName("strLeague7")
    val strLeague7: String?,
    @SerializedName("idLeague7")
    val idLeague7: String?,
    @SerializedName("strDivision")
    val strDivision: String?,
    @SerializedName("strStadium")
    val strStadium: String?,
    @SerializedName("strKeywords")
    val strKeywords: String?,
    @SerializedName("strRSS")
    val strRSS: String?,
    @SerializedName("strStadiumThumb")
    val strStadiumThumb: String?,
    @SerializedName("strStadiumDescription")
    val strStadiumDescription: String?,
    @SerializedName("strStadiumLocation")
    val strStadiumLocation: String?,
    @SerializedName("intStadiumCapacity")
    val intStadiumCapacity: String?,
    @SerializedName("strWebsite")
    val strWebsite: String?,
    @SerializedName("strFacebook")
    val strFacebook: String?,
    @SerializedName("strTwitter")
    val strTwitter: String?,
    @SerializedName("strInstagram")
    val strInstagram: String?,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String?,
    @SerializedName("strDescriptionDE")
    val strDescriptionDE: String?,
    @SerializedName("strDescriptionFR")
    val strDescriptionFR: String?,
    @SerializedName("strDescriptionCN")
    val strDescriptionCN: String?,
    @SerializedName("strDescriptionIT")
    val strDescriptionIT: String?,
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
    @SerializedName("strDescriptionIL")
    val strDescriptionIL: String?,
    @SerializedName("strDescriptionPL")
    val strDescriptionPL: String?,
    @SerializedName("strKitColour1")
    val strKitColour1: String?,
    @SerializedName("strKitColour2")
    val strKitColour2: String?,
    @SerializedName("strKitColour3")
    val strKitColour3: String?,
    @SerializedName("strGender")
    val strGender: String?,
    @SerializedName("strCountry")
    val strCountry: String?,
    @SerializedName("strTeamBadge")
    val strTeamBadge: String?,
    @SerializedName("strTeamJersey")
    val strTeamJersey: String?,
    @SerializedName("strTeamLogo")
    val strTeamLogo: String?,
    @SerializedName("strTeamFanart1")
    val strTeamFanart1: String?,
    @SerializedName("strTeamFanart2")
    val strTeamFanart2: String?,
    @SerializedName("strTeamFanart3")
    val strTeamFanart3: String?,
    @SerializedName("strTeamFanart4")
    val strTeamFanart4: String?,
    @SerializedName("strTeamBanner")
    val strTeamBanner: String?,
    @SerializedName("strYoutube")
    val strYoutube: String?,
    @SerializedName("strLocked")
    val strLocked: String?
)
