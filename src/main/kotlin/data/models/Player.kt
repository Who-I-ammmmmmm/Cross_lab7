package data.models


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    @SerializedName("idPlayer")
    val idPlayer: Int?,
    @SerializedName("idTeam")
    val idTeam: Int?,
    @SerializedName("idTeam2")
    val idTeam2: Int?,
    @SerializedName("idSoccerXML")
    val idSoccerXML: Int?,
    @SerializedName("idAPIfootball")
    val idAPIfootball: Int?,
    @SerializedName("idPlayerManager")
    val idPlayerManager: Int?,
    @SerializedName("idWikidata")
    val idWikidata: String?,
    @SerializedName("strNationality")
    val strNationality: String?,
    @SerializedName("strPlayer")
    val strPlayer: String?,
    @SerializedName("strPlayerAlternate")
    val strPlayerAlternate: String?,
    @SerializedName("strTeam")
    val strTeam: String?,
    @SerializedName("strTeam2")
    val strTeam2: String?,
    @SerializedName("strSport")
    val strSport: String?,
    @SerializedName("intSoccerXMLTeamID")
    val intSoccerXMLTeamID: Int?,
    @SerializedName("dateBorn")
    val dateBorn: String?,
    @SerializedName("strNumber")
    val strNumber: String?,
    @SerializedName("dateSigned")
    val dateSigned: String?,
    @SerializedName("strSigning")
    val strWage: String?,
    @SerializedName("strOutfitter")
    val strOutfitter: String?,
    @SerializedName("strKit")
    val strKit: String?,
    @SerializedName("strAgent")
    val strAgent: String?,
    @SerializedName("strBirthLocation")
    val strBirthLocation: String?,
    @SerializedName("strEthnicity")
    val strEthnicity: String?,
    @SerializedName("strStatus")
    val strStatus: String?,
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
    @SerializedName("strGender")
    val strGender: String?,
    @SerializedName("strSide")
    val strSide: String?,
    @SerializedName("strPosition")
    val strPosition: String?,
    @SerializedName("strCollege")
    val strCollege: String?,
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
    @SerializedName("strHeight")
    val strHeight: String?,
    @SerializedName("strWeight")
    val strWeight: String?,
    @SerializedName("intLoved")
    val intLoved: String?,
    @SerializedName("strThumb")
    val strThumb: String?,
    @SerializedName("strCutout")
    val strCutout: String?,
    @SerializedName("strRender")
    val strRender: String?,
    @SerializedName("strBanner")
    val strBanner: String?,
    @SerializedName("strFanart1")
    val strFanart1: String?,
    @SerializedName("strFanart2")
    val strFanart2: String?,
    @SerializedName("strFanart3")
    val strFanart3: String?,
    @SerializedName("strFanart4")
    val strFanart4: String?,
    @SerializedName("strCreativeCommons")
    val strCreativeCommons: String?,
    @SerializedName("strLocked")
    val strLocked: String?,
)