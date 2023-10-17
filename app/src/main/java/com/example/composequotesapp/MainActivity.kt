package com.example.composequotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.composequotesapp.screens.QuotesListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataManager.loadAssetFromFile(this)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {

    if (DataManager.isDataLoaded.value) {
        QuotesListScreen(data = DataManager.data) {

        }
    }

}
