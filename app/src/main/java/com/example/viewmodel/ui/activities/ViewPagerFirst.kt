package com.example.viewmodel.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodel.adapter.PagerAdapter
import com.example.viewmodel.databinding.ActivityViewPagerFirstBinding

class ViewPagerFirst : AppCompatActivity() {
    private lateinit var binding: ActivityViewPagerFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = PagerAdapter(supportFragmentManager)
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}