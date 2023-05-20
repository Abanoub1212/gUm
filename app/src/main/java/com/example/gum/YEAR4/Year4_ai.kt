package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.databinding.ActivityYear3AiBinding
import com.example.gum.databinding.ActivityYear4AiBinding

class Year4_ai : AppCompatActivity() {
    lateinit var binding: ActivityYear4AiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear4AiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y4ais1.setOnClickListener {
            var intent = Intent(this, A5erais1y4::class.java)
            startActivity(intent)
        }
        binding.y4ais2.setOnClickListener {
            var intent = Intent(this, A5eraais2y4::class.java)
            startActivity(intent)
        }
    }

}