package com.example.viewmodel.ui.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewmodel.R
import com.example.viewmodel.databinding.FragmentThirdBinding

class FragmentThird : Fragment() {
    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.thirdFragmentLayout.setBackgroundColor(Color.RED)
        binding.thirdText.setTextColor(Color.WHITE)
    }
}