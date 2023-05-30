package com.example.finalproject

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding

class AccessoriesViewHolder(val binding: ListItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentClothing: Clothing

    init{
        binding.root.setOnClickListener { view ->
            val imageVal = currentClothing.image
            val action = AccessoriesRecyclerFragmentDirections.actionAccessoriesRecyclerFragmentToChooseFragment(imageVal, 4)
            binding.root.findNavController().navigate(action)
        }
    }

    fun bindClothing(clothing: Clothing) {
        currentClothing = clothing
        binding.clothingName.text = currentClothing.name
        binding.clothingWeather.text = currentClothing.weatherRange.toString()
        binding.clothingPicture.setImageResource(currentClothing.image)
    }
}