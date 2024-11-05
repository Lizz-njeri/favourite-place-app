package com.example.favouriteplaces.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.favouriteplaces.R
import com.example.favouriteplaces.data.model.Place
import com.example.favouriteplaces.viewmodel.PlacesViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel: PlacesViewModel by viewModels()
    private lateinit var placesAdapter: PlacesAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        setupFab()
        observeViewModel()

        // Add some sample data
        viewModel.addSamplePlaces()
    }

    private fun setupRecyclerView() {
        placesAdapter = PlacesAdapter(
            onPlaceClick = { place: Place ->
                // Navigate to detail screen with the clicked place
                findNavController().navigate(R.id.action_mainFragment_to_detailFragment)
            }
        ) { place, newRating ->
            viewModel.updatePlaceRating(place, newRating)
        }

        view?.findViewById<RecyclerView>(R.id.recyclerView)?.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = placesAdapter
            addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        }
    }

    private fun setupFab() {
        view?.findViewById<FloatingActionButton>(R.id.fabAddPlace)?.setOnClickListener {
            // Navigate to add place screen
            findNavController().navigate(R.id.action_mainFragment_to_addPlaceFragment)
        }
    }

    private fun observeViewModel() {
        viewModel.places.observe(viewLifecycleOwner) { places ->
            placesAdapter.submitList(places)
        }
    }
}


