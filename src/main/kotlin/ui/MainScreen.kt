package ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.*
import data.NewsApiClient
import data.models.League
import data.models.Team
import data.models.Player
import io.ktor.client.plugins.*
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    var leagues by remember { mutableStateOf(emptyList<League>()) }
    var teams by remember { mutableStateOf(emptyList<Team>()) }
    var players by remember { mutableStateOf(emptyList<Player>()) }
    var headerTitle by remember { mutableStateOf("Leagues") }

    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            try {
                teams = fetchTeams()
            } catch (e: ClientRequestException) {
                println("Error fetching teams: ${e.message}")
            }
        }
    }

    Row {
        //SidePanel
        SidePanel(
            onLeaguesClicked = {
                headerTitle = "Leagues"
            },
            onTeamsClicked = {
                headerTitle = "Teams"
            },
            onPlayersClicked = {
                headerTitle = "Players"
            }

        )

        // Content based on headerTitle
        when (headerTitle) {
            "Leagues" -> {
                LaunchedEffect(Unit) {
                    try {
                        leagues = fetchLeagues()
                    } catch (e: ClientRequestException) {
                        println("Error fetching leagues: ${e.message}")
                    }
                }
                LeagueContent(headerTitle, leagues)
            }
            "Teams" -> {
                TeamContent(headerTitle, teams)
            }
            "Players" -> {
                PlayerContent(headerTitle, players)
            }
        }
    }
}

// Создаем suspend функцию fetchLeagues, чтобы вызывать getLeagues из корутины
suspend fun fetchLeagues(): List<League> {
    return NewsApiClient.getLeagues().countries
}

suspend fun fetchTeams(): List<Team> {
    return NewsApiClient.getTeams().teams
}
