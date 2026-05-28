package com.example.myapplication.components // Ton package exact avec le "s"

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val recentCoursesList = listOf(
    Course("Kotlin Avance", 60, Icons.Default.Code, greenColor),
    Course("Developpement Android", 40, Icons.Default.Android, purpleStart),
    Course("Base de donnees", 75, Icons.Default.Storage, yellowColor)
)

val categoriesDataList = listOf(
    Course("Kotlin", 0, Icons.Default.Code, greenColor),
    Course("Android", 0, Icons.Default.Android, purpleStart),
    Course("Database", 0, Icons.Default.Storage, yellowColor),
    Course("UI / UX", 0, Icons.Default.Palette, blueColor) // Définis blueColor = Color(0xFF2980B9) si besoin
)

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomNaviationBar() }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(0xFFF7F7F7))
        ) {

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(purpleStart, purpleStart)
                            ),
                            shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
                        )
                        .padding(20.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Menu, contentDescription = null, tint = Color.White)
                            Icon(Icons.Default.Notifications, contentDescription = null, tint = Color.White)
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Bonjour 👋", color = Color.White.copy(alpha = 0.8f), fontSize = 20.sp)
                        Text(text = "Onesime Kamdem", color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Prêt à continuer ton apprentissage ?", color = Color.White.copy(alpha = 0.8f), fontSize = 14.sp)

                        Spacer(modifier = Modifier.height(24.dp))

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text("Rechercher un cours...", color = Color.Gray) },
                            leadingIcon = { Icon(Icons.Default.Search, null, tint = Color.Gray) },
                            shape = RoundedCornerShape(16.dp),
                            singleLine = true,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                focusedBorderColor = Color.Transparent,
                                unfocusedBorderColor = Color.Transparent
                            )
                        )
                    }
                }
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 16.dp)
                ) {
                    SectionTitle(title = "Mes cours récents")

                    Spacer(modifier = Modifier.height(16.dp))

                    recentCoursesList.forEach { course ->
                        CourseProgressCard(course)
                        Spacer(modifier = Modifier.height(12.dp))
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    SectionTitle(title = "Catégories")

                    Spacer(modifier = Modifier.height(16.dp))

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        contentPadding = PaddingValues(end = 16.dp)
                    ) {
                        items(categoriesDataList) { course ->
                            CategoryItem(course)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1E1E1E))
        Text(text = "Voir tout", fontSize = 14.sp, color = purpleStart, fontWeight = FontWeight.Medium)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}