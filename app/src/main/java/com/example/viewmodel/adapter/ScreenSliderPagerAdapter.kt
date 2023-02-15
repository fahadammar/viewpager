package com.example.viewmodel.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

// We can make this adapter outside of the class
class ScreenSlidePagerAdapter(
    fragmentActivity: FragmentActivity,
    var fragmentArray: Array<Fragment>
) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return fragmentArray.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentArray[position]
    }
}