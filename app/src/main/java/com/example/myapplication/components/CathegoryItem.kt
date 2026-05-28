package com.example.myapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryItem(course: Course){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(end = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(course.color.copy(alpha = 0.2f)  ),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                course.icon,
                contentDescription = null,
                tint = course.color
            )

        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(course.title)
    }
}

@Preview(showBackground = true)
@Composable

fun CategoryItemPreview(){
    CategoryItem(courses[2])
}

