package com.stu72159.navigation

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ToMovie2Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Movie 2")
    }
}

@Composable
fun ToMovie3Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Movie 3")
    }
}

@Composable
fun ToMovie4Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Movie 4")
    }
}
@Composable
fun ToHomeButton(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Home")
    }
}

