package com.example.favouriteplaces.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.favouriteplaces.R
import com.example.favouriteplaces.viewmodel.PlacesViewModel

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {

    private val viewModel: PlacesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
