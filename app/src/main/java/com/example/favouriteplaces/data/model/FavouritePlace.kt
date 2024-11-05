package com.example.favouriteplaces.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_places")
data class FavoritePlace(
    @PrimaryKey val id: Int,
    val name: String,
    val location: String,
    val imageUrl: String
)
