package com.example.trafficlayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.trafficlayers.databinding.ActivityMainBinding
import com.tomtom.sdk.map.display.ui.MapFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tomTomMap: com.tomtom.sdk.map.display.TomTomMap

    private val trafficLayers: TrafficLayers = TrafficLayers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.trafficLayers = trafficLayers

        initMap()
        setupListeners()
    }

    private fun initMap() {
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_container) as MapFragment
        mapFragment.getMapAsync { map ->
            tomTomMap = map
        }
    }

    private fun setupListeners() {
        binding.trafficFlowSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) tomTomMap.showTrafficFlow() else tomTomMap.hideTrafficFlow()
            trafficLayers.trafficFlow = isChecked
        }

        binding.trafficIncidentsSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) tomTomMap.showTrafficIncidents() else tomTomMap.hideTrafficIncidents()
            trafficLayers.trafficIncidents = isChecked
        }
    }

}