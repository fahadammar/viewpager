package com.example.viewmodel.ui.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewmodel.databinding.FragmentFirstBinding


class FragmentFirst : Fragment() {

    // viewbinding
    private lateinit var binding : FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.firstFragmentLayout.setBackgroundColor(Color.BLUE)
        binding.firstText.setTextColor(Color.WHITE)
    }
}