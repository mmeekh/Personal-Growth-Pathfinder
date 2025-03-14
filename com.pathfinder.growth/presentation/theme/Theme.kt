package com.pathfinder.growth.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Fotoğraftan elde edilen renkler
val TurquoiseWater = Color(0xFF47B5BE)
val AutumnOrange = Color(0xFFE67E22)
val MountainGreen = Color(0xFF2E8B57)
val SunriseYellow = Color(0xFFFFA726)
val BridgeWood = Color(0xFFCD853F)
val SkyBlue = Color(0xFF87CEEB)

private val LightColors = lightColorScheme(
    primary = TurquoiseWater,
    secondary = AutumnOrange,
    tertiary = MountainGreen,
    background = Color(0xFFF8F8F8),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
)

private val DarkColors = darkColorScheme(
    primary = TurquoiseWater,
    secondary = AutumnOrange,
    tertiary = MountainGreen,
    background = Color(0xFF1C1B1F),
    surface = Color(0xFF2F2F2F),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
)

@Composable
fun GrowthPathfinderTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}