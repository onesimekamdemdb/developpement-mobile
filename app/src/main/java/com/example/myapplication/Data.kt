package com.example.myapplication.components // Garde le package actuel de ton choix

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Palette
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class Course(
    val title: String,
    val progress: Int,
    val icon: ImageVector,
    val color: Color
)

val greenColor = Color(0xFF4CAF50)
val purpleStart = Color(0xFF4A20BB)
val yellowColor = Color(0xFFF39C12)
val blueColor = Color(0xFF2980B9)

val courses = listOf(
    Course("Kotlin Avancé", 60, Icons.Default.Code, greenColor),
    Course("Développement Android", 40, Icons.Default.Android, purpleStart),
    Course("Bases de données", 75, Icons.Default.Storage, yellowColor),
    Course("UI / UX", 0, Icons.Default.Palette, blueColor)
)

data class Lesson(
    val id: Int,
    val title: String,
    val duration: String,
    val isCompleted: Boolean
)

val androidLessons = listOf(
    Lesson(1, "Introduction à Android", "30 min", true),
    Lesson(2, "Installation et configuration", "45 min", true),
    Lesson(3, "Layouts en Jetpack Compose", "60 min", true),
    Lesson(4, "Gestion des états", "50 min", false),
    Lesson(5, "Navigation", "45 min", false)
)
