package arun.pkg.geminiintegrationapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.compose.rememberNavController
import arun.pkg.chatgptdemoapp.navigation.host.GeminiHost
import arun.pkg.geminiintegrationapp.ui.theme.GeminiIntegrationAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GeminiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = ComposeView(
        context = requireContext()
    ).apply {
        setContent {
            GeminiIntegrationAppTheme {
                GeminiHost(navHostController = rememberNavController())
            }
        }
    }
}