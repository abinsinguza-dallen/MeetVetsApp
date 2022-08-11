package com.dallens.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class Regestration : AppCompatActivity() ,
    AdapterView.OnItemSelectedListener {
    lateinit var spinner: Spinner
    lateinit var textView: TextView
    lateinit var tvreg:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regestration)

        tvreg=findViewById(R.id.tvreg)
        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)

        tvreg.setOnClickListener {
            var intent=Intent(this,Homescreen::class.java)
            startActivity(intent)
        }

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.Gender,
            android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this


}

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String = parent?.getItemAtPosition(position).toString()
        textView.text = text
    }
}





