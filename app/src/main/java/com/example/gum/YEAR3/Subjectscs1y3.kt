package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectscs1y3 : AppCompatActivity(), RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.or,
            R.drawable.databaes,
            R.drawable.appalgo,
            R.drawable.os,
            R.drawable.ai,
            R.drawable.softwear,

            )
        heading = arrayOf(
            "operation research\n  is an analytical method of problem-solving and decision-making that is useful in the management of organizations",
            "Algorithm\n is a set of well-defined instructions to solve a particular problem.",
            "A database \nis an organized collection of structured information, or data, typically stored electronically in a computer system",
            "Operating system\nis system software that manages computer hardware, software resources",
            "Artificial intelligence\n is a branch of computer science concerned with building machines ",
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