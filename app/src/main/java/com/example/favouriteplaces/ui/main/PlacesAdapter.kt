package com.example.favouriteplaces.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.favouriteplaces.R
import com.example.favouriteplaces.data.model.Place
import com.bumptech.glide.Glide

class PlacesAdapter(
    private val onPlaceClick: (Place) ->Unit,
    private val onRatingChanged: (Place, Float) -> Unit
) : RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder>() {

    private var places = listOf<Place>()

    fun submitList(newPlaces: List<Place>) {
        places = newPlaces
        notifyDataSetChanged()
    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_place, parent, false)
        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places[position])
    }

    override fun getItemCount() = places.size

    inner class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.placeImage)
        private val nameText: TextView = itemView.findViewById(R.id.placeName)
        private val descriptionText: TextView = itemView.findViewById(R.id.placeDescription)
        private val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)

        fun bind(place: Place) {
            nameText.text = place.name
            descriptionText.text = place.description
            ratingBar.rating = place.rating


            Glide.with(itemView.context)
                .load(place.imageUrl)
                .placeholder(R.drawable.placeholder_image)
                .error(R.drawable.error_image)
                .centerCrop()
                .into(imageView)

            itemView.setOnClickListener {
                onPlaceClick(place)
            }

            ratingBar.setOnRatingBarChangeListener { _, rating, fromUser ->
                if (fromUser) {
                    onRatingChanged(place, rating)
                }
            }
        }
    }
}