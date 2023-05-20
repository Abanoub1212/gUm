package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.gum.R
import com.example.gum.databinding.ActivityYear2Binding
import com.example.gum.databinding.ActivityYear3Binding

class Year3 : AppCompatActivity() {
    lateinit var binding: ActivityYear3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityYear3Binding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.btnCs3.setOnClickListener {
                var intent = Intent(this, Year3_cs::class.java)
                startActivity(intent)

            }


            binding.btnAi3.setOnClickListener {
                var intent = Intent(this, Year3_ai::class.java)
                startActivity(intent)

            }


            binding.btnSc3.setOnClickListener {
                var intent = Intent(this, Year3_sc::class.java)
                startActivity(intent)

            }


            binding.btnIs3.setOnClickListener {
                var intent = Intent(this, Year3_is::class.java)
                startActivity(intent)

            }

    }
}