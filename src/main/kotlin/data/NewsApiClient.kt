package data

import data.models.Leagues
import data.models.Teams
import data.models.Players
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*

object NewsApiClient {
    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getLeagues(): Leagues {
        val url = "https://thesportsdb.com/api/v1/json/3/search_all_leagues.php?c=Spain&s=Soccer"
        return client.get(url).body()
    }

        suspend fun getTeams(): Teams {
            val url = "https://thesportsdb.com/api/v1/json/3/search_all_teams.php?s=Soccer&c=Spain"
            return client.get(url).body()
        }

    suspend fun getPlayers(): Players {
        val url = "www.thesportsdb.com/api/v1/json/3/searchplayers.php?t=Arsenal"
        return client.get(url).body()
    }
    }
