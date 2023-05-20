package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectscs1y4 : AppCompatActivity() , RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.mp,
            R.drawable.hpc,
            R.drawable.big,
            R.drawable.network,
            R.drawable.m_s,


            )
        heading = arrayOf(
            "Math programming languages\n is an algebraic modeling language to describe and solve high-complexity",
            "High performance computing (HPC) \nis the ability to process data and perform complex calculations at high speeds",
            "Big data analytics \nis the often complex process of examining big data to uncover information --",
            "computer network \n is a set of computers sharing resources located on or provided by network nodes.",
            "Modeling and simulation\n help you to understand the behavior of a dynamic system and how the various components of that",
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