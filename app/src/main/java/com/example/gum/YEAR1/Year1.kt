package com.example.gum.YEAR1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.databinding.ActivityYear1Binding

class Year1 : AppCompatActivity() {
    lateinit var binding: ActivityYear1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityYear1Binding.inflate(layoutInflater)
        setContentView(binding.root)


          binding. Y1s1.setOnClickListener {
                var intent = Intent(this, subjects1y1::class.java)
                startActivity(intent)
            }
       binding.y1s2.setOnClickListener {
            var intent = Intent(this, subjects2y1::class.java)
            startActivity(intent)
        }


    }
}