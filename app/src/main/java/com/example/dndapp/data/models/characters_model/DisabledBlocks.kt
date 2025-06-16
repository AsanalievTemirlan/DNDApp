package com.example.dndapp.data.models.characters_model


import com.google.gson.annotations.SerializedName

data class DisabledBlocks(
    @SerializedName("_id")
    val id: String,
    @SerializedName("info-left")
    val infoLeft: List<Any>,
    @SerializedName("info-right")
    val infoRight: List<Any>,
    @SerializedName("notes-left")
    val notesLeft: List<Any>,
    @SerializedName("notes-right")
    val notesRight: List<Any>,
    @SerializedName("subinfo-left")
    val subinfoLeft: List<Any>,
    @SerializedName("subinfo-right")
    val subinfoRight: List<Any>
)