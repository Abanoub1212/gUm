package com.example.gum.YEAR2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjects2y2 : AppCompatActivity(), RecycleOnClickListener{
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.arch,
            R.drawable.network,
            R.drawable.algorithim,
            R.drawable.system,
            R.drawable.communcation,
            R.drawable.diff,

            )
        heading = arrayOf(
            "Computer architecture \nis the organisation of the components which make up a computer system",
            "computer network \n is a set of computers sharing resources located on or provided by network nodes.",
            "Algorithm\n is a set of well-defined instructions to solve a particular problem.",
            "Systems analysis\n is the process by which an individual (s) studies a system such that an information system can be analyzed",
            " presentation & Communication skills \n are Building Student Confidence in Oral Communication",
            "Differential equation\n is an equation with one or more derivatives of a function. ",

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