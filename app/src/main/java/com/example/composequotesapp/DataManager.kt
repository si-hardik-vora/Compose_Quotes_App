package com.example.composequotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.composequotesapp.model.Quotes
import com.google.gson.Gson
import java.nio.charset.Charset
import kotlin.text.Charsets.UTF_8

object DataManager {

    var data = emptyArray<Quotes>()
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetFromFile(context: Context){
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charset.forName(UTF_8.toString()))
        val gson = Gson()
        data = gson.fromJson(json, Array<Quotes>::class.java)
        isDataLoaded.value = true
    }


}