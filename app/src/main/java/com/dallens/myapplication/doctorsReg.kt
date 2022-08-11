package com.dallens.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.dallens.myapplication.databinding.ActivityDoctorsRegBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class doctorsReg : AppCompatActivity() {
    lateinit var binding: ActivityDoctorsRegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorsRegBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun btnreg(view: View) {
        var name: TextInputEditText = binding.etname
        var getnae: TextView = binding.tvyes
        var str: String = name.text.toString()
        getnae.setText(str)


    }

}


////
//}
//
//}
//fun calculateBmi(weight: Double, height: Int) {
//    var heightMetres = height / 100.0
//    var bmi = weight / (heightMetres * heightMetres)
//    tvBmi.text = bmi.toString()
//    if (bmi < 18.5) {
//        tvanwer.text = "UnderWeight"
//    } else if (bmi > 18.5 && bmi <= 25.0) {
//        tvanwer.text = "Normal"
//    } else if (bmi >= 25.1 && bmi <= 30.0) {
//        tvanwer.text = "overweight"
//    }
//    else if (bmi>30.0){
//        tvanwer.text  = "Obese"
//    }
//
//}
//}