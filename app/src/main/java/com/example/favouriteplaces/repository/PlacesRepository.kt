package com.example.favouriteplaces.repository

import com.example.favouriteplaces.data.local.FavoritePlaceDao
import com.example.favouriteplaces.data.model.FavoritePlace
import com.example.favouriteplaces.data.network.PlacesApiService
import com.example.favouriteplaces.data.model.Place

class PlacesRepository(private val api: PlacesApiService, private val dao: FavoritePlaceDao) {

    suspend fun getPlaces(): List<Place> = api.getPlaces()

    suspend fun getFavorites(): List<FavoritePlace> = dao.getAllFavorites()

    suspend fun addFavorite(place: FavoritePlace) {
        dao.addFavorite(place)
    }

    suspend fun removeFavorite(place: FavoritePlace) {
        dao.removeFavorite(place)
    }
}