package com.example.novel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewNovelAdapter constructor(private val getActivity: MainActivity, private val novelList : List<Novel>):
    RecyclerView.Adapter<RecyclerViewNovelAdapter.MyViewHolder> ()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewNovelAdapter.MyViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_novel_list_item,parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvNovelTitle.text = novelList [position].title
        holder.ivNovelImg.setImageResource(novelList[position].image)

        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, novelList[position].title, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return novelList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvNovelTitle : TextView = itemView.findViewById(R.id.tvNovelTitle)
        val ivNovelImg : ImageView = itemView.findViewById(R.id.ivNovelImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)

    }
}