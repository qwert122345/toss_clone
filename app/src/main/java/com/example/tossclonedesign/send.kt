package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class send : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_send)

        //뒤로가기
        val back = findViewById<ImageView>(R.id.ico_back)
        back.setOnClickListener {
            val pageEvent = Intent(this, numpad::class.java)
            startActivity(pageEvent)
        }

        //다음으로
        val next = findViewById<LinearLayout>(R.id.next)
        next.setOnClickListener{
            val pageEvent = Intent(this,sendcomplete::class.java)
            startActivity(pageEvent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}