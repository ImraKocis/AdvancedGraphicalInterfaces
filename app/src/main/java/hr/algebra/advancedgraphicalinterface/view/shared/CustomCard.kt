package hr.algebra.advancedgraphicalinterface.view.shared

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Check
import androidx.compose.material.icons.twotone.Work
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import hr.algebra.advancedgraphicalinterface.lib.ToDo
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox

@Composable
private fun CustomCard(
    modifier: Modifier = Modifier,
    todo: ToDo,
    isSnoozed: Boolean,
    isDone: Boolean
) {

    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Row(
            modifier
                .fillMaxWidth()
                .shadow(1.dp)
                .background(MaterialTheme.colorScheme.surfaceColorAtElevation(8.dp))
                .padding(vertical = 16.dp, horizontal = 20.dp)
                .animateContentSize()
        ) {
            Box(
                Modifier
                    .padding(top = 2.dp)
                    .size(52.dp)
                    .background(MaterialTheme.colorScheme.primary, CircleShape)
            )

            Column(Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "TODO",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = todo.todo,
                    style = MaterialTheme.typography.bodyMedium
                )

                if (isSnoozed) {
                    Text(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .background(
                                Color.SeaBuckthorn.copy(alpha = 0.4f),
                                RoundedCornerShape(4.dp)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        text = "In process",
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                if (isDone) {
                    Text(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .background(
                                Color.Fern.copy(alpha = 0.4f),
                                RoundedCornerShape(4.dp)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        text = "Marked as done",
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        }
    }
}

@Composable
fun CustomSwipe(modifier: Modifier = Modifier, todo: ToDo) {
    var inProcess by rememberSaveable { mutableStateOf(false) }
    var isDone by rememberSaveable { mutableStateOf(false) }

    val process = SwipeAction(
        icon = rememberVectorPainter(Icons.TwoTone.Work),
        background = Color.SeaBuckthorn,
        onSwipe = { inProcess = !inProcess; isDone = false },
        isUndo = inProcess,
    )
    val archive = SwipeAction(
        icon = rememberVectorPainter(Icons.TwoTone.Check),
        background = Color.Fern,
        onSwipe = { isDone = !isDone; inProcess = false },
        isUndo = isDone,
    )

    SwipeableActionsBox(
        modifier = modifier,
        startActions= listOf(process),
        endActions = listOf( archive),
        swipeThreshold = 40.dp,
        backgroundUntilSwipeThreshold = MaterialTheme.colorScheme.surfaceColorAtElevation(40.dp)
    ) {
        CustomCard(todo = todo, isSnoozed = inProcess, isDone = isDone)
    }
}

val Color.Companion.SeaBuckthorn get() = Color(0xFFF9A825)
val Color.Companion.Fern get() = Color(0xFF66BB6A)