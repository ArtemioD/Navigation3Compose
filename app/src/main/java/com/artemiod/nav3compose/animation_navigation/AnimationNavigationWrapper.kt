package com.artemiod.nav3compose.animation_navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.NavDisplay.predictivePopTransitionSpec
import com.artemiod.nav3compose.advance_navigation.Route
import com.artemiod.nav3compose.screen.DetailScreen
import com.artemiod.nav3compose.screen.HomeScreen

@Composable
fun AnimationNavigationWrapper() {
    val backStack = rememberNavBackStack(Route.HomeAdvance)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.HomeAdvance> {
                HomeScreen {
                    backStack.add(Route.DetailAdvance(it))
                }
            }
            entry<Route.DetailAdvance> {
                DetailScreen(it.id) {
                    backStack.removeLastOrNull()
                }
            }
            entry<Route.ErrorAdvance> {
                Text("Error :(")
            }
        },
        transitionSpec = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(500)
            )
        },
        popTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(500)
            )
        },
       predictivePopTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(500)
            )
        }
    )
}