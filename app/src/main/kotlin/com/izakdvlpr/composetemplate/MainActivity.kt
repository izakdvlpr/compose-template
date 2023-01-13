package com.izakdvlpr.composetemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.izakdvlpr.composetemplate.core.designsystem.theme.ComposeTemplateTheme
import com.izakdvlpr.composetemplate.features.home.ComposeTemplateHome

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      ComposeTemplateTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background,
        ) {
          ComposeTemplateHome()
        }
      }
    }
  }
}
