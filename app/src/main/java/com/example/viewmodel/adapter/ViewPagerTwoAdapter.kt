package com.example.viewmodel.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodel.databinding.RecyclerItemLayoutBinding
import com.example.viewmodel.model.ViewPagerTwoModel

class ViewPagerTwoAdapter(private val context: Context, private val data: ArrayList<ViewPagerTwoModel>) :
    RecyclerView.Adapter<ViewPagerTwoAdapter.ViewPagerTwoHolder>() {
    class ViewPagerTwoHolder(binding: RecyclerItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val image = binding.labelHeader
        val text = binding.label
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerTwoHolder {
        val binding = RecyclerItemLayoutBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return ViewPagerTwoHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerTwoHolder, position: Int) {
        holder.image.setImageResource(data[position].image)
        holder.text.text = data[position].name
    }

    override fun getItemCount(): Int {
        return data.size
    }
}