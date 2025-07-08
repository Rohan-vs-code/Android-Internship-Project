package com.example.internship

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var lay1 : LinearLayout = findViewById(R.id.layoutone)
        var lay2 : LinearLayout = findViewById(R.id.layouttwo)
        var lay3 : LinearLayout = findViewById(R.id.layoutthree)
        var lay4 : LinearLayout = findViewById(R.id.layoutfour)

        lay1.setOnClickListener {
            var adds = Intent(this,Add::class.java)
            startActivity(adds)
        }
        lay2.setOnClickListener {
            var subs = Intent(this,sub::class.java)
            startActivity(subs)
        }
        lay3.setOnClickListener {
            var mult = Intent(this,mult::class.java)
            startActivity(mult)
        }
        lay4.setOnClickListener {
            var divd = Intent(this,div::class.java)
            startActivity(divd)
        }
    }
}