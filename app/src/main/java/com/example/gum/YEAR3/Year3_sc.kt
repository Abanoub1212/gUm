package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.YEAR1.subjects1y1
import com.example.gum.YEAR2.*
import com.example.gum.databinding.*

class Year3_sc : AppCompatActivity() {
    lateinit var binding: ActivityYear3ScBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear3ScBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y3scs1.setOnClickListener {
            var intent = Intent(this, subjectscs1y3::class.java)
            startActivity(intent)
        }
        binding.y3scs2.setOnClickListener {
            var intent = Intent(this,subjectscs2y3::class.java)
            startActivity(intent)
        }



    }
}