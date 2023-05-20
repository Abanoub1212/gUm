package com.example.gum.YEAR1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjects1y1 : AppCompatActivity() , RecycleOnClickListener {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.cpp,
            R.drawable.discerte,
            R.drawable.human,
            R.drawable.physics,
            R.drawable.english,
            R.drawable.math,
            R.drawable.computer,
        )
        heading = arrayOf(
            "C++\n is a popular programming language.\n",
            "Discrete mathematics\n Discrete mathematics is the branch of mathematics ",
            "Human rights \n are rights inherent to all human beings \n",
            "physics \n is the natural science that studies matter, its ",
            "English \n the most popular language used in all over the world ",
            "math \n is used to make equation to solve problems",
            "Computer science \n is the study of computers and computational systems.",
        )


        newRecyclerView = findViewById(R.id.mylist)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = news(imageId[i], heading[i])
            newArrayList.add(news)
        }
        var adapter = adapter(newArrayList,this)
        newRecyclerView.adapter = adapter


    }

    override fun onClick(n: news?) {
        var intent = Intent(this, ShowLinks::class.java).apply {
            putExtra(EXTRA_MESSAGE, n)
        }
        startActivity(intent)
    }
}