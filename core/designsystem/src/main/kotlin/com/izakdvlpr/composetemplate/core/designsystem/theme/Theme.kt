package com.izakdvlpr.composetemplate.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkComposeTemplateScheme = darkColors(
  background = BLACK200,
)

private val LightComposeTemplateScheme = lightColors(
  background = WHITE200,
)

@Composable
fun ComposeTemplateTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val colorScheme = if (darkTheme) DarkComposeTemplateScheme else LightComposeTemplateScheme

  MaterialTheme(
    colors = colorScheme,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}