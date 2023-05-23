package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentBottomRecyclerBinding
import com.example.finalproject.databinding.FragmentChooseBinding
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentTopsRecyclerBinding

class ChooseFragment : Fragment() {
    private var _binding: FragmentChooseBinding? = null
    private val binding get() = _binding!!

      override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
          _binding = FragmentChooseBinding.inflate(inflater, container, false)
          val rootView = binding.root

          binding.topsButton.setOnClickListener{
              val action = ChooseFragmentDirections.actionChooseFragmentToTopsRecyclerFragment()
              rootView.findNavController().navigate(action)
          }


          return rootView
    }


}