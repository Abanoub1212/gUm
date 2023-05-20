package com.example.gum.YEAR1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjects2y1 : AppCompatActivity(), RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.calculs,
            R.drawable.propapility,
            R.drawable.oop,
            R.drawable.electronics,

            R.drawable.english2,
            R.drawable.tecnical,

        )
        heading = arrayOf(
            "calculus\n is branch of mathematics concerned with the calculation of instantaneous rates of change (differential calculus)",
            "Probability\n is the branch of mathematics concerning numerical descriptions of how likely an event is to occur, or how likely it is that a proposition is",
            "Object-oriented programming (OOP) \n is a computer programming model that organizes software design around data, or objects, rather than functions and logic",
            "The field of electronics is a branch of physics and electrical engineering that deals with the emission, behaviour and effects of electrons using electronic",
            "English language\n the most popular language used in all over the world",
            "Technical writing\n is a type of writing where the author is writing about a particular subject ",
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