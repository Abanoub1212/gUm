package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gum.R
import com.example.gum.YEAR1.subjects1y1
import com.example.gum.YEAR3.subjectcss1y3
import com.example.gum.YEAR3.subjectcss2y3
import com.example.gum.databinding.ActivityYear1Binding
import com.example.gum.databinding.ActivityYear3Binding
import com.example.gum.databinding.ActivityYear3CsBinding

class Year3_cs : AppCompatActivity() {
    lateinit var binding: ActivityYear3CsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYear3CsBinding.inflate(layoutInflater)
        setContentView(binding.root)
      binding.y3css1.setOnClickListener {
          var intent = Intent(this, subjectcss1y3::class.java)
          startActivity(intent)
      }
        binding.y3css2.setOnClickListener {
            var intent = Intent(this, subjectcss2y3::class.java)
            startActivity(intent)
        }


    }
}