package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.databinding.ActivityYear4IsBinding
import com.example.gum.databinding.ActivityYear4ScBinding

class Year4_sc : AppCompatActivity() {
    lateinit var binding: ActivityYear4ScBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear4ScBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y4scs1.setOnClickListener {
            var intent = Intent(this, subjectscs1y4::class.java)
            startActivity(intent)
        }
        binding.y4scs2.setOnClickListener {
            var intent = Intent(this, subjectiss2y4::class.java)
            startActivity(intent)
        }
    }
}