package com.example.finalproject

import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding
import com.google.android.material.snackbar.Snackbar

class TopsViewHolder(val binding: ListItemLayoutBinding, clothesViewModel: ClothingViewModel): RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentClothing: Clothing


    init{
        binding.root.setOnClickListener { view ->
            val imageVal = currentClothing.image
            clothesViewModel.setTopImageId(imageVal)
            val action = TopsRecyclerFragmentDirections.actionTopsRecyclerFragmentToChooseFragment(imageVal, 1)
            Snackbar.make(view, "Good Choice!", Snackbar.LENGTH_SHORT).show()
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