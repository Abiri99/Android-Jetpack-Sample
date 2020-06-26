package com.example.jetpacksample.model

import com.google.gson.annotations.SerializedName

data class DogBreed(
    @SerializedName("id")
    val breedId: String?,
    @SerializedName("name")
    val dogBreed: String?,
    @SerializedName("life_span")
    val lifeSpan: String?,
    @SerializedName("breed_group")
    val breedGroup: String?,
    @SerializedName("breed_for")
    val bredFor: String?,
    @SerializedName("temperament")
    val temperament: String?,
    @SerializedName("url")
    val imageUrl: String?
)