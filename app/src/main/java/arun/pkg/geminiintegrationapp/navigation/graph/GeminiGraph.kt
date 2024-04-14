package arun.pkg.geminiintegrationapp.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import arun.pkg.geminiintegrationapp.compose.TextImagesScreen
import arun.pkg.geminiintegrationapp.compose.MainScreen

import arun.pkg.geminiintegrationapp.navigation.Navigation

fun NavGraphBuilder.geminiGraph(navController: NavController) {
    navigation(
        startDestination = Navigation.Route.ROUTE_MAIN_SCREEN,
        route = Navigation.Route.ROUTE_GEMINI
    ) {
        mainScreen(navController)
        chatScreen()
        textImagesScreen()
        textScreen()
    }
}

fun NavGraphBuilder.mainScreen(navController: NavController) {
    composable(
        route = Navigation.Route.ROUTE_MAIN_SCREEN
    ) {
        MainScreen(navController)
    }
}

fun NavGraphBuilder.chatScreen() {
    composable(
        route = Navigation.Route.ROUTE_CHAT_SCREEN
    ) {
        TextImagesScreen()
    }
}

fun NavGraphBuilder.textImagesScreen() {
    composable(
        route = Navigation.Route.ROUTE_TEXT_IMAGES_SCREEN
    ) {
        // ImageGenerationScreen()
    }
}

fun NavGraphBuilder.textScreen() {
    composable(
        route = Navigation.Route.ROUTE_TEXT_SCREEN
    ) {
        // ChatGPTScreen()
    }
}