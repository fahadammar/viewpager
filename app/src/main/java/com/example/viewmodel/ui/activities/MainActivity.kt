package com.example.viewmodel.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        buttonClicks(mainBinding)
    }

    private fun buttonClicks(binding: ActivityMainBinding) {
        binding.button1.setOnClickListener {
            val intent = Intent(this, ViewPagerFirst::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, ViewPagerSecond::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this, ViewPagerTwoWithRecycler::class.java)
            startActivity(intent)
        }
    }

}