package com.hamcoding.phoca_diary.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryRow() {
    Column {
        CategoryTitle("Chiikawa")
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = 10.dp
            )
        ) {
            item {
                PhotoCardItem()
            }
        }
    }
}

@Composable
fun CategoryTitle(title: String) {
    Text(
        text = title,
        modifier = Modifier.padding(10.dp)
    )
}

@Preview
@Composable
fun CategoryRowPreview() {
    CategoryRow()
}