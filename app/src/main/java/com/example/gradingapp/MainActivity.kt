package com.example.gradingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editTextTextEditText = findViewById<EditText>(R.id.editTextText)
        val buttonButton = findViewById<Button>(R.id.button)
        val textViewTextView = findViewById<TextView>(R.id.textView)
        buttonButton.setOnClickListener{
            val editTextText =editTextTextEditText.text.toString()
            if (editTextText.isNotEmpty()){
                val marks =editTextText.toInt()
                val grade = when {
                    marks <0 || marks > 100-> "Invalid Marks"
                    marks <40 -> "F"
                    marks in 40..49  -> "W"
                    marks in 50..59  -> "S"
                    marks in 60..74  -> "C"
                    marks in 75..89  -> "B"
                    marks in 90..100  -> "A"
                    else -> "Invalid"
                }
                textViewTextView.text = "Marks: $marks, Grdae: $grade"
            }
            else {
                textViewTextView.text = "Please Enter Valid Numbers."

            }
        }
    }
}