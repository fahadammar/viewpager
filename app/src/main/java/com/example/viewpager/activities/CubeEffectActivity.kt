package com.example.viewpager.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.viewpager.R
import com.example.viewpager.animation.AnimationCubeInScaling
import com.example.viewpager.databinding.ActivityCubeEffectBinding
import com.example.viewpager.model.ImageSliderModel

class CubeEffectActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCubeEffectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCubeEffectBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        var viewPager  = binding.viewPagerCubeEffect
        viewPager.setPageTransformer(true, AnimationCubeInScaling())

        viewPager.adapter = ImageSliderModel.getImageSliderAdapter(this@CubeEffectActivity, true)
    }
}