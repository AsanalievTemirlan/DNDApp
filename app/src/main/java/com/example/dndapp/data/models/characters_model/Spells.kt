package com.example.dndapp.data.models.characters_model


import com.google.gson.annotations.SerializedName

data class Spells(
    @SerializedName("book")
    val book: List<Any>,
    @SerializedName("mode")
    val mode: String,
    @SerializedName("prepared")
    val prepared: List<String>
)