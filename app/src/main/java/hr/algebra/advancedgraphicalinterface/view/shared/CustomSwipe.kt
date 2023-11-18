package hr.algebra.advancedgraphicalinterface.view.shared

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Archive
import androidx.compose.material.icons.twotone.ReplyAll
import androidx.compose.material.icons.twotone.Snooze
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import me.saket.swipe.SwipeAction
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import me.saket.swipe.SwipeableActionsBox

//@Composable
//fun CustomSwipe(modifier: Modifier = Modifier) {
//    var isSnoozed by rememberSaveable { mutableStateOf(false) }
//    var isArchived by rememberSaveable { mutableStateOf(false) }
//
//    val replyAll = SwipeAction(
//        icon = rememberVectorPainter(Icons.TwoTone.ReplyAll),
//        background = Color.Perfume,
//        onSwipe = { println("Reply swiped") },
//        isUndo = false,
//    )
//    val snooze = SwipeAction(
//        icon = rememberVectorPainter(Icons.TwoTone.Snooze),
//        background = Color.SeaBuckthorn,
//        onSwipe = { isSnoozed = !isSnoozed },
//        isUndo = isSnoozed,
//    )
//    val archive = SwipeAction(
//        icon = rememberVectorPainter(Icons.TwoTone.Archive),
//        background = Color.Fern,
//        onSwipe = { isArchived = !isArchived },
//        isUndo = isArchived,
//    )
//
//    SwipeableActionsBox(
//        modifier = modifier,
//        startActions = listOf(replyAll),
//        endActions = listOf(snooze, archive),
//        swipeThreshold = 40.dp,
//        backgroundUntilSwipeThreshold = MaterialTheme.colorScheme.surfaceColorAtElevation(40.dp)
//    ) {
//    }
//}

