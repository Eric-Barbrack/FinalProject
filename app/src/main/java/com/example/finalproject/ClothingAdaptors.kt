package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding

class TopsAdapter(val topsList: List<Clothing>, val clothesViewModel: ClothingViewModel): RecyclerView.Adapter<TopsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopsViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopsViewHolder(binding, clothesViewModel)
    }

    override fun onBindViewHolder(holder: TopsViewHolder, position: Int) {
        val currentTop = topsList[position]
        holder.bindClothing(currentTop)
    }

    override fun getItemCount(): Int {
        return topsList.size
    }
}

class BottomsAdapter(val bottomsList: List<Clothing>, val clothesViewModel: ClothingViewModel): RecyclerView.Adapter<BottomsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BottomsViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BottomsViewHolder(binding, clothesViewModel)
    }

    override fun onBindViewHolder(holder: BottomsViewHolder, position: Int) {
        val currentBottom = bottomsList[position]
        holder.bindClothing(currentBottom)
    }

    override fun getItemCount(): Int {
        return bottomsList.size
    }
}
