package com.dallens.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dallens.myapplication.databinding.ActivityDoctorAppointmentBinding

class DoctorAppointment : AppCompatActivity() {
    lateinit var binding: ActivityDoctorAppointmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDoctorAppointmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
            displatContacts()
        }
        fun displatContacts(){
            var contact1=Doctor("https://media.istockphoto.com/photos/veterinarian-examining-dog-picture-id1348850450","speriarq@gmai.com","05326532432","uganda")
            var contact2=Doctor("speria","speriarq@gmai.com","05326532432","uganda",)
            var contact3=Doctor("speria","speriarq@gmai.com","05326532432","uganda")

            var contact4=Doctor("speria","speriarq@gmai.com","05326532432","uganda")
            var contact5=Doctor("speria","speriarq@gmai.com","05326532432","uganda",)
            var contact6=Doctor("speria","speriarq@gmai.com","05326532432","uganda")

            var Contact5 = listOf(contact1,contact2,contact3,contact4,contact5,contact6)


            var contactsAdapter=RvApppointAdapter(Contact5)
            binding.rvdoctor.layoutManager=LinearLayoutManager(this)
            binding.rvdoctor.adapter=contactsAdapter

        }
    }




