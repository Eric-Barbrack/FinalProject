package com.example.finalproject

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding

class BottomsViewHolder(val binding: ListItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentClothing: Clothing

    init{
        binding.root.setOnClickListener { view ->
            val imageVal = currentClothing.image
            val action = BottomRecyclerFragmentDirections.actionBottomRecyclerFragmentToChooseFragment(imageVal, 2)
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