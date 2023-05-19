package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentShoesRecyclerBinding

class ShoesRecyclerFragment : Fragment() {
    private var _binding: FragmentShoesRecyclerBinding? = null
    private val binding get() = _binding!!
    var currentWeather = 0.0
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentShoesRecyclerBinding.inflate(inflater, container, false)
        val rootView = binding.root
        viewModel.getWeather()

        viewModel.weather.observe(viewLifecycleOwner) { retrievedTemp ->
            currentWeather = retrievedTemp ?: 0.0

            val shoes: List<Clothing>
            if (currentWeather < 32) {
                shoes = ClothingLists.coldWeatherShoes
            } else if (currentWeather < 60) {
                shoes = ClothingLists.mediumWeatherShoes

            } else {
                shoes = ClothingLists.warmWeatherShoes
            }
            val mAdapter = ShoeAdapter(shoes)
            binding.recyclerView.adapter = mAdapter
        }
        return rootView
    }
}