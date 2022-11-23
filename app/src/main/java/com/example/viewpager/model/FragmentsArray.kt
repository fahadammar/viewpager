package com.example.viewpager.model

import androidx.fragment.app.Fragment
import com.example.viewpager.fragments.Fragment1
import com.example.viewpager.fragments.Fragment2
import com.example.viewpager.fragments.Fragment3

class FragmentsArray {
    companion object {
        private var fragmentArray = arrayListOf<Fragment>(Fragment1(), Fragment2(), Fragment3())
        fun getFragments(index : Int) : Fragment {
            return fragmentArray[index]
        }
        fun getFragmentsArraySize() : Int {
            return fragmentArray.size
        }
    }
}