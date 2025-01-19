package hr.ferit.fabiomandic.bmwinfoorwim.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

private val DarkColorPalette = darkColors(
    primary = ButtonBlue,
    primaryVariant = LightBlue,
    secondary = LightGray
)

private val LightColorPalette = lightColors(
    primary = ButtonBlue,
    primaryVariant = LightBlue,
    secondary = LightGray,
    background = LightBlue
)

@Composable
fun BMWinfoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
