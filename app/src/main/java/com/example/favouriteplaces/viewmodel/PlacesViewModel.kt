package com.example.favouriteplaces.viewmodel

import androidx.lifecycle.*
import com.example.favouriteplaces.data.model.Place
import com.example.favouriteplaces.data.model.FavoritePlace
import com.example.favouriteplaces.repository.PlacesRepository
import kotlinx.coroutines.launch

class PlacesViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> = _places

    fun addSamplePlaces() {
        val samplePlaces = listOf(
            Place(
                1,
                "Eiffel Tower",
                "The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France.",
                "https://example.com/eiffel.jpg",
                4.5f
            ),
            Place(
                2,
                "Grand Canyon",
                "The Grand Canyon is a steep-sided canyon carved by the Colorado River in Arizona.",
                "https://example.com/canyon.jpg",
                5.0f
            ),
            // Add more sample places
        )
        _places.value = samplePlaces
    }

    fun updatePlaceRating(place: Place, newRating: Float) {
        val currentPlaces = _places.value?.toMutableList() ?: return
        val index = currentPlaces.indexOfFirst { it.id == place.id }
        if (index != -1) {
            currentPlaces[index] = place.copy(rating = newRating)
            _places.value = currentPlaces
        }
    }
}