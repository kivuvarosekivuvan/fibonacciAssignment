package com.roseKN.fibonacciassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Main : AppCompatActivity() {
    lateinit var recyclerview= RecyclerView
    lateinit var adapter:NumsRvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.findViewById(R.id.tvRecycler)
        recyclerview.layoutManager = LinearLayoutManager(this)
:
        val numFibonacci= getnumFibonacci(100)
        adapter = RvAdapter(numFibonacci)
        recyclerview.adapter = adapter

    }
    fun getnumFibonacci(count:Int): List<FibonacciNumber>{
        val nums= mutableListOf<FibonacciNumber>()

        var one=0L
        var two=1L

        repeat(count){
            nums.add(numFibonacci(one))
            val three = one+two
            one=two
            two=three
        }
        return nums
    }
}