package com.example.gum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.gum.YEAR1.Year1
import com.example.gum.YEAR2.Year2
import com.example.gum.YEAR3.Year3
import com.example.gum.YEAR4.Year4
import com.example.gum.databinding.ActivityChoose2Binding
import com.example.gum.databinding.ActivityYear3Binding

class Choose2 : AppCompatActivity() {
    lateinit var binding: ActivityChoose2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChoose2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {
                    var intent = Intent(this, Year1::class.java)
                    startActivity(intent)

                }


            binding.btn2.setOnClickListener {
                var intent = Intent(this, Year2::class.java)
                startActivity(intent)

            }

            binding.btn3.setOnClickListener {
                var intent = Intent(this, Year3::class.java)
                startActivity(intent)

            }

            binding.btn4.setOnClickListener {
                var intent = Intent(this, Year4::class.java)
                startActivity(intent)

            }



    }
}