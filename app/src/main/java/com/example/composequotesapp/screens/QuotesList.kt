package com.example.composequotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequotesapp.model.Quotes



@Composable
fun QuotesList(data : Array<Quotes>, onclick: () -> Unit) {
    
    LazyColumn(content = {
        items(data) {
            QuotesListItems(quotes = it) {
                onclick()
            }
        }
    })
    
}