package com.example.gum.YEAR3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjectcss2y3 : AppCompatActivity() , RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.computer_network,
            R.drawable.comsec,
            R.drawable.graphic,
            R.drawable.storage,
            R.drawable.lan,
            R.drawable.nural_network,

            )
        heading = arrayOf(
            "A computer network\nis a set of computers sharing resources located on or provided by network nodes",
            "Computer security\n is the protection that is set up for computer systems and keeps critical information",
            "Graphics \n are visual images or designs on some surface\"",
            "Storage Management\n is defined as it refers to the management of the data storage equipment's ",
            "Natural language processing (NLP)\n is a subfield of linguistics, computer science, and artificial intelligence ",
            "A neural network\n is a network or circuit of biological neurons, or, in a modern sense, an artificial neural network",

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