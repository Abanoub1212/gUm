package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectiss1y4 : AppCompatActivity() , RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.datami,
            R.drawable.network,
            R.drawable.ec,
            R.drawable.bim,
            R.drawable.eis,


            )
        heading = arrayOf(
            "Data mining\n is the process of sorting through large data sets to identify patterns and relationships \n",
            "A computer network\n is a set of computers sharing resources located on or provided by network nodes." ,
            "Ecommerce TAGLINE GOES Here\n",
            "Building Information Modeling (BIM)\n is the foundation of digital transformation in the architecture, engineerin",
            "Economics of Information Systems \n focuses on the economic aspects of information systems and software",
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