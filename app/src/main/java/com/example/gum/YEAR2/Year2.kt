package com.example.gum.YEAR2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.databinding.ActivityYear2Binding
import com.example.gum.YEAR2.subjects1y2
import com.example.gum.YEAR2.subjects2y2

class Year2 : AppCompatActivity() {
    lateinit var binding: ActivityYear2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityYear2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Y2s1.setOnClickListener {
            var intent = Intent(this, subjects1y2::class.java)
            startActivity(intent)
        }
        binding.Y2s2.setOnClickListener {
            var intent = Intent(this, subjects2y2::class.java)
            startActivity(intent)
        }

    }
}