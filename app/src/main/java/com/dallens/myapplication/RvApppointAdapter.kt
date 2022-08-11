package com.dallens.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dallens.myapplication.databinding.ActivityDoctorAppointmentBinding
import com.dallens.myapplication.databinding.ActivityDoctorsRegBinding
import com.dallens.myapplication.databinding.ListDoctorsBinding
import com.squareup.picasso.Picasso

//import com.dallens.myapplication.databinding.ActivityViewdoctorBinding

class RvApppointAdapter (var doctorList:List<Doctor>):RecyclerView.Adapter<RvApppointAdapter.DoctorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {
        var binding=ListDoctorsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DoctorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        var context=holder.itemView.context
        var currentDoctor=doctorList.get(position)
        with(holder.binding){
            tvname.text=currentDoctor.name
            tvlocations.text=currentDoctor.location
            tvproffessionalism.text=currentDoctor.professional
            Picasso.get()
                .load(currentDoctor.image)
                .resize(300,300)
                .placeholder(R.drawable.ic_baseline_person_24)
                .into(holder.binding.imageView2)
            cvdoctors.setOnClickListener {
                val context=holder.itemView.context
                val intent=Intent(context,viewdoctor::class.java)
                intent.putExtra("NAME",currentDoctor.name)
                intent.putExtra("LOCATION",currentDoctor.location)
                intent.putExtra("PROFESSIONAL",currentDoctor.professional)
                intent.putExtra("IMAGE",currentDoctor.image)
                context.startActivity(intent)
            }
            holder.binding.imageView2.setOnClickListener {
                Toast.makeText(context,"This is an image",Toast.LENGTH_SHORT).show()
            }

        }


    }

    override fun getItemCount(): Int {
        return doctorList.size
    }

    class DoctorViewHolder (var binding:ListDoctorsBinding):RecyclerView.ViewHolder(binding.root)

    }




