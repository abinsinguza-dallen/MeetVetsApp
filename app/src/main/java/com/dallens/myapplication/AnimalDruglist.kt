package com.dallens.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dallens.myapplication.Adapter.DRUGSLIST

class AnimalDruglist : AppCompatActivity() {
    private lateinit var rvgrugs:RecyclerView
    private lateinit var adapter: DRUGSLIST
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_druglist)
        rvgrugs=findViewById(R.id.rvgrugs)
        adapter= DRUGSLIST()
        rvgrugs.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvgrugs.adapter=adapter

    }
}