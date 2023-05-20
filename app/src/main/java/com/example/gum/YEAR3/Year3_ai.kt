package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.YEAR1.subjects1y1
import com.example.gum.YEAR3.subjectcais1y3
import com.example.gum.YEAR3.subjectcss1y3
import com.example.gum.YEAR3.subjectcss2y3
import com.example.gum.databinding.ActivityYear1Binding
import com.example.gum.databinding.ActivityYear3AiBinding
import com.example.gum.databinding.ActivityYear3Binding
import com.example.gum.databinding.ActivityYear3CsBinding

class Year3_ai : AppCompatActivity() {
    lateinit var binding: ActivityYear3AiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear3AiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.y3ais1.setOnClickListener {
            var intent = Intent(this, subjectcais1y3::class.java)
            startActivity(intent)
        }
        binding.y3ais2.setOnClickListener {
            var intent = Intent(this, subjectcss2y3::class.java)
            startActivity(intent)
        }


    }
}