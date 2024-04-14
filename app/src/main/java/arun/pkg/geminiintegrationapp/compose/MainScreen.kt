package arun.pkg.geminiintegrationapp.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import arun.pkg.geminiintegrationapp.navigation.Navigation

@Composable
@Preview
private fun PreviewMainScreen() {
    MainScreenView()
}

@Composable
fun MainScreen(navController: NavController) {
    MainScreenView(
        onTextImageSearch = {
            navController.navigate(Navigation.Route.ROUTE_CHAT_SCREEN)
        },
//        onTextSearch = {
//            navController.navigate(Navigation.Route.ROUTE_IMAGES_SCREEN)
//        }
    )
}

@Composable
private fun MainScreenView(
    onTextImageSearch: () -> Unit = {},
    onTextSearch: () -> Unit = {},
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                Color.White
            )
            .padding(20.dp)
    ) {
        Button(onClick = {
            onTextImageSearch()
        }) {
            Text(text = "Text Image Search")
        }
        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick = {
            onTextSearch()
        }) {
            Text(text = "Text Search (In-progress)")
        }
        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick = {

        }) {
            Text(text = "Chat (In-progress)")
        }
        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick = {

        }) {
            Text(text = "Streaming Search (In-progress)")
        }
        Spacer(modifier = Modifier.padding(16.dp))
    }
}



