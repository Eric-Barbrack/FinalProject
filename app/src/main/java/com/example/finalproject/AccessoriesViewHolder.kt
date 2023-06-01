package com.example.finalproject

import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding
import com.google.android.material.snackbar.Snackbar

class AccessoriesViewHolder(val binding: ListItemLayoutBinding, clothesViewModel: ClothingViewModel): RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentClothing: Clothing

    init{
        binding.root.setOnClickListener { view ->
            val imageVal = currentClothing.image
            clothesViewModel.setAccessoryImageId(imageVal)
            val action = AccessoriesRecyclerFragmentDirections.actionAccessoriesRecyclerFragmentToChooseFragment(imageVal, 4)
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