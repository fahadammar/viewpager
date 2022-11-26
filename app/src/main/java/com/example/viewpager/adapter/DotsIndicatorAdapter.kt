package com.example.viewpager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager.R
import com.example.viewpager.model.ImageSliderModel

class DotsIndicatorAdapter(var context: Context, var imageList : ArrayList<Int>) : PagerAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var view = layoutInflater.inflate(R.layout.dots_indicator_item, null)
        var imageView : ImageView = view.findViewById(R.id.imageViewWithDots)
        imageView.setImageResource(imageList[position])
        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}