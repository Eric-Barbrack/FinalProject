package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentChooseBinding
import com.example.finalproject.databinding.FragmentClosingScreenBinding
import com.example.finalproject.databinding.FragmentInfromationBinding

class InfromationFragment : Fragment() {
    private var _binding: FragmentInfromationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentInfromationBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = InfromationFragmentArgs.fromBundle(requireArguments())
        val name = args.name
        if(name != "") {
            binding.middle.text=name
        }

        binding.button.setOnClickListener {
            val action = InfromationFragmentDirections.actionInfromationFragmentToChooseFragment(0)
            rootView.findNavController().navigate(action)
        }


        return rootView
    }

}