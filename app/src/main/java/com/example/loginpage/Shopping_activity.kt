package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Shopping_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        val intent = intent
        val input = intent.getStringExtra("username")
        val output = findViewById<TextView>(R.id.username_shopping_activity)
        output.text = input
    }
    fun clickPic1(view: View){
        Toast.makeText(this, "You have chosen the Electronics category of shopping", Toast.LENGTH_LONG).show()
    }
    fun clickPic2(view: View){
        Toast.makeText(this, "You have chosen the Clothing category of shopping", Toast.LENGTH_LONG).show()
    }
    fun clickPic3(view: View){
        Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_LONG).show()
    }
    fun clickPic4(view: View){
        Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_LONG).show()
    }
}