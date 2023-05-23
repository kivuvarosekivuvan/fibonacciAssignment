package com.roseKN.fibonacciassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonacciNumber {


}


class NumsRvAdapter(val num: List<NumFib>): RecyclerView.Adapter<NumsRvAdapter.NumsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.num_list, parent, false)
        return NumsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return num.size

    }

    override fun onBindViewHolder(holder: NumsViewHolder, position: Int) {
        var number = num[position]
        holder.numtxtView.text = number.toString()
    }



class NumsViewHolder(itemView:View): ViewHolder(itemView){
    var numtxtView: TextView= itemView.findViewById(R.id.tvRecycler)
}}
