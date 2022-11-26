package com.example.viewpager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager.R

class CubeEffectViewPager(var context: Context, var imageList : ArrayList<Int>) : PagerAdapter() {

    private var layoutInflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        // return the number of images
        return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // inflating the image_items_for_cube.xml
        val imageItemsLayout : View = layoutInflater.inflate(R.layout.image_items_for_cube, container, false)

        // referencing the image view from the item.xml file
        val imageView : ImageView = imageItemsLayout.findViewById(R.id.imageItem)

        // setting the image in the imageView
        imageView.setImageResource(imageList[position])

        // Adding the view
        container.addView(imageItemsLayout)

        return imageItemsLayout
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}