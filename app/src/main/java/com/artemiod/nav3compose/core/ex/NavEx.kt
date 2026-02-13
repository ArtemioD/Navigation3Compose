package com.artemiod.nav3compose.core.ex

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

/**
 * Navega a una nueva pantalla agregándola a la pila de navegación.
 *
 * @param screen La pantalla (NavKey) a la que se desea navegar.
 */
fun NavBackStack<NavKey>.navigateTo(screen: NavKey) {
    add(screen)
}

/**
 * Navega hacia atrás en la pila de navegación.
 * Si la pila está vacía, no hace nada.
 */
fun NavBackStack<NavKey>.back() {
    if(isEmpty()) return
    removeLastOrNull()
}

/**
 * Navega hacia atrás en la pila de navegación hasta una pantalla específica.
 * Elimina todas las pantallas de la pila hasta encontrar la pantalla de destino.
 * Si la pila está vacía o la pantalla de destino no está en la pila, no hace nada.
 *
 * @param targetScreen La pantalla (NavKey) a la que se desea volver.
 */
fun NavBackStack<NavKey>.backTo(targetScreen: NavKey) {
    if(isEmpty()) return
    if (targetScreen !in this) return

    while (isNotEmpty() && last() != targetScreen) {
        removeLastOrNull()
    }
}
