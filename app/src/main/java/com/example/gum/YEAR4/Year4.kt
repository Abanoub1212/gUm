package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.gum.R
import com.example.gum.YEAR3.*
import com.example.gum.databinding.ActivityYear3Binding
import com.example.gum.databinding.ActivityYear4Binding

class Year4 : AppCompatActivity() {
    lateinit var binding: ActivityYear4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityYear4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCS4.setOnClickListener {
            var intent = Intent(this, Year4_cs::class.java)
            startActivity(intent)

        }


        binding.btnAI4.setOnClickListener {
            var intent = Intent(this, Year4_ai::class.java)
            startActivity(intent)

        }
        binding.btnSC4.setOnClickListener {
            var intent = Intent(this, Year4_sc::class.java)
            startActivity(intent)

        }


        binding.btnIS4.setOnClickListener {
            var intent = Intent(this, Year4_is::class.java)
            startActivity(intent)

        }

    }
}