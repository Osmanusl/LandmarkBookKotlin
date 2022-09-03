package com.osmanuslu.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.osmanuslu.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList=ArrayList<Landmark>()

        val pisa =Landmark("pisa","italya",R.drawable.pisa)
        val colesseum=Landmark("colleseum","italya",R.drawable.colesium)
        val eyfel=Landmark("eyfel","france",R.drawable.eyfel)
        val bridge=Landmark("london bridge","england",R.drawable.london)

        landmarkList.add(pisa)
        landmarkList.add(colesseum)
        landmarkList.add(eyfel)
        landmarkList.add(bridge)


        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter =LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter =landmarkAdapter

        }
}