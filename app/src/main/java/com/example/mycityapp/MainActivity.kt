package com.example.mycityapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textView1)

        textView1.setOnClickListener {
            // Start the SecondActivity when the TextView is clicked
            val intent = Intent(this, C1_R1::class.java)
            startActivity(intent)
        }


    }
}