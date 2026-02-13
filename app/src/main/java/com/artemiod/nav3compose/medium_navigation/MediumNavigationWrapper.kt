package com.artemiod.nav3compose.medium_navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.artemiod.nav3compose.basic_navigation.Detail
import com.artemiod.nav3compose.screen.DetailScreen
import com.artemiod.nav3compose.screen.HomeScreen
import kotlinx.serialization.Serializable

@Composable
fun MediumNavigationWrapper() {

    val backStack = rememberNavBackStack(HomeMedium)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = { key ->
            when (key) {
                is HomeMedium -> NavEntry(key) {
                    HomeScreen {
                        backStack.add(DetailMedium(it))
                    }
                }

                is DetailMedium -> NavEntry(key) {
                    DetailScreen(key.id) {
                        backStack.removeLastOrNull()
                    }
                }

                else -> NavEntry(key = Error) {
                    Text("Error :(")
                }
            }
        }
    )
}

@Serializable
data object HomeMedium : NavKey

@Serializable
data class DetailMedium(val id: String) : NavKey

@Serializable
data object Error : NavKey