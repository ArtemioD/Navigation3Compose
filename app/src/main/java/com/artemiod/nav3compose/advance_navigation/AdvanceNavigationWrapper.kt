package com.artemiod.nav3compose.advance_navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.artemiod.nav3compose.core.ex.back
import com.artemiod.nav3compose.core.ex.navigateTo
import com.artemiod.nav3compose.screen.DetailScreen
import com.artemiod.nav3compose.screen.HomeScreen
import kotlinx.serialization.Serializable

@Composable
fun AdvanceNavigationWrapper() {
    val backStack = rememberNavBackStack(Route.HomeAdvance)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.HomeAdvance> {
                HomeScreen {
                    //backStack.add(Route.DetailAdvance(it))
                    backStack.navigateTo(Route.DetailAdvance(it))
                }
            }
            entry<Route.DetailAdvance> {
                DetailScreen(it.id) {
                    //backStack.removeLastOrNull()
                    backStack.back()
                }
            }
            entry<Route.ErrorAdvance> {
                Text("Error :(")
            }
        }
    )
}
