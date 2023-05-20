package com.example.gum.YEAR4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class A5erais1y4 : AppCompatActivity() , RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.aii,
            R.drawable.com_ves,
            R.drawable.deepl,
            R.drawable.m_s,
            R.drawable.imagepro,


            )
        heading = arrayOf(
            "AI Interaction\n the need for conversational ai to feel moor human, not just sound more human",
            "Computer vision \nis a field of artificial intelligence that enables computers and systems to derive meaningful information ",
            "Deep learning\n is a subset of machine learning, which is essentially a neural network with three or more layers.",
            "Modeling and simulation\n help you to understand the behavior of a dynamic system and how the various components of that",
            "image processing \n is the use of a digital computer to process digital images through an algorithm.",
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