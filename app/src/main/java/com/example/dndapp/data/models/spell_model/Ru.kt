package com.example.dndapp.data.models.spell_model


import com.google.gson.annotations.SerializedName

data class Ru(
    @SerializedName("castingTime")
    val castingTime: String,
    @SerializedName("components")
    val components: String,
    @SerializedName("duration")
    val duration: String,
    @SerializedName("level")
    val level: Int,
    @SerializedName("materials")
    val materials: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("needHelp")
    val needHelp: Boolean,
    @SerializedName("nic")
    val nic: String,
    @SerializedName("range")
    val range: String,
    @SerializedName("ritual")
    val ritual: String,
    @SerializedName("school")
    val school: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("text")
    val text: String
)