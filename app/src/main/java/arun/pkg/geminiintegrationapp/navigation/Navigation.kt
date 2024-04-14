package arun.pkg.geminiintegrationapp.navigation

object Navigation {
    object Path {
        const val PATH_GEMINI = "gemini"
        const val PATH_MAIN_SCREEN = "main_screen"
        const val PATH_CHAT_SCREEN = "chat_screen"
        const val PATH_TEXT_IMAGES_SCREEN = "text_images_screen"
        const val PATH_TEXT_SCREEN = "text_screen"
        const val PATH_STREAMING_SCREEN = "streaming_screen"
    }

    object Route {
        const val ROUTE_MAIN_SCREEN = Path.PATH_MAIN_SCREEN
        const val ROUTE_GEMINI = Path.PATH_GEMINI
        const val ROUTE_CHAT_SCREEN = Path.PATH_CHAT_SCREEN
        const val ROUTE_TEXT_IMAGES_SCREEN = Path.PATH_TEXT_IMAGES_SCREEN
        const val ROUTE_TEXT_SCREEN = Path.PATH_TEXT_SCREEN
        const val ROUTE_SCREAMING_SCREEN = Path.PATH_STREAMING_SCREEN
    }
}