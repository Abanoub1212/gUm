package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectiss2y3 : AppCompatActivity(), RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.data_wer,
            R.drawable.file,
            R.drawable.project,
            R.drawable.ai,
            R.drawable.m_s,
            R.drawable.datami,

            )
        heading = arrayOf(
            "Data warehouse\n is a central repository of information that can be analyzed to make more informed decisions",
            "File structures\n are not fixed entities, but rather build a framework that communicates the function and purpose of elements within a project",
            "Software Project Management\nManaging any piece of software or software dev project should be a nightmare ",
            "Artificial intelligence\n is a branch of computer science concerned with building machines",
            "Modeling and simulation\n help you to understand the behavior of a dynamic system and how the various components of that",
            "Data mining \nis the process of analyzing big amounts of data to find trends and patterns",
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