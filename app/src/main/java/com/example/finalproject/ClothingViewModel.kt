package com.example.finalproject

import androidx.lifecycle.ViewModel

class ClothingViewModel : ViewModel() {
    private var _topImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val topImageId: Int
        get() = _topImageId

    private var _bottomImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val bottomImageId: Int
        get() = _bottomImageId

    private var _shoeImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val shoeImageId: Int
        get() = _shoeImageId

    private var _accessoryImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val accessoryImageId: Int
        get() = _accessoryImageId

    fun setTopImageId(newId: Int) {
        _topImageId = newId
    }

    fun setBottomImageId(newId: Int) {
        _bottomImageId = newId
    }

    fun setShoeImageId(newId: Int) {
        _shoeImageId = newId
    }

    fun setAccessoryImageId(newId: Int) {
        _accessoryImageId = newId
    }
}