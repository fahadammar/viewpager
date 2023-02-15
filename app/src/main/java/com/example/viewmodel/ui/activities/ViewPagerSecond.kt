package com.example.viewmodel.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.viewmodel.R
import com.example.viewmodel.adapter.ScreenSlidePagerAdapter
import com.example.viewmodel.databinding.ActivityViewPagerSecondBinding
import com.example.viewmodel.ui.fragments.FragmentFirst
import com.example.viewmodel.ui.fragments.FragmentSecond
import com.example.viewmodel.ui.fragments.FragmentThird
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerSecond : AppCompatActivity() {
    private lateinit var binding: ActivityViewPagerSecondBinding
    var fragmentArray = arrayOf(
        FragmentFirst(),
        FragmentSecond(),
        FragmentThird()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = ScreenSlidePagerAdapter(this, fragmentArray)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            /**
             * Time to give your tabs some title or icon in the TabLayoutMediator lambda
             * we can also give the tabs the icon -> how about we give it to them
             * the function setTabLayoutAtStart sets the tabs of the index 1 and 2
             * the binding.tabLayout.getTabAt(0)?.select() > sets the tab at index 0 to be selected
             * tabSelection > contains the addOnTabSelectedListener which listens on the following
             * tabSelected, tabUnselected, tabReselected
             * */
            setTabLayoutAtStart(tab, position)
            binding.tabLayout.getTabAt(0)?.select()
            tabSelection(binding.tabLayout)
        }.attach()
    }

    private fun setTabLayoutAtStart(tab: TabLayout.Tab, position: Int) {
        when (position) {
            1 -> tab.customView = setIconTextAndColor(
                R.id.tab_icon,
                R.color.black,
                R.drawable.fragment_second_icon,
                position,
            )
            2 -> tab.customView = setIconTextAndColor(
                R.id.tab_icon,
                R.color.black,
                R.drawable.fragment_third_icon,
                position,
            )
        }
    }

    /**
     * this function contains the logic of setting the tab icons
     * */
    private fun tabSelection(tabLayout: TabLayout) {
        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> tabLayout.getTabAt(0)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.firstIcon,
                        R.drawable.fragment_first_icon,
                        tab!!.position,
                    )
                    1 -> tabLayout.getTabAt(1)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.secondIcon,
                        R.drawable.fragment_second_icon,
                        tab!!.position,
                    )
                    2 -> tabLayout.getTabAt(2)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.thirdIcon,
                        R.drawable.fragment_third_icon,
                        tab!!.position,
                    )
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> tabLayout.getTabAt(0)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.black,
                        R.drawable.fragment_first_icon,
                        tab!!.position,
                    )
                    1 -> tabLayout.getTabAt(1)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.black,
                        R.drawable.fragment_second_icon,
                        tab!!.position,
                    )
                    2 -> tabLayout.getTabAt(2)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.black,
                        R.drawable.fragment_third_icon,
                        tab!!.position,
                    )
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> tabLayout.getTabAt(0)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.firstIcon,
                        R.drawable.fragment_first_icon,
                        tab!!.position,
                    )
                    1 -> tabLayout.getTabAt(1)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.secondIcon,
                        R.drawable.fragment_second_icon,
                        tab!!.position,
                    )
                    2 -> tabLayout.getTabAt(2)!!.customView = setIconTextAndColor(
                        R.id.tab_icon,
                        R.color.thirdIcon,
                        R.drawable.fragment_third_icon,
                        tab!!.position,
                    )
                }
            }
        })
    }

    // This function is used to set the icon colors for each tab icon
    private fun setIconTextAndColor(
        tabIcon: Int,
        iconColor: Int,
        iconDrawable: Int,
        index: Int,
    ): View {
        val view = layoutInflater.inflate(R.layout.custom_tab_icons, null, false)
        val icon = view.findViewById<ImageView>(tabIcon)
        val tabText = view.findViewById<TextView>(R.id.tab_text)
        icon?.setImageResource(iconDrawable)
        icon?.setColorFilter(ContextCompat.getColor(this@ViewPagerSecond, iconColor))

        when (index) {
            0 -> tabText!!.text = "1st Fragment"
            1 -> tabText!!.text = "2nd Fragment"
            2 -> tabText!!.text = "3rd Fragment"
        }
        return view
    }
}