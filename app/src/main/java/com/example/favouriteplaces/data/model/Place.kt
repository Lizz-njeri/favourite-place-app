package com.example.favouriteplaces.data.model

data class Place(val id: Long = 0,
                 val name: String,
                 val description: String,
                 val imageUrl: String,
                 val rating: Float)
