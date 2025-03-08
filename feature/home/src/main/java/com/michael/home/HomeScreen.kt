package com.michael.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.michael.ui.components.CenteredColumn
import kotlinx.serialization.Serializable

@Composable
fun HomeScreen() {
    CenteredColumn {
        Text(text = "Home Screen")
    }
}

@Serializable
object HomeScreenDestination
