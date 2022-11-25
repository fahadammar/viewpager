package com.example.viewpager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager.R

class ImageSliderAdapter(var context : Context, var imageList: List<Int>) : PagerAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }
    // On Below Line We Are Returning Object
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as RelativeLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // On Below line we are initializing our item and inflating our layout file
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        // On Below Line we are inflating our custom layout file which we have created
        val view : View = layoutInflater.inflate(R.layout.image_slider_item, container, false)
        // On Below line we are initializing our image view with the ID
        val imageView : ImageView = view.findViewById(R.id.imageView) as ImageView

        // On Below line we are setting image resource for image view
        imageView.setImageResource(imageList[position])
        // On Below line we are adding this item view to the container
        container.addView(view)
        // On Below line we are simply returning our item view
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }
}