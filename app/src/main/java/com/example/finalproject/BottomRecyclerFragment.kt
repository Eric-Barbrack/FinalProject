package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentBottomRecyclerBinding

class BottomRecyclerFragment : Fragment() {
    private var _binding: FragmentBottomRecyclerBinding? = null
    private val binding get() = _binding!!
    var currentWeather = 0.0
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBottomRecyclerBinding.inflate(inflater, container, false)
        val rootView = binding.root
        viewModel.getWeather()

        viewModel.weather.observe(viewLifecycleOwner) { retrievedTemp ->
            currentWeather = retrievedTemp ?: 72.0

            var tops = listOf<Clothing>()
            if (currentWeather < 32) {
                tops = ClothingLists.coldWeatherBottoms
            } else if (currentWeather < 60) {
                tops = ClothingLists.mediumWeatherBottoms

            } else {
                tops = ClothingLists.warmWeatherBottoms
            }
            val mAdapter = TopsAdapter(tops)
            binding.recyclerView.adapter = mAdapter
        }
        return rootView
    }
}
