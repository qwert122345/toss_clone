package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sendcomplete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sendcomplete)

        //뒤로가기
        val back = findViewById<ImageView>(R.id.ico_back)
        back.setOnClickListener {
            val pageEvent = Intent(this, send::class.java)
            startActivity(pageEvent)
        }

        //다음으로
        val next = findViewById<LinearLayout>(R.id.next)
        next.setOnClickListener{
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