# Nav3Compose - Mi Aventura con Navigation 3 en Jetpack Compose 🚀

¡Hola! Este es mi proyecto personal donde exploro y pruebo las funcionalidades de **Navigation 3 para Jetpack Compose**. El objetivo es entender a fondo cómo funciona la navegación en el mundo declarativo de Compose y documentar mi aprendizaje a través de ejemplos prácticos.

## Sobre este proyecto

Este repositorio contiene una colección de implementaciones que demuestran diferentes casos de uso de la navegación en Compose. Cada ejemplo está autocontenido en su propio paquete para que sea fácil de entender y seguir.

---

## Mis Ejemplos de Navegación

Aquí están las pruebas que he realizado hasta ahora:

### 1. Navegación Básica (`basic_navigation`)

Este es el punto de partida. Un ejemplo simple que muestra cómo navegar de una pantalla a otra y volver.

- **Qué se prueba aquí:**
  - Configuración inicial del `NavHost`.
  - Navegación a una nueva pantalla con `navigateTo()`.
  - Regresar a la pantalla anterior con `back()`.


### 2. Navegación Intermedia (`medium_navigation`)

Aquí subimos un poco el nivel. Este ejemplo se enfoca en pasar datos entre pantallas de una manera segura y cómo manejar la pila de navegación de forma más precisa.

- **Qué se prueba aquí:**
  - Pasar argumentos (como un ID) a otra pantalla.
  - Volver a una pantalla específica en la pila de navegación con `backTo()`.


### 3. Navegación Avanzada (`advance_navigation`)

Este ejemplo explora escenarios más complejos, como la navegación condicional y la gestión de flujos de autenticación.

- **Qué se prueba aquí:**
  - Rutas anidadas y flujos de navegación (por ejemplo, un flujo de login).
  - Navegación condicional: decidir a qué pantalla ir basado en un estado (ej. si el usuario está logueado).


### 4. Navegación con Animaciones (`animation_navigation`)

¡Hagamos que se vea bien! Este ejemplo se centra en cómo añadir animaciones personalizadas a las transiciones entre pantallas para una experiencia de usuario más fluida y atractiva.

- **Qué se prueba aquí:**
  - Aplicar transiciones de entrada y salida (`slide`, `fade`, etc.).
  - Personalizar la duración y el tipo de animación.

---

## ¿Cómo probarlo?

1.  Clona este repositorio.
2.  Abre el proyecto en Android Studio.
3.  En `MainActivity.kt`, descomenta la línea del ejemplo que quieras probar (ej. `BasicNavigationWrapper()`).
4.  ¡Ejecuta la app!

