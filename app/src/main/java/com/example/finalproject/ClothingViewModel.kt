package com.example.finalproject

import androidx.lifecycle.ViewModel

class ClothingViewModel : ViewModel() {
    private var _topImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val topImageId: Int
        get() = _topImageId

    private var _bottomImageId: Int = R.drawable.ic_baseline_open_in_new_24
    val bottomImageId: Int
        get() = _bottomImageId



    private var _topsBeenClicked: Boolean = false
    val topsBeenClicked: Boolean
        get() = _topsBeenClicked

    private var _BottomsBeenClicked: Boolean = false
    val bottomsBeenClicked: Boolean
        get() = _BottomsBeenClicked



    fun setTopImageId(newId: Int) {
        _topImageId = newId
    }

    fun setBottomImageId(newId: Int) {
        _bottomImageId = newId
    }



    fun setTopsBeenClicked(){
        _topsBeenClicked = true
    }

    fun setBottomsBeenClicked(){
        _BottomsBeenClicked = true
    }


}