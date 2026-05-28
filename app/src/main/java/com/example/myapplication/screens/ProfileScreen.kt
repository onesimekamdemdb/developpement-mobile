package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun ProfileScreen() {
    Scaffold(
        bottomBar = {
            DummyBottomNavigation()
        },
        containerColor = Color(0xFFF9F9FB)
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(bottom = 24.dp)
        ) {

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 16.dp),
                    contentAlignment = Alignment.TopEnd
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = "Paramètres",
                        tint = Color(0xFF2C3E50),
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(bottom = 24.dp)
                ) {

                    Box(
                        modifier = Modifier.size(100.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {

                        AsyncImage(
                            model = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?auto=format&fit=crop&q=80&w=150",
                            contentDescription = "Avatar utilisateur",
                            modifier = Modifier
                                .size(96.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFE5E5EA)),
                            contentScale = ContentScale.Crop
                        )

                        Box(
                            modifier = Modifier
                                .size(26.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF636AE8))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "Modifier",
                                tint = Color.White,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Kamdem Onesime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1E1E1E)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "onesimekamdem@gmail.com",
                        fontSize = 14.sp,
                        color = Color(0xFF8A8A8F)
                    )
                }
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .padding(vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "12", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF636AE8))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Cours suivis", fontSize = 11.sp, color = Color(0xFF8A8A8F))
                    }

                    Box(modifier = Modifier.width(1.dp).height(30.dp).background(Color(0xFFE5E5EA)))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "4", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF636AE8))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Certificats", fontSize = 11.sp, color = Color(0xFF8A8A8F))
                    }

                    Box(modifier = Modifier.width(1.dp).height(30.dp).background(Color(0xFFE5E5EA)))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "28", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF636AE8))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Heures", fontSize = 11.sp, color = Color(0xFF8A8A8F))
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().clickable {}.padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.FavoriteBorder, contentDescription = null, tint = Color(0xFF2C3E50), modifier = Modifier.size(22.dp))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text("Mes favoris", fontSize = 15.sp, color = Color(0xFF1E1E1E))
                        }
                        Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color(0xFFC7C7CC), modifier = Modifier.size(18.dp))
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFF2F2F7)))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable {}.padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.AccountCircle, contentDescription = null, tint = Color(0xFF2C3E50), modifier = Modifier.size(22.dp))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text("Mes certificats", fontSize = 15.sp, color = Color(0xFF1E1E1E))
                        }
                        Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color(0xFFC7C7CC), modifier = Modifier.size(18.dp))
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFF2F2F7)))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable {}.padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.FileDownload, contentDescription = null, tint = Color(0xFF2C3E50), modifier = Modifier.size(22.dp))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text("Téléchargements", fontSize = 15.sp, color = Color(0xFF1E1E1E))
                        }
                        Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color(0xFFC7C7CC), modifier = Modifier.size(18.dp))
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFF2F2F7)))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable {}.padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.Settings, contentDescription = null, tint = Color(0xFF2C3E50), modifier = Modifier.size(22.dp))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text("Paramètres", fontSize = 15.sp, color = Color(0xFF1E1E1E))
                        }
                        Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color(0xFFC7C7CC), modifier = Modifier.size(18.dp))
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFF2F2F7)))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable {}.padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.HelpOutline, contentDescription = null, tint = Color(0xFF2C3E50), modifier = Modifier.size(22.dp))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text("Aide et support", fontSize = 15.sp, color = Color(0xFF1E1E1E))
                        }
                        Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color(0xFFC7C7CC), modifier = Modifier.size(18.dp))
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFF2F2F7)))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable {}.padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Outlined.ExitToApp, contentDescription = null, tint = Color(0xFFE53935), modifier = Modifier.size(22.dp))
                        Spacer(modifier = Modifier.width(16.dp))
                        Text("Se déconnecter", fontSize = 15.sp, color = Color(0xFFE53935))
                    }
                }
            }
        }
    }
}

@Composable
fun DummyBottomNavigation() {
    NavigationBar(containerColor = Color.White) {
        NavigationBarItem(
            icon = { Icon(Icons.Outlined.Home, contentDescription = null) },
            label = { Text("Accueil") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Outlined.Book, contentDescription = null) },
            label = { Text("Cours") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Outlined.FavoriteBorder, contentDescription = null) },
            label = { Text("Favoris") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Person, contentDescription = null, tint = Color(0xFF636AE8)) },
            label = { Text("Profil", color = Color(0xFF636AE8)) },
            selected = true,
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}