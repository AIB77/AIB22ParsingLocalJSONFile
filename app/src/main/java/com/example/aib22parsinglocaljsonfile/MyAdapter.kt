package com.example.aib22parsinglocaljsonfile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class MyAdapter (private val names: List<Students>) : RecyclerView.Adapter<MyAdapter.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row
                ,parent
                ,false
            )
        )

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name =names [position]

        holder.itemView.apply{
            tv.text="The Name: "+name.name+"\n"+"The Marks: "+name.marks+"\n"+"\n"
        }

    }

    override fun getItemCount() =    names.size
}