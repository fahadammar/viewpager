package com.example.viewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewpager.activities.CubeEffectActivity
import com.example.viewpager.activities.DotsIndicatorActivity
import com.example.viewpager.activities.ImageViewPagerActivity
import com.example.viewpager.activities.TabViewPagerActivity
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        buttonClicks(binding)
    }

    private fun buttonClicks(binding: ActivityMainBinding) {
        binding.viewPagerTabLayout.setOnClickListener(){
            val intent = Intent(this, TabViewPagerActivity::class.java)
            startActivity(intent)
        }

        binding.viewPagerImageSlider.setOnClickListener(){
            val intent = Intent(this, ImageViewPagerActivity::class.java)
            startActivity(intent)
        }

        binding.viewPagerCubeScalingAnimation.setOnClickListener {
            val intent = Intent(this, CubeEffectActivity::class.java)
            startActivity(intent)
        }

        binding.dotsIndicatorButton.setOnClickListener {
            val intent = Intent(this, DotsIndicatorActivity::class.java)
            startActivity(intent)
        }
    }
}