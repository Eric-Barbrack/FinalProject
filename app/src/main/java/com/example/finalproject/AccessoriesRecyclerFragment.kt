package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentAccessoriesRecyclerBinding
import com.example.finalproject.databinding.FragmentBottomRecyclerBinding

class AccessoriesRecyclerFragment : Fragment() {
    private var _binding: FragmentAccessoriesRecyclerBinding? = null
    private val binding get() = _binding!!
    var currentWeather = 0.0
    private val viewModel: WeatherViewModel by viewModels()
    private val clothesViewModel: ClothingViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentAccessoriesRecyclerBinding.inflate(inflater, container, false)
        val rootView = binding.root
        viewModel.getWeather()

        viewModel.weather.observe(viewLifecycleOwner) { retrievedTemp ->
            currentWeather = retrievedTemp ?: 0.0

            val accessories: List<Clothing>
            if (currentWeather < 32) {
                accessories = ClothingLists.coldWeatherAccessories
            } else if (currentWeather < 60) {
                accessories = ClothingLists.mediumWeatherAccessories

            } else {
                accessories = ClothingLists.warmWeatherAccessories
            }
            val mAdapter = AccessoryAdapter(accessories, clothesViewModel)
            binding.recyclerView.adapter = mAdapter
        }
        return rootView
    }
}
