package com.adso.myappsplash.navigation

enum class Screen { // Names to identify the screens
    LOGIN,
    HOME,
    DETAIL
}

// Objects to identify where navigate
sealed class NavigationItem(val route: String) {
    object Login: NavigationItem(Screen.LOGIN.name)
    object Home: NavigationItem(Screen.HOME.name)
    object Detail: NavigationItem(Screen.DETAIL.name)
}