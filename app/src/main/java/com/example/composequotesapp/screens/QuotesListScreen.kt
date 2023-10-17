package com.example.composequotesapp.screens

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composequotesapp.model.Quotes

@Composable
fun QuotesListScreen(data : Array<Quotes>, onClick : (quotes: Quotes) -> Unit) {
    Column() {
        Text(text = "Quotes App",
        textAlign =  TextAlign.Center,
        modifier = Modifier.padding(8.dp, 24.dp)
            .fillMaxWidth(1f),
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = FontWeight.Bold)
        QuotesList(data = data, onClick)
    }
}