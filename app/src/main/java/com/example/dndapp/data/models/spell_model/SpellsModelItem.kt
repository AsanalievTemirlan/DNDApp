package com.example.dndapp.data.models.spell_model


import com.google.gson.annotations.SerializedName

data class SpellsModelItem(
    @SerializedName("en")
    val en: En,
    @SerializedName("ru")
    val ru: Ru
)