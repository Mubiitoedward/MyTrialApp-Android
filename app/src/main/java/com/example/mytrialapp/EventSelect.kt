package com.example.mytrialapp

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class EventSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_select)
        val addEv = findViewById<TextView>(R.id.tmText2)
        addEv.setOnClickListener {
            val intent = Intent(this,create_routine2::class.java)
            startActivity(intent)

            val currentTime = Calendar.getInstance()
            val hour = currentTime.get(Calendar.HOUR_OF_DAY)
            val minute = currentTime.get(Calendar.MINUTE)

            // Create a TimePickerDialog
            val timePickerDialog = TimePickerDialog(
                this,
                { _, selectedHour, selectedMinute ->
                    // Set the selected time to the TextView
                    //textView.text = "$selectedHour:$selectedMinute"
                },
                hour,
                minute,
                false
            )

            // Show the TimePickerDialog
            timePickerDialog.show()

        }
    }
}