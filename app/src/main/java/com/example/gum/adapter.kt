package com.example.gum

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class adapter(private val newslist:ArrayList<news>,val listener: RecycleOnClickListener): RecyclerView.Adapter<adapter.MyviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val itemview= LayoutInflater .from(parent.context).inflate(R.layout.list_item,parent ,false)
        return MyviewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem =newslist[position]
        holder.titleImage.setImageResource(currentItem.fiimage)
        holder.tvHeading.text= currentItem.heading
        holder.itemView.setOnClickListener {
            listener.onClick(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return newslist.size
    }
    class MyviewHolder(itemview:View):RecyclerView.ViewHolder(itemview)
    {
        val titleImage : ShapeableImageView = itemview.findViewById(R.id.fiimage)
        val tvHeading: TextView=itemview.findViewById(R.id.fitext)


    }

}