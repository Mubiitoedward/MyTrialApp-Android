package com.example.mytrialapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SelectRoutine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_routine)

        val actionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        actionButton.setOnClickListener {
            val intent = Intent(this, create_routine2::class.java)
         //   intent.putExtra("key","I am coming from select routine activity")
            startActivity(intent)
        }
    }
}