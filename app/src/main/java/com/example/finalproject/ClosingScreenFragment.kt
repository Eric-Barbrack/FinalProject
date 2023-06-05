package com.example.finalproject

import android.media.MediaPlayer
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

        binding.topsImage.setImageResource(clothesViewModel.topImageId)
        binding.bottomsImage.setImageResource(clothesViewModel.bottomImageId)

        if(clothesViewModel.bottomsBeenClicked == false){
            binding.bottomsComment.text = getString(R.string.nopants)
        } else{
            binding.bottomsComment.text = getString(R.string.gotpants)
        }

        if(clothesViewModel.topsBeenClicked == false) {
            binding.topsComment1.text = getString(R.string.noshirt)
        } else {
            binding.topsComment1.text = getString(R.string.gotshirt)
        }


        return rootView
    }



}