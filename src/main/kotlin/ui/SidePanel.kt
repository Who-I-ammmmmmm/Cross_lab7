package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import data.models.League
import utils.handCursor
@Composable
fun SidePanel(
    onLeaguesClicked: () -> Unit,
    onTeamsClicked: () -> Unit,
    onPlayersClicked: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(0.15f).fillMaxHeight().padding(12.dp).background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val bitmap = useResource("logo.png") {
            loadImageBitmap(it)
        }

        Image(bitmap,"Logo", modifier = Modifier.width(100.dp))
        Spacer(modifier = Modifier.padding(18.dp))
        TextButton(
            onClick = onTeamsClicked
        ) {
            Text(
                "Teams",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.pointerHoverIcon(handCursor())
            )
        }
        TextButton(
            onClick = onLeaguesClicked
        ) {
            Text(
                "Leagues",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.pointerHoverIcon(handCursor())
            )
        }
        TextButton(
            onClick = onPlayersClicked
        ) {
            Text(
                "Players",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.pointerHoverIcon(handCursor())
            )
        }
    }
}
