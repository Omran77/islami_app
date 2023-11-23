package com.example.isalmi.ui.home.faragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.livedata.core.R
import androidx.recyclerview.widget.RecyclerView

class SuraNamesAdapter(val items:List<String>):RecyclerView.Adapter<SuraNamesAdapter.ViewHolder>() {

    class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        val name:TextView=itemview.findViewById(com.example.isalmi.R.id.chapter_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(com.example.isalmi.R.layout.item_chapter_name,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int =items.size
    var onItemClickListener:OnItemClickListener?=null // variable from interface
    //callback
    interface OnItemClickListener{
        fun onItemClick(pos:Int,name:String)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val suraName=items.get(position)
        holder.name.setText(suraName)
        if (onItemClickListener!=null){
            holder.itemView.setOnClickListener{
                onItemClickListener?.onItemClick(position,suraName)

            }
        }
    }

}