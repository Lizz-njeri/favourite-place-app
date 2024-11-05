package com.example.favouriteplaces.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.favouriteplaces.R
import com.example.favouriteplaces.data.model.Place
import com.example.favouriteplaces.databinding.FragmentDetailBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val place = arguments?.getParcelable<Place>("place")

        binding.placeNameTextView.text = place?.name
        binding.placeDescriptionTextView.text = place?.description


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
