package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentChooseBinding
import com.example.finalproject.databinding.FragmentOpeningBinding

class OpeningFragment : Fragment() {
    private var _binding: FragmentOpeningBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentOpeningBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.button2.setOnClickListener{
            val action = OpeningFragmentDirections.actionOpeningFragmentToInfromationFragment(binding.editText.getText().toString())
            rootView.findNavController().navigate(action)
        }

        return rootView
    }


}