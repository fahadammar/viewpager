package com.example.viewpager.animation

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs

class AnimationCubeInScaling : ViewPager.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        firstWhenCheck(page, position)
        secondWhenCheck(page, position)
    }

    private fun firstWhenCheck(page:View, position: Float) {
        when {
            position < -1 -> {
                // page offset to left side
                page.alpha = 0F
            }

            position <= 0 -> {
                // transform from left, side of page to current page
                page.alpha = 1F
                page.pivotX = page.width.toFloat()
                page.rotationY = 90F * abs(position)
            }

            position <= 1 -> {
                // transition from current page to right side
                page.alpha = 1F
                page.pivotX = 0F
                page.rotationY = -90F * abs(position)
            }

            else -> {
                page.alpha = 0F
            }
        }
    }

    private fun secondWhenCheck(page: View, position: Float) {
        when {
            // transition between page 1 and page 2
            abs(position) <= 0.5 -> {
                page.scaleY = Math.max(0.4f, 1 - abs(position))
            }
        }
    }
}