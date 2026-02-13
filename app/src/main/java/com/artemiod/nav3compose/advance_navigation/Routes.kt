package com.artemiod.nav3compose.advance_navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Route() : NavKey {

    @Serializable
    data object HomeAdvance : Route()

    @Serializable
    data class DetailAdvance(val id: String) : Route()

    @Serializable
    data object ErrorAdvance : Route()
}