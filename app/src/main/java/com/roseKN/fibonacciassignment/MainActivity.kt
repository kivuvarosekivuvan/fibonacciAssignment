package com.roseKN.fibonacciassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumFib(one: Long) {


}
class Main : AppCompatActivity() {
    lateinit var recyclerview: RecyclerView
    lateinit var adapter:NumsRvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.rv)
        recyclerview.layoutManager = LinearLayoutManager(this@Main)

        val numFibonacci= getnumFibonacci(100)
        adapter = NumsRvAdapter(numFibonacci)
        recyclerview.adapter = adapter

    }
    fun getnumFibonacci(count:Int): List<NumFib>{
        val nums= mutableListOf<NumFib>()

        var one=0L
        var two=1L

        repeat(count){
            nums.add(NumFib(one))
            val three = one+two
            one=two
            two=three
        }
        return nums
    }
}