package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.databinding.ActivityYear3IsBinding
import com.example.gum.databinding.ActivityYear4CsBinding
import com.example.gum.databinding.ActivityYear4IsBinding

class Year4_cs : AppCompatActivity() {
    lateinit var binding: ActivityYear4CsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear4CsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y4css1.setOnClickListener {
            var intent = Intent(this, A5ers1y4::class.java)
            startActivity(intent)
        }
        binding.y4css2.setOnClickListener {
            var intent = Intent(this, A5ers2y4::class.java)
            startActivity(intent)
        }
    }
}