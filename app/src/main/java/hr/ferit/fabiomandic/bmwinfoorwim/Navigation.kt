package hr.ferit.fabiomandic.bmwinfoorwim

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

object Routes {
    const val SCREEN_MAIN = "main"
    const val SCREEN_MODELS = "models"
    const val SCREEN_DETAILS = "details/{carId}"
    const val SCREEN_ADD_MODEL = "add_new_model"
}


@Composable
fun NavigationController(viewModel: ViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SCREEN_MAIN) {


        composable(Routes.SCREEN_MAIN) {
            MainScreen(navController, viewModel)
        }

        composable(Routes.SCREEN_MODELS) {
            ModelsScreen(navController, viewModel)
        }


        composable(
            Routes.SCREEN_DETAILS,
            arguments = listOf(
                navArgument("carId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val carId = backStackEntry.arguments?.getInt("carId") ?: 0
            DetailsScreen(navController, carId, viewModel)
        }



        composable(Routes.SCREEN_ADD_MODEL) {
            AddNewModelScreen(navController, viewModel)
        }
    }
}
