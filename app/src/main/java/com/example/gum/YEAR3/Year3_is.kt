package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.YEAR1.subjects1y1
import com.example.gum.YEAR3.subjectcss1y3
import com.example.gum.YEAR3.subjectcss2y3
import com.example.gum.YEAR3.subjectiss1y3
import com.example.gum.YEAR3.subjectiss2y3
import com.example.gum.databinding.ActivityYear1Binding
import com.example.gum.databinding.ActivityYear3Binding
import com.example.gum.databinding.ActivityYear3CsBinding
import com.example.gum.databinding.ActivityYear3IsBinding

class Year3_is: AppCompatActivity() {
    lateinit var binding: ActivityYear3IsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear3IsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y3iss1.setOnClickListener {
            var intent = Intent(this, subjectiss1y3::class.java)
            startActivity(intent)
        }
        binding.y3iss2.setOnClickListener {
            var intent = Intent(this, subjectiss2y3::class.java)
            startActivity(intent)
        }


    }
}