package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tossbank : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tossbank)

        val btn_send = findViewById<LinearLayout>(R.id.btn_send)
        btn_send.setOnClickListener{
            val pageEvent = Intent(this,Wheretosend::class.java)
            startActivity(pageEvent)
        }

        val back_1 = findViewById<ImageView>(R.id.ico_back_1)
        back_1.setOnClickListener{
            val pageEvent = Intent(this,MainActivity::class.java)
            startActivity(pageEvent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}