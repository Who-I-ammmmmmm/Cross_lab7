package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.models.League
import data.models.Team
import data.models.Player
import utils.*
import java.net.URI

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TeamContent(headerTitle: String, teams: List<Team>) {
    val errorMessage = remember { mutableStateOf<String?>(null) }
    if(teams.isNotEmpty()) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.White).padding(8.dp)
        ) {
            Text(text = headerTitle, fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
            Spacer(Modifier.padding(4.dp))
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 300.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(teams) {
                    Card(
                        modifier = Modifier.width(400.dp).height(200.dp).padding(4.dp).pointerHoverIcon(handCursor())
                            .clickable {
                                try {
                                    if (!it.strWebsite.isNullOrEmpty()) {
                                        openURL(URI(it.strWebsite))
                                    } else {
                                        when (it.strTeam) {
                                            "AD Ceuta FC"     -> openURL(URI("https://adceutafc.com/plantilla/"))
                                            "AD San Juan"     -> openURL(URI("https://adsj-dke.com/"))
                                            "AE Prat"         -> openURL(URI("https://www.aeprat.com/ca/fundacio"))
                                            "Águilas"         -> openURL(URI("https://www.aguilasfc.es/"))
                                            "Alfaro"          -> openURL(URI("https://www.transfermarkt.com/cd-alfaro/startseite/verein/16687"))
                                            "Alhama"          -> openURL(URI("https://en.wikipedia.org/wiki/Alhama_CF"))
                                            "Alzira"          -> openURL(URI("https://udalzira.com/"))
                                            "Anaitasuna"      -> openURL(URI("https://www.cdanaitasuna.eus/"))
                                            "Andratx"         -> openURL(URI("https://www.ceandratx.es/en/"))
                                            "Plantilla"       -> openURL(URI("https://futbolme.com/resultados-directo/equipo/antequera-cf/661/plantilla"))
                                            "Ardoi"           -> openURL(URI("https://ardoifutbol.es/"))
                                            "Arenteiro"       -> openURL(URI("https://en.wikipedia.org/wiki/CD_Arenteiro"))
                                            "Arnedo"          -> openURL(URI("https://en.wikipedia.org/wiki/CD_Arnedo"))
                                            "Arosa"           -> openURL(URI("https://en.wikipedia.org/wiki/Arosa_SC"))
                                            "Atlético Antoniano" -> openURL(URI("https://web.archive.org/web/20130107101917/http://clubatleticoantoniano.es/"))
                                            "Atzeneta"        -> openURL(URI("https://uk.soccerway.com/teams/spain/atzeneta/44491/"))

                                            else -> throw Exception("URL not found for ${it.strTeam}")
                                        }
                                    }
                                } catch (e: Exception) {
                                    when (it.strTeam) {
                                        "Alfaro"       -> openURL(URI("https://www.transfermarkt.com/cd-alfaro/startseite/verein/16687"))
                                        "Algeciras CF" -> openURL(URI("https://algecirasclubdefutbol.com/en/"))
                                        "Antequera"    -> openURL(URI("https://en.wikipedia.org/wiki/Antequera_CF"))
                                        "Arandina"    -> openURL(URI("https://arandinacf.net/"))
                                        "Athletic Bilbao B"    -> openURL(URI("https://www.athletic-club.eus/"))
                                        "Atlético Baleares"    -> openURL(URI("https://www.atleticobaleares.com/en/"))
                                        "Atlético Madrid Juvenil"    -> openURL(URI("https://www.atleticodemadrid.com/?text=Juvenil+A.+Atl%C3%A9tico+de+Madrid"))
                                        "Atlético Paso"    -> openURL(URI("https://atleticopaso.club/"))
                                        "AUGC Deportiva Ceuta"    -> openURL(URI("https://en.wikipedia.org/wiki/AD_Ceuta_FC"))
                                        "Barakaldo"    -> openURL(URI("https://barakaldocf.com/"))
                                        "Barbastro"    -> openURL(URI("https://udbarbastro.es/"))
                                        "Beasain"    -> openURL(URI("https://beasainke.com/eu/hasiera-2/"))
                                        "Bergantiños"    -> openURL(URI("https://en.wikipedia.org/wiki/Berganti%C3%B1os_FC"))

                                        else -> errorMessage.value = "O-ops Something went wrong on the client side. Probably the site is not available right now. Please try again later."
                                    }
                                }
                            }

                    ) {
                        Box {
                            val bitmap = useResource("no_image.png") {
                                loadImageBitmap(it)
                            }

                            if(it.strTeamBadge.isNullOrEmpty()) {
                                Image(
                                    bitmap,
                                    "no image available",
                                    modifier = Modifier.size(100.dp).align(Alignment.TopCenter),
                                    contentScale = ContentScale.Crop
                                )
                            } else {
                                Image(
                                    loadPicture(it.strTeamBadge),
                                    "tumbnail",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                modifier = Modifier.align(Alignment.BottomStart)
                                    .background(Color.White).padding(4.dp)
                            ) {
                                Text(
                                    it.strTeam ?: "",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.padding(2.dp))
                                Text(
                                    it.strDescriptionEN ?: "",
                                    color = Color.Black,
                                    fontWeight = FontWeight.ExtraLight,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }
                }
            }
        }
    } else {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Loading...")
        }
    }
    errorMessage.value?.let { message ->
        AlertDialog(
            onDismissRequest = { errorMessage.value = null },
            title = { Text("Error") },
            text = { Text(message) },
            confirmButton = {
                Button(onClick = { errorMessage.value = null }) {
                    Text("OK")
                }
            }
        )
    }
}

@Composable
fun LeagueContent(headerTitle: String, countries: List<League>) {
    if(countries.isNotEmpty()) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.White).padding(8.dp)
        ) {
            Text(text = headerTitle, fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
            Spacer(Modifier.padding(4.dp))
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 300.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(countries) {
                    Card(
                        modifier = Modifier.width(400.dp).height(200.dp).padding(4.dp).pointerHoverIcon(handCursor())
                            .clickable {
                                if(!it.strWebsite.isNullOrEmpty()) {
                                    openURL(URI(it.strWebsite))
                                }
                            }
                    ) {
                        Box {
                            val bitmap = useResource("no_image.png") {
                                loadImageBitmap(it)
                            }

                            if(it.strBadge.isNullOrEmpty()) {
                                Image(
                                    bitmap,
                                    "no image available",
                                    modifier = Modifier.size(100.dp).align(Alignment.TopCenter),
                                    contentScale = ContentScale.Crop
                                )
                            } else {
                                Image(
                                    loadPicture(it.strBadge),
                                    "tumbnail",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                modifier = Modifier.align(Alignment.BottomStart)
                                    .background(Color.White).padding(4.dp)
                            ) {
                                Text(
                                    it.strLeague ?: "",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.padding(2.dp))
                                Text(
                                    it.strDescriptionEN ?: "",
                                    color = Color.Black,
                                    fontWeight = FontWeight.ExtraLight,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }
                }
            }
        }
    } else {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Loading...")
        }
    }
}


@Composable
fun PlayerContent(headerTitle: String, players: List<Player>) {
    if(players.isNotEmpty()) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.White).padding(8.dp)
        ) {
            Text(text = headerTitle, fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
            Spacer(Modifier.padding(4.dp))
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 300.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(players) {
                    Card(
                        modifier = Modifier.width(400.dp).height(200.dp).padding(4.dp).pointerHoverIcon(handCursor())
                            .clickable {
                                if(!it.strWebsite.isNullOrEmpty()) {
                                    openURL(URI(it.strWebsite))
                                }
                            }
                    ) {
                        Box {
                            val bitmap = useResource("no_image.png") {
                                loadImageBitmap(it)
                            }

                            if(it.strThumb.isNullOrEmpty()) {
                                Image(
                                    bitmap,
                                    "no image available",
                                    modifier = Modifier.size(100.dp).align(Alignment.TopCenter),
                                    contentScale = ContentScale.Crop
                                )
                            } else {
                                Image(
                                    loadPicture(it.strThumb),
                                    "tumbnail",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                modifier = Modifier.align(Alignment.BottomStart)
                                    .background(Color.White).padding(4.dp)
                            ) {
                                Text(
                                    it.strPlayer ?: "",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.padding(2.dp))
                                Text(
                                    it.strDescriptionEN ?: "",
                                    color = Color.Black,
                                    fontWeight = FontWeight.ExtraLight,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }
                }
            }
        }
    } else {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Loading...")
        }
    }
}