package com.example.mytrialapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class create_routine2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_routine2)
        val msg = intent.getStringExtra("key")
        findViewById<TextView>(R.id.crtText0).text = msg
        val addEv = findViewById<FloatingActionButton>(R.id.myFloatingActionButton2)
        addEv.setOnClickListener {
            val intent = Intent(this,EventSelect::class.java)
            startActivity(intent)
        }
    }
}