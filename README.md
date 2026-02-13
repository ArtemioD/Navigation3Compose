# Nav3Compose  navigacion de compose  navigacion 3 🚀

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.6.7-blue)](https://developer.android.com/jetpack/compose)


## NavigationCompose

`NavigationCompose` es una biblioteca para Android Jetpack Compose que simplifica la navegación en tus aplicaciones. Inspirada en `Compose Destinations`, esta biblioteca se enfoca en hacer la navegación más intuitiva y fácil de gestionar.

### Características

- **Navegación sencilla**: Olvídate de complejas configuraciones. Con `NavigationCompose`, puedes navegar entre tus pantallas de forma clara y directa.
- **Argumentos seguros**: Pasa datos entre tus pantallas de manera segura y sin errores.
- **Animaciones personalizables**: Añade un toque de elegancia a tus transiciones con animaciones fluidas y personalizables.

### Cómo funciona

`NavigationCompose` utiliza un `NavHost` que gestiona las pantallas de tu aplicación. Cada pantalla es un `Composable` que se identifica con una `NavKey`. La navegación se realiza a través de un `NavController` que te permite añadir o quitar pantallas de la pila de navegación.

### Instalación

Para usar `NavigationCompose` en tu proyecto, añade la siguiente dependencia en tu archivo `build.gradle`:

```gradle
dependencies {
    implementation("com.github.ArtemioD:Nav3Compose:1.0.1")
}
```

### Ejemplos de uso

A continuación, se muestran algunos ejemplos de cómo puedes usar `NavigationCompose` en tu aplicación.

#### Navegación básica

Para una navegación sencilla, puedes usar las funciones de extensión `navigateTo` y `back` que proporciona la biblioteca.

```kotlin
val backStack = rememberNavBackStack(HomeScreen)

NavHost(backStack) { screen ->
    when (screen) {
        is HomeScreen -> HomeScreen(
            navigateToDetail = { id -> backStack.navigateTo(DetailScreen(id)) }
        )
        is DetailScreen -> DetailScreen(
            id = screen.id,
            navigateBack = { backStack.back() }
        )
    }
}
```

#### Navegación con argumentos

`NavigationCompose` te permite pasar argumentos entre tus pantallas de forma segura. Simplemente, define los argumentos en tu `NavKey` y recíbelos en tu `Composable`.

```kotlin
@NavKey
data class DetailScreen(val id: String)
```

#### Navegación con animaciones

Puedes añadir animaciones a tus transiciones para mejorar la experiencia de usuario. `NavigationCompose` te permite personalizar las animaciones de entrada y salida de tus pantallas.

```kotlin
NavHost(
    backStack = backStack,
    transitionSpec = {
        slideInHorizontally() togetherWith slideOutHorizontally()
    }
) { screen ->
    // ...
}
```

### Contribuciones

Si quieres contribuir a `NavigationCompose`, ¡eres bienvenido! Puedes abrir un _issue_ para reportar un error o una _pull request_ para proponer una mejora.

### Licencia

`NavigationCompose` se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más información.

---

_¡Gracias por usar `NavigationCompose`!_
