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

    private var _topsBeenClicked: Boolean = false
    val topsBeenClicked: Boolean
        get() = _topsBeenClicked

    private var _BottomsBeenClicked: Boolean = false
    val bottomsBeenClicked: Boolean
        get() = _BottomsBeenClicked

    private var _shoesBeenClicked: Boolean = false
    val shoesBeenClicked: Boolean
        get() = _shoesBeenClicked

    private var _accessoriesBeenClicked: Boolean = false
    val accessoriesBeenClicked: Boolean
        get() = _accessoriesBeenClicked

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

    fun setTopsBeenClicked(){
        _topsBeenClicked = true
    }

    fun setBottomsBeenClicked(){
        _BottomsBeenClicked = true
    }

    fun setShoesBeenClicked(){
        _shoesBeenClicked = true
    }

    fun setAccessoriesBeenClicked(){
        _accessoriesBeenClicked = true
    }

}