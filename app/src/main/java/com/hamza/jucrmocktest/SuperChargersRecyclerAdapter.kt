package com.hamza.jucrmocktest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hamza.jucrmocktest.databinding.ItemSuperchargersBinding
import com.hamza.jucrmocktest.models.SuperChargers

class SuperChargersRecyclerAdapter(private val superChargersList: ArrayList<SuperChargers>) :
    RecyclerView.Adapter<SuperChargersRecyclerAdapter.SuperchargersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperchargersViewHolder {
        val binding = ItemSuperchargersBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperchargersViewHolder(binding)
    }

    override fun getItemCount() = superChargersList.size

    override fun onBindViewHolder(holder: SuperchargersViewHolder, position: Int) {
        with(holder) {

            with(superChargersList[position]) {

                binding.txtTitle.text = chargerName
                binding.txtAvailableChargers.text = chargerAvailabe
                binding.txtDistance.text = chargerDistance
            }
        }
    }

    inner class SuperchargersViewHolder(val binding: ItemSuperchargersBinding) :
        RecyclerView.ViewHolder(binding.root)

}