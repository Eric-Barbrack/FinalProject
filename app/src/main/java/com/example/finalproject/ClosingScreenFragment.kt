package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.finalproject.databinding.FragmentChooseBinding
import com.example.finalproject.databinding.FragmentClosingScreenBinding


class ClosingScreenFragment : Fragment() {
    private var _binding: FragmentClosingScreenBinding? = null
    private val binding get() = _binding!!
    private val clothesViewModel: ClothingViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentClosingScreenBinding.inflate(inflater, container, false)
        val rootView = binding.root

        var totals = 0
        if(clothesViewModel.topsBeenClicked) {
            totals = totals + 1
        }
        if(clothesViewModel.bottomsBeenClicked) {
            totals = totals + 1
        }
        if(clothesViewModel.shoesBeenClicked) {
            totals = totals + 1
        }
        if(clothesViewModel.accessoriesBeenClicked) {
            totals = totals + 1
        }

        binding.textView7.text = totals.toString()


        return rootView
    }


}