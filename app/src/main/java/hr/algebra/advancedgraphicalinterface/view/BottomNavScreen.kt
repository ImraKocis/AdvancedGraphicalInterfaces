package hr.algebra.advancedgraphicalinterface.view

import hr.algebra.advancedgraphicalinterface.R

sealed class BottomNavScreen(
    val route: String,
    val title: Int,
) {
    object ActionBar : BottomNavScreen(route = "action", title = R.string.action_bar)
    object Card : BottomNavScreen(route = "card", title = R.string.card)
    object LazyColumn : BottomNavScreen(route = "lazy", title = R.string.lazy_column)
}
