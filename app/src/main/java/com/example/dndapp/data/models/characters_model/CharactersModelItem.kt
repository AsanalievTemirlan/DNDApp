package com.example.dndapp.data.models.characters_model


import com.google.gson.annotations.SerializedName

data class CharactersModelItem(
    @SerializedName("data")
    val `data`: String,
    @SerializedName("disabledBlocks")
    val disabledBlocks: DisabledBlocks,
    @SerializedName("edition")
    val edition: String,
    @SerializedName("jsonType")
    val jsonType: String,
    @SerializedName("spells")
    val spells: Spells,
    @SerializedName("tags")
    val tags: List<Any>,
    @SerializedName("version")
    val version: String
)