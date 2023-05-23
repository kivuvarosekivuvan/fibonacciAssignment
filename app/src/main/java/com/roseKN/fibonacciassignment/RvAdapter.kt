package com.roseKN.fibonacciassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.text.FieldPosition


class NumsRvAdapter(val num: List<FibonacciNumber>): RecyclerView.Adapter<NumsRvAdapter.NumsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.num_list, parent, false)
        return NumsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return num.size

    }

    override fun onBindViewHolder(holder: NumsViewHolder, position: Int) {
        var number = num[position]
        holder.numtxtView.text = number.value.toString()
    }



class NumsViewHolder(itemView:View): ViewHolder(itemView){
    var numtxtView: TextView= itemView.findViewById(R.id.tvRecycler)
}}
