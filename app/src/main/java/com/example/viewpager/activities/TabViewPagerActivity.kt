package com.example.viewpager.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.adapter.PageAdapter
import com.example.viewpager.databinding.ActivityTabViewPagerBinding

class TabViewPagerActivity : AppCompatActivity() {
    lateinit var binding : ActivityTabViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabViewPagerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        viewPager.adapter = PageAdapter(supportFragmentManager)

        val tabLayout = binding.tabLayout
        tabLayout.setupWithViewPager(viewPager)
    }
}