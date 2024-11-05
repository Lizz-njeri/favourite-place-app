package com.example.favouriteplaces.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: PlacesApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://example.com/api/") // Replace with your actual base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PlacesApiService::class.java)
    }
}