package com.example.mycityapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class C1_R1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c1_r1)

        val recommendation1 = findViewById<TextView>(R.id.recommendation_1)

        recommendation1.setOnClickListener {
            // Start the SecondActivity when the TextView is clicked
            val intent = Intent(this, C1_R1_D::class.java)
            startActivity(intent)
        }


    }
}