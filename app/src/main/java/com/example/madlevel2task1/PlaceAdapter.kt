package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter (private val places: List<Place>) :
        RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
                return ViewHolder(
                        LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
                )
        }

        override fun getItemCount(): Int {
                return places.size
        }

        override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
                holder.bind(places[position])
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                private val binding = ItemPlaceBinding.bind(itemView)

                fun bind(place : Place) {
                        binding.image.setImageResource(place.imageResId)
                        binding.placeName.text = place.name
                }
        }

}