package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectcais1y3 : AppCompatActivity(), RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.imagepro,
            R.drawable.ropo,
            R.drawable.databaes,
            R.drawable.ai,
            R.drawable.os,
            R.drawable.softwear,

            )
        heading = arrayOf(

            "image processing \n is the use of a digital computer to process digital images through an algorithm.",
            "Robotics\n is a branch of engineering that involves the conception, design, manufacture and operation of robots",
            "A database \nis an organized collection of structured information, or data, typically stored electronically in a computer system",
            "Artificial intelligence\n is a branch of computer science concerned with building machines ",
            "Operating system\nis system software that manages computer hardware, software resources",
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