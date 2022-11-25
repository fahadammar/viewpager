package com.example.viewpager.model

import android.content.Context
import android.util.Log
import com.example.viewpager.R
import com.example.viewpager.adapter.ImageSliderAdapter

class ImageSliderModel {
    companion object {
        private val TAG = "imageSliderModel"
        private lateinit var imageList : ArrayList<Int>

        fun getImageSliderAdapter(context : Context) : ImageSliderAdapter{
            return ImageSliderAdapter(context, getImageList())
        }

        private fun getImageList() : ArrayList<Int>{
            imageList = ArrayList<Int>()
            imageList.add(R.drawable.android_199225_1280)
            imageList.add(R.drawable.android_994910_1280)
            imageList.add(R.drawable.phone_g175055d80_1920)
            return imageList
        }
    }
}