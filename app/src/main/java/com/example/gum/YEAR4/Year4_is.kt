package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.databinding.ActivityYear3IsBinding
import com.example.gum.databinding.ActivityYear4CsBinding
import com.example.gum.databinding.ActivityYear4IsBinding

class Year4_is : AppCompatActivity() {
    lateinit var binding: ActivityYear4IsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear4IsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y4iss1.setOnClickListener {
            var intent = Intent(this, subjectiss1y4::class.java)
            startActivity(intent)
        }
        binding.y4iss2.setOnClickListener {
            var intent = Intent(this, subjectiss2y4::class.java)
            startActivity(intent)
        }
    }
}