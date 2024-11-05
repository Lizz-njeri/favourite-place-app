package com.example.favouriteplaces.data.network

import com.example.favouriteplaces.data.model.Place
import retrofit2.http.GET

interface PlacesApiService {
    @GET("places")  // Replace with your actual endpoint
    suspend fun getPlaces(): List<Place>
}