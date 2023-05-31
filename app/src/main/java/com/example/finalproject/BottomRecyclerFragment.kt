package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentBottomRecyclerBinding

class BottomRecyclerFragment : Fragment() {
    private var _binding: FragmentBottomRecyclerBinding? = null
    private val binding get() = _binding!!
    var currentWeather = 0.0
    private val viewModel: WeatherViewModel by viewModels()
    private val clothesViewModel: ClothingViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentBottomRecyclerBinding.inflate(inflater, container, false)
        val rootView = binding.root
        viewModel.getWeather()

        viewModel.weather.observe(viewLifecycleOwner) { retrievedTemp ->
            currentWeather = retrievedTemp ?: 0.0

            val bottoms: List<Clothing>
            if (currentWeather < 32) {
                bottoms = ClothingLists.coldWeatherBottoms
            } else if (currentWeather < 60) {
                bottoms = ClothingLists.mediumWeatherBottoms

            } else {
                bottoms = ClothingLists.warmWeatherBottoms
            }
            val mAdapter = BottomsAdapter(bottoms, clothesViewModel)
            binding.recyclerView.adapter = mAdapter
        }
        return rootView
    }
}
