package com.example.favouriteplaces.repository

import com.example.favouriteplaces.data.local.FavoritePlaceDao
import com.example.favouriteplaces.data.model.FavoritePlace
import com.example.favouriteplaces.data.model.Place
import com.example.favouriteplaces.data.network.PlacesApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart

class PlacesRepository(
    private val api: PlacesApiService,
    private val dao: FavoritePlaceDao
) {

    // Function to fetch places from API and cache them in the local database
    suspend fun getPlaces(): Flow<List<Place>> = flow {
        val places = api.getPlaces()
        emit(places)
    }.onStart {
        // Optionally, emit a loading state here
    }.catch { e ->
        // Handle errors if needed
        emit(emptyList()) // Return an empty list if there is an error
    }

    // Function to retrieve favorite places from the local database
    suspend fun getFavorites(): List<FavoritePlace> = dao.getAllFavorites()

    // Add a place to favorites
    suspend fun addFavorite(place: FavoritePlace) {
        dao.addFavorite(place)
    }

    // Remove a place from favorites
    suspend fun removeFavorite(place: FavoritePlace) {
        dao.removeFavorite(place)
    }
}
