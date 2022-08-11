package com.dallens.myapplication

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dallens.myapplication.databinding.ActivityViewdoctorBinding
import com.squareup.picasso.Picasso

class viewdoctor : AppCompatActivity() {
    lateinit var binding:ActivityViewdoctorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewdoctorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        var name=extras?.getString("NAME","")
        var location=extras?.getString("LOCATION","")
        var professional=extras?.getString("PROFESSIONAL","")
        var image=binding.imageView9

        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,location,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,professional,Toast.LENGTH_SHORT).show()
        binding.tvname2.text=name
        binding.tvlocation2.text=location
        binding.tvproffes2.text=professional

        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(600,600)
            .centerCrop()
            .into(image)





    }
}