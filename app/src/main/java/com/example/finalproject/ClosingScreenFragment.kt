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

    lateinit var vicMedia: MediaPlayer

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentClosingScreenBinding.inflate(inflater, container, false)
        val rootView = binding.root
        vicMedia = MediaPlayer.create(context, R.raw.vic)

        vicMedia.setLooping(true)
        vicMedia.start()
        binding.pause.setOnClickListener{
            if(vicMedia.isPlaying()) {
                binding.pause.setImageResource(R.drawable.ic_baseline_play_arrow_24)
                vicMedia.pause()
            } else {
                binding.pause.setImageResource(R.drawable.ic_baseline_pause_24)
                vicMedia.start()
            }

        }

        binding.rewind.setOnClickListener {
            val current = vicMedia.currentPosition
            vicMedia.seekTo(current - 10000)
        }

        binding.fastforward.setOnClickListener {
            val current = vicMedia.currentPosition
            vicMedia.seekTo(current + 10000)
        }

        var totals = 0
        if(clothesViewModel.topsBeenClicked) {
            totals = totals + 1
        }
        if(clothesViewModel.bottomsBeenClicked) {
            totals = totals + 1
        }



        return rootView
    }

    override fun onStop() {
        super.onStop()
        vicMedia.release()
    }


}