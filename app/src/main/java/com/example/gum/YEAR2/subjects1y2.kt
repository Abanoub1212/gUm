package com.example.gum.YEAR2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gum.*

class subjects1y2 : AppCompatActivity() , RecycleOnClickListener {
    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var  imageId: Array<Int>
    lateinit var heading :Array<String>
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects1y1)
        imageId = arrayOf(
            R.drawable.data,
            R.drawable.mis,
            R.drawable.information,
            R.drawable.logic,
            R.drawable.linear,
            R.drawable.staticals,

            )
        heading = arrayOf(
            "Data structure\n is a storage that is used to store and organize data",
            "A management information system (MIS)\n is an information system used for decision-making",
            "Information system\n an integrated set of components for collecting, storing, and processing data ",
            "Logic Design\n  is the function of the designer to develop a Boolean expression which describes the required circuit performance.",
            "Linear algebra\n is flat differential geometry and serves in tangent spaces to manifolds. ",
            "Statics\n is the study of methods for quantifying the forces between bodies",
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