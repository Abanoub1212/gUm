package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class A5eraais2y4 : AppCompatActivity(), RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.iot,
            R.drawable.ir,

            R.drawable.toc,
            R.drawable.ds,
            R.drawable.com_ves,

            )
        heading = arrayOf(
            "Internet of things (IoT)\n is a system of interrelated computing devices",
            "Information Retrieval \nis the activity of obtaining material that can usually be documented on an unstructured nature ",
            "theory of computation \nis the branch that deals with what problems can be solved on a model of ...",
            "Global Distribution System \nis a worldwide reservation system that acts as a conduit between travel bookers and suppliers,",
            "Computer vision \nis a field of artificial intelligence that enables computers and systems to derive meaningful information ",
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