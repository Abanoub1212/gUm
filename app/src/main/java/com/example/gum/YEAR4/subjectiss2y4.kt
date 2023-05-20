package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectiss2y4 : AppCompatActivity() , RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.cc,
            R.drawable.dss,
            R.drawable.sec,
            R.drawable.adb,
            R.drawable.gis,

            )
        heading = arrayOf(
            "cloud computing\n is the delivery of computing services—including servers, storage, databases, networking, software",
            "Decision support system (DSS)\n is a computer program application used to improve a company's decision-making ",
            "Security\n  refers to the methods, tools and personnel used to defend an organization's digital assets",
            " Advanced Database Solutions\n makes your business' complicated software needs seem easy",
            "geographic information system (GIS)\n is a computer system for capturing, storing, checking, and displaying data related to positions",
        )
        newRecyclerView=findViewById(R.id.mylist)
        newRecyclerView.layoutManager= LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf()
        getUserdata()
    }
    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = news(imageId[i], heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = adapter(newArrayList,this)
    }
    override fun onClick(n: news?) {
        var intent = Intent(this, ShowLinks::class.java).apply {
            putExtra(EXTRA_MESSAGE, n)
        }
        startActivity(intent)
    }
}