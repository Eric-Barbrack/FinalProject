package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.activityViewModels
import com.example.finalproject.databinding.FragmentBottomRecyclerBinding
import com.example.finalproject.databinding.FragmentChooseBinding
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentTopsRecyclerBinding

class ChooseFragment : Fragment() {
    private var _binding: FragmentChooseBinding? = null
    private val binding get() = _binding!!
    private val clothesViewModel: ClothingViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
          _binding = FragmentChooseBinding.inflate(inflater, container, false)
          val rootView = binding.root
          val args = ChooseFragmentArgs.fromBundle(requireArguments())


          binding.topsButton.setImageResource(clothesViewModel.topImageId)
          binding.bottomsButton.setImageResource(clothesViewModel.bottomImageId)
          binding.shoesButton.setImageResource(clothesViewModel.shoeImageId)
          binding.accessoriesButton.setImageResource(clothesViewModel.accessoryImageId)


        if(args.whichButton == 1){
              binding.topsButton.setImageResource(clothesViewModel.topImageId)
          } else if(args.whichButton == 2) {
              binding.bottomsButton.setImageResource(clothesViewModel.bottomImageId)
          } else if(args.whichButton == 3){
              binding.shoesButton.setImageResource(clothesViewModel.shoeImageId)
          } else {
              binding.accessoriesButton.setImageResource(clothesViewModel.accessoryImageId)
          }


          binding.topsButton.setOnClickListener{
              val action = ChooseFragmentDirections.actionChooseFragmentToTopsRecyclerFragment()
              rootView.findNavController().navigate(action)
          }

          binding.bottomsButton.setOnClickListener {
              val action = ChooseFragmentDirections.actionChooseFragmentToBottomRecyclerFragment()
              rootView.findNavController().navigate(action)
          }

          binding.shoesButton.setOnClickListener {
              val action = ChooseFragmentDirections.actionChooseFragmentToShoesRecyclerFragment()
              rootView.findNavController().navigate(action)
          }

          binding.accessoriesButton.setOnClickListener {
              val action = ChooseFragmentDirections.actionChooseFragmentToAccessoriesRecyclerFragment()
              rootView.findNavController().navigate(action)
          }


          return rootView
    }


}