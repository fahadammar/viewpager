package com.example.viewmodel.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewmodel.R
import com.example.viewmodel.adapter.ViewPagerTwoAdapter
import com.example.viewmodel.animation.ZoomOutPageTransformer
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
        binding.viewPager.setPageTransformer(ZoomOutPageTransformer()) // the animation

        setupPageChangeCallback()
    }

    private fun setTheModel(): ArrayList<ViewPagerTwoModel> {
        var arrayList = ArrayList<ViewPagerTwoModel>()
        arrayList.add(ViewPagerTwoModel("Lahore", R.drawable.lahore))
        arrayList.add(ViewPagerTwoModel("Nature", R.drawable.nature))
        arrayList.add(ViewPagerTwoModel("Eight", R.drawable.eight))
        return arrayList
    }

    private fun setupPageChangeCallback() {
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            // Triggered when you select a new page
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

            /**
             * This method will be invoked when the current page is scrolled,
             * either as part of a programmatically initiated
             * smooth scroll or a user initiated touch scroll.
             */
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            /**
             * Called when the scroll state changes.
             * Useful for discovering when the user begins dragging,
             * when a fake drag is started, when the pager is automatically settling
             * to the current page, or when it is fully stopped/idle.
             * state can be one of SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING or SCROLL_STATE_SETTLING.
             */
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }
        })
    }

    // Enable back and forth navigation in ViewPager
    override fun onBackPressed() {
        val viewPager = binding.viewPager
        if (viewPager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }
}