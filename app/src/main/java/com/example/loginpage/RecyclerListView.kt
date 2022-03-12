package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_list_view.*

class RecyclerListView : AppCompatActivity() {
    private val products = ArrayList<Product>(
        arrayListOf(
            Product("Java", "25", "blue", R.drawable.java,"1","any1"),
            Product("C#", "25", "green",R.drawable.csharp,"1","any1"),
            Product("Kotlin", "25", "purple",R.drawable.kotlin,"1","any1"),
            Product("Python", "25", "red",R.drawable.python,"1","any1"),
            Product("Ruby", "25", "orange",R.drawable.ruby,"1","any1")
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_list_view)
        // Set the Layout Manager
        recyclerView1.layoutManager = LinearLayoutManager(this)
        // Create an object for the MyAdapter
        val adapter = MyAdapter(products)
        // Set adapter to your RecyclerView
        recyclerView1.adapter = adapter
//        val image = findViewById<ImageView>(R.id.image)
//        image.setOnClickListener {
//            val intent = Intent(this, ProductDetailed::class.java)
//            intent.putExtra("product", products)
//            startActivity(intent)
//        }
    }
}