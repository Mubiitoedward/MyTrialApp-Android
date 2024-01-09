package com.example.mytrialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreateRoutine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_routine)
        val msg = intent.getStringExtra("key")
        findViewById<TextView>(R.id.textView).text = msg
    }
}