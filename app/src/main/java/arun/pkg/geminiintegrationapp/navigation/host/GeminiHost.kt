package arun.pkg.chatgptdemoapp.navigation.host

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import arun.pkg.geminiintegrationapp.navigation.Navigation
import arun.pkg.geminiintegrationapp.navigation.graph.geminiGraph

@Composable
fun GeminiHost(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Navigation.Route.ROUTE_GEMINI
    ) {
        geminiGraph(navHostController)
    }
}