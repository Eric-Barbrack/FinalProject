package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.finalproject.databinding.FragmentTopsRecyclerBinding


class TopsRecyclerFragment : Fragment() {
    private var _binding: FragmentTopsRecyclerBinding? = null
    private val binding get() = _binding!!
    var currentWeather = 0.0
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTopsRecyclerBinding.inflate(inflater, container, false)
        val rootView = binding.root
        viewModel.getWeather()


        viewModel.response.observe(viewLifecycleOwner) {
            currentWeather = viewModel.response.value?: 0.0
        }

        if(currentWeather < 32) {
            val tops = listOf(
                Clothing("Heavy Work Jacket", R.drawable.stoneridgeworkjacket, 10),
                Clothing("Heavy Plaid Flannel", R.drawable.heavyplaidflannel, -10),
                Clothing("Heavy Work Jacket", R.drawable.stoneridgeworkjacket, 10),
                Clothing("Heavy Plaid Flannel", R.drawable.heavyplaidflannel, -10),
                Clothing("Heavy Work Jacket", R.drawable.stoneridgeworkjacket, 10),
                Clothing("Heavy Plaid Flannel", R.drawable.heavyplaidflannel, -10),
                Clothing("Heavy Work Jacket", R.drawable.stoneridgeworkjacket, 10),
                Clothing("Heavy Plaid Flannel", R.drawable.heavyplaidflannel, -10),
                Clothing("Heavy Work Jacket", R.drawable.stoneridgeworkjacket, 10),
                Clothing("Heavy Plaid Flannel", R.drawable.heavyplaidflannel, -10)
            )

            val mAdapter = TopsAdapter(tops)
            binding.recyclerView.adapter = mAdapter
        } else if(currentWeather < 60) {
            val tops = listOf(
                Clothing("Dress Shirt", R.drawable.dressshirt, 55),
                Clothing("Red Plaid Flannel", R.drawable.redplaidflannel, 10),
                Clothing("Dress Shirt", R.drawable.dressshirt, 55),
                Clothing("Red Plaid Flannel", R.drawable.redplaidflannel, 10),
                Clothing("Dress Shirt", R.drawable.dressshirt, 55),
                Clothing("Red Plaid Flannel", R.drawable.redplaidflannel, 10),
                Clothing("Dress Shirt", R.drawable.dressshirt, 55),
                Clothing("Red Plaid Flannel", R.drawable.redplaidflannel, 10),
                Clothing("Dress Shirt", R.drawable.dressshirt, 55),
                Clothing("Red Plaid Flannel", R.drawable.redplaidflannel, 10)
            )

            val mAdapter = TopsAdapter(tops)
            binding.recyclerView.adapter = mAdapter
        } else {
            val tops = listOf(
                Clothing("Black T-Shirt", R.drawable.blacktee, 65),
                Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
                Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
                Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
                Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65),
                Clothing("Black T-Shirt", R.drawable.blacktee, 65),
                Clothing("Balmain Designer T-shirt", R.drawable.blamaintee, 65),
                Clothing("Black Collared Short-Sleve T-Shirt", R.drawable.blackcollared, 65),
                Clothing("Navy Blue Tank Top", R.drawable.perfecttanktop, 65),
                Clothing("Plaid Collared Short-Sleve T-Shirt", R.drawable.plaidcollared, 65)
            )

            val mAdapter = TopsAdapter(tops)
            binding.recyclerView.adapter = mAdapter
        }




        return rootView
    }
}

