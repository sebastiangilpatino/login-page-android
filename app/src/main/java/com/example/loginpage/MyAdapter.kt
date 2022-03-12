package com.example.loginpage

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class MyAdapter(var blist:ArrayList<Product>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.itemView.title.text = blist[position].title
        holder.itemView.price.text = blist[position].price
        holder.itemView.color.text = blist[position].color
        holder.itemView.image.setImageResource( blist[position].image)
        if(position == 0){
            holder.itemView.title.setBackgroundColor(Color.GRAY)
            holder.itemView.price.setBackgroundColor(Color.GRAY)
            holder.itemView.color.setBackgroundColor(Color.GRAY)
        }

    }

    override fun getItemCount(): Int {
        return blist.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}