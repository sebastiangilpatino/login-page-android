package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_list_view.*

class ProductDetailed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detailed)
        val intent = intent
//        val input = intent.getStringExtra("username")
// Set the Layout Manager
        recyclerView1.layoutManager = LinearLayoutManager(this)
        // Create an object for the MyAdapter
//        val adapter = MyAdapter2(products)
        // Set adapter to your RecyclerView
//        recyclerView1.adapter = adapter
    }
}