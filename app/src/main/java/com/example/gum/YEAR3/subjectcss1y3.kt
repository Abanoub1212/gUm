package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectcss1y3 : AppCompatActivity(), RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.ass,
            R.drawable.bl,
            R.drawable.ai,
            R.drawable.wep,
            R.drawable.os,
            R.drawable.databaes,
            R.drawable.softwear,

            )
        heading = arrayOf(
            "assembly language\n Each personal computer has a microprocessor that manages the computer's " ,
            "Parallel programming\n is the process of using a set of resources to solve a problem in less time by dividing the work.",
            "Artificial intelligence\n is a branch of computer science concerned with building machines ",
            "Web design \nrefers to the design of websites that are displayed on the internet.",
            "Operating system\nis system software that manages computer hardware, software resources",
            "A database \n is an organized collection of structured information, or data, typically stored electronically in a computer system",
            "Software engineering \n is the branch of computer science that deals with the design,",
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
        var adapter=adapter(newArrayList,this)
        newRecyclerView.adapter = adapter
        //  newRecyclerView.adapter = adapter(newArrayList)
    }


    override fun onClick(n: news?) {
        var intent = Intent(this, ShowLinks::class.java).apply {
            putExtra(EXTRA_MESSAGE, n)
        }
        startActivity(intent)
    }
}