package com.hamza.jucrmocktest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hamza.jucrmocktest.databinding.ItemStatisticsBinding
import com.hamza.jucrmocktest.models.Statistics

class StatisticsRecyclerAdapter(private val statisticsList: ArrayList<Statistics>) :
    RecyclerView.Adapter<StatisticsRecyclerAdapter.StatisticsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatisticsViewHolder {
        val binding = ItemStatisticsBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return StatisticsViewHolder(binding)
    }

    override fun getItemCount() = statisticsList.size

    override fun onBindViewHolder(holder: StatisticsViewHolder, position: Int) {
        with(holder) {

            with(statisticsList[position]) {

                binding.txtTitle.text = title
                binding.txtSubtitle.text = subTitle


                Glide.with(holder.itemView.context)
                    .load(icon)
                    .into(binding.imgIcon)


            }
        }
    }

    inner class StatisticsViewHolder(val binding: ItemStatisticsBinding) :
        RecyclerView.ViewHolder(binding.root)

}