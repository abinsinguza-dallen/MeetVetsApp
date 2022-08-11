package com.dallens.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dallens.myapplication.databinding.ActivityHomescreenBinding
import com.dallens.myapplication.databinding.ActivityUseroptionsBinding

class useroptions : AppCompatActivity() {
    lateinit var binding: ActivityUseroptionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityUseroptionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnvete.setOnClickListener {
            var intent=Intent(this,doctorsReg::class.java)
            startActivity(intent)
        }
        binding.btnfarmer.setOnClickListener {
            var intent=Intent(this,Regestration::class.java)
            startActivity(intent)
        }
        binding.btndrugshop.setOnClickListener {
            var intent=Intent(this,DrugshopDesc::class.java)
            startActivity(intent)
        }
        binding.btncontine.setOnClickListener {
            var intent=Intent(this,Homescreen::class.java)
            startActivity(intent)
        }
    }
}