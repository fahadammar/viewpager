package com.example.viewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    }

    fun jumpToTabViewPagerActivity(v : View?){
        val intent = Intent(this, TabViewPagerActivity::class.java)
        startActivity(intent)
    }

    fun jumpToImageViewPagerActivity(v : View?){
        val intent = Intent(this, ImageViewPagerActivity::class.java)
        startActivity(intent)
    }
}