package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tossbank = findViewById<LinearLayout>(R.id.toss_bank)
        tossbank.setOnClickListener{
            val pageEvent = Intent(this,Tossbank::class.java)
            startActivity(pageEvent)
        }

        val goto_tossbank = findViewById<LinearLayout>(R.id.goto_tossbank)
        goto_tossbank.setOnClickListener{
            val pageEvent = Intent(this,Tossbank::class.java)
            startActivity(pageEvent)
        }

        val transfer_btn = findViewById<LinearLayout>(R.id.transfer_btn)
        transfer_btn.setOnClickListener{
            val pageEvent = Intent(this,Wheretosend::class.java)
            startActivity(pageEvent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}