package com.example.favouriteplaces.data.local


import androidx.room.*
import com.example.favouriteplaces.data.model.FavoritePlace

@Dao
interface FavoritePlaceDao {
    @Query("SELECT * FROM favorite_places")
    suspend fun getAllFavorites(): List<FavoritePlace>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFavorite(place: FavoritePlace)

    @Delete
    suspend fun removeFavorite(place: FavoritePlace)
}