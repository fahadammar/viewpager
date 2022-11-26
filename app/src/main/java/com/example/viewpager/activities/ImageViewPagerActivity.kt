package com.example.viewpager.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.R
import com.example.viewpager.databinding.ActivityImageViewPagerBinding
import com.example.viewpager.model.ImageSliderModel

class ImageViewPagerActivity : AppCompatActivity() {
    lateinit var binding : ActivityImageViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewPagerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var imageViewPager = binding.imageViewPager
        imageViewPager.adapter = ImageSliderModel.getImageSliderAdapter(this@ImageViewPagerActivity, false)
    }
}