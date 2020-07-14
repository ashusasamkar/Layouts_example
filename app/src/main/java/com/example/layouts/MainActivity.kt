package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val linearLayout_btn = findViewById(R.id.linear_btn) as Button
        val relativeLayout_btn = findViewById(R.id.relative_btn) as Button
        val constraintLayout_btn = findViewById(R.id.constraint_btn) as Button

        linearLayout_btn.setOnClickListener{
            intent = Intent(applicationContext, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        relativeLayout_btn.setOnClickListener {
            intent = Intent(applicationContext, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        constraintLayout_btn.setOnClickListener {
            intent = Intent(applicationContext, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }


    }
}