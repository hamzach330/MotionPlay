package com.hamza.motionplay

import com.hamza.motionplay.models.Statistics
import com.hamza.motionplay.models.SuperChargers

class DataSource {

    companion object {

        fun getStatisticsData(): ArrayList<Statistics> {
            val list = ArrayList<Statistics>()

            list.add(Statistics(R.drawable.list_item_a, "240 Volts", "Voltage"))
            list.add(Statistics(R.drawable.list_item_b, "540 Km", "Remaining Charge"))
            list.add(Statistics(R.drawable.list_item_c, "20 Min", "Fast Charge"))

            return list

        }

        fun getSuperChargersData(): ArrayList<SuperChargers> {
            val list = ArrayList<SuperChargers>()

            list.add(SuperChargers("Ranchview Dr.Richardson", "4/10 Available", "1.4 Km"))
            list.add(SuperChargers("Thornridge St 9", "5/10 Available", "2.4 Km"))
            list.add(SuperChargers("Penny", "1/10 Available", "2.6 Km"))
            list.add(SuperChargers("Rewe", "6/10 Available", "3.4 Km"))
            list.add(SuperChargers("Cottbus Hbf", "3/10 Available", "5.6 Km"))
            list.add(SuperChargers("Wolliner Str 28", "5/10 Available", "2.1 Km"))
            list.add(SuperChargers("Jamlitzer Str 10", "8/10 Available", "11.5 Km"))
            list.add(SuperChargers("Bandenberg Tor", "1/10 Available", "13.7 Km"))

            return list

        }
    }
}