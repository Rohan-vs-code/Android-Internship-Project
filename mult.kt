package com.example.internship

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mult)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var numberone : EditText = findViewById(R.id.text3)
        var numbertwo : EditText = findViewById(R.id.text4)
        var button1 : Button = findViewById(R.id.mul_button)
        var takes : TextView = findViewById(R.id.res)

        button1.setOnClickListener {
            val input1 = numberone.text.toString()
            val input2 = numbertwo.text.toString()
            if (input1.isEmpty() || input2.isEmpty()) {
                takes.text = "Please enter both numbers"
                return@setOnClickListener
            }
            val a1 = input1.toInt()
            val a2 = input2.toInt()
            val ans = a1 * a2
            takes.setText("Multiplication is "+ans)
        }
    }
}