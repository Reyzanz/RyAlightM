package com.reyzanz.ryalightm.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF8A5CFF),
    secondary = Color(0xFF7CE0C3),
    tertiary = Color(0xFFB0C4FF),
    background = Color(0xFF111827),
    surface = Color(0xFF1F2937)
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6D4AFF),
    secondary = Color(0xFF00B894),
    tertiary = Color(0xFF6C63FF),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFF5F7FF)
)

@Composable
fun RyAlightMTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
