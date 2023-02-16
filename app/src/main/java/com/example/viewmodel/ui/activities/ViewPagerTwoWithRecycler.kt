package com.example.viewmodel.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewmodel.R
import com.example.viewmodel.adapter.ViewPagerTwoAdapter
import com.example.viewmodel.databinding.ActivityViewPagerSecondBinding
import com.example.viewmodel.databinding.ActivityViewPagerTwoWithRecyclerBinding
import com.example.viewmodel.model.ViewPagerTwoModel

class ViewPagerTwoWithRecycler : AppCompatActivity() {
    lateinit var binding: ActivityViewPagerTwoWithRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerTwoWithRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // we can use the orientations of the viewpager2 as accordingly - uncomment one and comment other, to use up to your own choice.
        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        //binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL


        binding.viewPager.adapter = ViewPagerTwoAdapter(this, setTheModel())

    }

    fun setTheModel(): ArrayList<ViewPagerTwoModel> {
        var arrayList = ArrayList<ViewPagerTwoModel>()
        arrayList.add(ViewPagerTwoModel("Lahore", R.drawable.lahore))
        arrayList.add(ViewPagerTwoModel("Nature", R.drawable.nature))
        arrayList.add(ViewPagerTwoModel("Eight", R.drawable.eight))
        return arrayList
    }
}