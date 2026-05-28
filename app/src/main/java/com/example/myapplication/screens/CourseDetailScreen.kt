package com.example.myapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Adb
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CourseDetailScreen() {
    Scaffold(
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF7F7F7))
                    .padding(horizontal = 24.dp, vertical = 16.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = purpleStart),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = "Continuer le cours",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color(0xFFF7F7F7))
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 24.dp)
            ) {

                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(280.dp)
                            .background(
                                brush = Brush.verticalGradient(
                                    listOf(Color(0xFFA2E1D4), Color(0xFFE3F6F2))
                                )
                            )
                            .padding(top = 16.dp, start = 24.dp, end = 0.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.Adb,
                            contentDescription = null,
                            tint = greenColor,
                            modifier = Modifier
                                .size(170.dp)
                                .align(Alignment.BottomEnd)
                                .offset(x = 25.dp, y = -35.dp)
                        )

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(end = 24.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Retour", tint = Color(0xFF2C3E50))
                                Icon(Icons.Default.BookmarkBorder, contentDescription = "Sauvegarder", tint = Color(0xFF2C3E50))
                            }

                            Spacer(modifier = Modifier.height(24.dp))

                            Column(modifier = Modifier.width(180.dp)) {
                                Text(
                                    text = "Développement\nAndroid",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1E1E1E),
                                    lineHeight = 32.sp
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Apprenez à créer des applications Android modernes avec Kotlin et Jetpack Compose.",
                                    fontSize = 12.sp,
                                    color = Color(0xFF555555),
                                    lineHeight = 17.sp
                                )
                            }
                        }
                    }
                }

                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp)
                    ) {
                        Spacer(modifier = Modifier.height(55.dp))

                        Text(
                            text = "À propos du cours",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Ce cours vous guide pas à pas dans la création d'applications Android modernes en utilisant les meilleures pratiques et les outils recommandés par Google.",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            lineHeight = 20.sp
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = "Contenu du cours",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                    }
                }

                items(androidLessons) { lesson ->
                    Box(modifier = Modifier.padding(horizontal = 24.dp, vertical = 5.dp)) {
                        LessonItem(lesson = lesson)
                    }
                }
            }

            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .align(Alignment.TopCenter)
                    .offset(y = 240.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.TrendingUp, contentDescription = null, tint = Color.Gray, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Column {
                            Text("Niveau", fontSize = 11.sp, color = Color.Gray)
                            Text("Intermédiaire", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.MenuBook, contentDescription = null, tint = Color.Gray, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Column {
                            Text("Leçons", fontSize = 11.sp, color = Color.Gray)
                            Text("24", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.AccessTime, contentDescription = null, tint = Color.Gray, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Column {
                            Text("Durée", fontSize = 11.sp, color = Color.Gray)
                            Text("12h 30min", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseDetailScreenPreview() {
    CourseDetailScreen()
}