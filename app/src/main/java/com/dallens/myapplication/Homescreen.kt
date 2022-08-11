package com.dallens.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.dallens.myapplication.databinding.ActivityHomescreenBinding
import com.dallens.myapplication.databinding.ActivitySignupBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Homescreen : AppCompatActivity() {
    lateinit var binding: ActivityHomescreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomescreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
        setUpBottomNav()
    }
        fun castViews(){

        }
        fun setUpBottomNav(){
            binding.bottomnav.setOnItemSelectedListener { item->
                when(item.itemId){
                    R.id.home ->{
                        supportFragmentManager.beginTransaction().replace(R.id.doctor,Homefragment()).commit()

                        true
                    }

                    R.id.doctor ->{
                        supportFragmentManager.beginTransaction().replace(R.id.doctor,vetfragment()).commit()
                        true
                    }
                    R.id.drugs->{
                        supportFragmentManager.beginTransaction().replace(R.id.doctor,AnimaldrugsFrag()).commit()
                        true
                    }
                    else-> false


                }
            }
        }
    }



