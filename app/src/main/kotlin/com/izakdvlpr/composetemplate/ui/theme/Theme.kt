package com.izakdvlpr.composetemplate.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val colors = lightColors(
  primary = Purple500,
  primaryVariant = Purple700,
  secondary = Teal200
)

@Composable
fun ComposeTemplateTheme(content: @Composable () -> Unit) {
  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}