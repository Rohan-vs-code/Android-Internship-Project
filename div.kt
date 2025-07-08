package com.example.internship

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class div : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_div)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var numberone : EditText = findViewById(R.id.text1)
        var numbertwo : EditText = findViewById(R.id.text2)
        var button1 : Button = findViewById(R.id.div_button)
        var take : TextView = findViewById(R.id.res)

        button1.setOnClickListener {
            val input1 = numberone.text.toString()
            val input2 = numbertwo.text.toString()
            if (input1.isEmpty() || input2.isEmpty()) {
                take.text = "Please enter both numbers"
                return@setOnClickListener
            }
            val a1 = input1.toDouble()
            val a2 = input2.toDouble()
            val ans = a1 / a2
            take.setText("Division is "+ans)
        }
    }
}