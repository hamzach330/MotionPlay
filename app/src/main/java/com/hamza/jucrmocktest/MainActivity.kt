package com.hamza.jucrmocktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hamza.jucrmocktest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val statisticsRecyclerAdapter = StatisticsRecyclerAdapter(DataSource.getStatisticsData())

        binding.recyclerViewStatistics.apply {
            adapter = statisticsRecyclerAdapter
        }

        val superChargersRecyclerAdapter =
            SuperChargersRecyclerAdapter(DataSource.getSuperChargersData())

        binding.recyclerViewSuperChargers.apply {
            adapter = superChargersRecyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


    }


}