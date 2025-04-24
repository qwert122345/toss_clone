package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class numpad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_numpad)

        val back = findViewById<ImageView>(R.id.ico_back)
        back.setOnClickListener{
            val pageEvent = Intent(this,Wheretosend::class.java)
            startActivity(pageEvent)
        }

        var num_0 = findViewById<LinearLayout>(R.id.num_0)
        var num_00 = findViewById<LinearLayout>(R.id.num_00)
        var num_1 = findViewById<LinearLayout>(R.id.num_1)
        var num_2 = findViewById<LinearLayout>(R.id.num_2)
        var num_3 = findViewById<LinearLayout>(R.id.num_3)
        var num_4 = findViewById<LinearLayout>(R.id.num_4)
        var num_5 = findViewById<LinearLayout>(R.id.num_5)
        var num_6 = findViewById<LinearLayout>(R.id.num_6)
        var num_7 = findViewById<LinearLayout>(R.id.num_7)
        var num_8 = findViewById<LinearLayout>(R.id.num_8)
        var num_9 = findViewById<LinearLayout>(R.id.num_9)
        var num_clear = findViewById<LinearLayout>(R.id.num_clear)

        var num = findViewById<TextView>(R.id.num_text)

        num_0.setOnClickListener{
            val numtext = num.text.toString()

            if(numtext == "얼마나 옮길까요?"){
                Log.d("output","correct")
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}