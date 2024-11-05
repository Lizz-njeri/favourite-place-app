package com.example.favouriteplaces.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.favouriteplaces.data.model.FavoritePlace

@Database(entities = [FavoritePlace::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoritePlaceDao(): FavoritePlaceDao
}