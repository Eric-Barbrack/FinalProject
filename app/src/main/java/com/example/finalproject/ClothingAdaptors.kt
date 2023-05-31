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

class ShoeAdapter(val shoeList: List<Clothing>, val clothesViewModel: ClothingViewModel): RecyclerView.Adapter<ShoesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoesViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShoesViewHolder(binding, clothesViewModel)
    }

    override fun onBindViewHolder(holder: ShoesViewHolder, position: Int) {
        val currentShoe = shoeList[position]
        holder.bindClothing(currentShoe)
    }

    override fun getItemCount(): Int {
        return shoeList.size
    }
}

class AccessoryAdapter(val accessoryList: List<Clothing>, val clothesViewModel: ClothingViewModel): RecyclerView.Adapter<AccessoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccessoriesViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AccessoriesViewHolder(binding, clothesViewModel)
    }

    override fun onBindViewHolder(holder: AccessoriesViewHolder, position: Int) {
        val currentAccessory = accessoryList[position]
        holder.bindClothing(currentAccessory)
    }

    override fun getItemCount(): Int {
        return accessoryList.size
    }
}
