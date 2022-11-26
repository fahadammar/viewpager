package com.example.viewpager.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.R
import com.example.viewpager.databinding.ActivityDotsIndicatorBinding
import com.example.viewpager.model.ImageSliderModel
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class DotsIndicatorActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDotsIndicatorBinding

    private lateinit var dot1 : DotsIndicator
    private lateinit var dot2 : SpringDotsIndicator
    private lateinit var dot3 : WormDotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDotsIndicatorBinding.inflate(layoutInflater)
        val view =  binding.root
        setContentView(view)

        setUI(binding)
    }

    private fun setUI(binding: ActivityDotsIndicatorBinding) {
        val viewPager = binding.viewPagerDotIndicator

        dot1 = binding.dotsIndicator
        dot2 = binding.springDotsIndicator
        dot3 = binding.wormDotsIndicator

        viewPager.adapter = ImageSliderModel.getImageSliderAdapter(this@DotsIndicatorActivity, false)

        dot1.attachTo(viewPager)
        dot2.attachTo(viewPager)
        dot3.attachTo(viewPager)
    }
}