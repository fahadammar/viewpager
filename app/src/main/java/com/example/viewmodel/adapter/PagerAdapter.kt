package com.example.viewmodel.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.viewmodel.ui.fragments.FragmentFirst
import com.example.viewmodel.ui.fragments.FragmentSecond
import com.example.viewmodel.ui.fragments.FragmentThird

class PagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentFirst()
            1 -> FragmentSecond()
            2 -> FragmentThird()
            else -> FragmentFirst()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Frag 1"
            1 -> return "Frag 2"
            2 -> return "Frag 3"
        }
        return super.getPageTitle(position)
    }
}