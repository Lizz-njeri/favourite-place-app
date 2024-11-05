package com.example.favouriteplaces.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.favouriteplaces.R
import com.example.favouriteplaces.databinding.FragmentAddPlaceBinding

class AddPlaceFragment : Fragment(R.layout.fragment_add_place) {

    private var _binding: FragmentAddPlaceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddPlaceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.saveButton.setOnClickListener {
            val name = binding.placeNameEditText.text.toString()
            val description = binding.placeDescriptionEditText.text.toString()


            if (name.isNotEmpty() && description.isNotEmpty()) {
                // Add the new place (trigger ViewModel action or other logic)
                Toast.makeText(requireContext(), "Place added: $name", Toast.LENGTH_SHORT).show()
                // Navigate back or reset the form
            } else {
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
