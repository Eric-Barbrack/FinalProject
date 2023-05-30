package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentTopsRecyclerBinding


class TopsRecyclerFragment : Fragment() {
    private var _binding: FragmentTopsRecyclerBinding? = null
    private val binding get() = _binding!!
    var currentWeather = 0.0
    private val viewModel: WeatherViewModel by viewModels()
    private val clothesViewModel: ClothingViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTopsRecyclerBinding.inflate(inflater, container, false)
        val rootView = binding.root
        viewModel.getWeather()

        viewModel.weather.observe(viewLifecycleOwner) { retrievedTemp ->
            currentWeather = retrievedTemp ?: 0.0

            var tops = listOf<Clothing>()
            if (currentWeather < 32) {
                tops = ClothingLists.coldWeatherTops
            } else if (currentWeather < 60) {
                tops = ClothingLists.mediumWeatherTops

            } else {
                tops = ClothingLists.warmWeatherTops
            }
            val mAdapter = TopsAdapter(tops, clothesViewModel)
            binding.recyclerView.adapter = mAdapter
        }
        return rootView
    }
}

