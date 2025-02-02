package hr.ferit.fabiomandic.bmwinfoorwim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import hr.ferit.fabiomandic.bmwinfoorwim.ui.theme.BMWinfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMWinfoTheme {
                val sharedViewModel: ViewModel = viewModel()
                NavigationController(sharedViewModel)
            }
        }
    }
}
