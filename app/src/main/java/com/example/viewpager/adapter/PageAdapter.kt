package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.model.FragmentsArray

class PageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return FragmentsArray.getFragmentsArraySize()
    }

    override fun getItem(position: Int): Fragment {
        return FragmentsArray.getFragments(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
         return when(position){
             0 -> "Tab 1"
             1 -> "Tab 2"
             2 -> "Tab 3"
             else -> return null
         }
    }
}