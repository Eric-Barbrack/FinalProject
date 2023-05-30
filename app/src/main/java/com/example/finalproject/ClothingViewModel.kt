package com.example.finalproject

import androidx.lifecycle.ViewModel

class ClothingViewModel : ViewModel() {
    private var _topImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val topImageId: Int
        get() = _topImageId

    private var _bottomImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val bottomImageId: Int
        get() = _bottomImageId

    private var _shoesImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val shoesImageId: Int
        get() = _shoesImageId

    private var _accessoriesImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val accessoriesImageId: Int
        get() = _accessoriesImageId

    fun setTopImageId(newId: Int) {
        _topImageId = newId
    }

    fun setBottomImageId(newId: Int) {
        _bottomImageId = newId
    }
}