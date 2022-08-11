package com.dallens.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.dallens.myapplication.R

class DRUGSLIST:RecyclerView.Adapter<DRUGSLIST.DrugViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrugViewHolder {
        val drug=LayoutInflater.from(parent.context).inflate(R.layout.drugs_list,parent,false)
    return DrugViewHolder(drug)
    }


    override fun onBindViewHolder(holder: DrugViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 25
    }
    class DrugViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }



}