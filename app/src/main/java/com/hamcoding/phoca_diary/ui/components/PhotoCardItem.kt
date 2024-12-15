package com.hamcoding.phoca_diary.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hamcoding.phoca_diary.R

private val CARD_WIDTH = 180.dp

@Composable
fun PhotoCardItem() {
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
            .padding(10.dp)
    ) {
        PhotoCard(
            modifier = Modifier
                .width(CARD_WIDTH)
        )
        Text(
            text = "chiikawa with candy",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = 11.dp)
        )
        Row(
            modifier = Modifier.padding(vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .padding(4.dp)
                    .size(12.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_rating),
                tint = Color.Black.copy(
                    alpha = 0.5f
                ),
                contentDescription = "rating icon"
            )
            Text(
                text = "5.0"
            )
        }
    }
}

@Composable
fun PhotoCard(modifier: Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Box(
            modifier = Modifier.background(color = Color.Blue)
        )
    }
}

@Preview
@Composable
fun PhotoCardItemPreview() {
    PhotoCardItem()
}