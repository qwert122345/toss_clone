package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Wheretosend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wheretosend)

        val back_2 = findViewById<ImageView>(R.id.ico_back)
        back_2.setOnClickListener{
            val pageEvent = Intent(this,Tossbank::class.java)
            startActivity(pageEvent)
        }

        val list_account_1 = findViewById<LinearLayout>(R.id.list_account_1)
        val list_account_2 = findViewById<LinearLayout>(R.id.list_account_2)
        val list_account_3 = findViewById<LinearLayout>(R.id.list_account_3)
        val list_account_4 = findViewById<LinearLayout>(R.id.list_account_4)
        val list_account_5 = findViewById<LinearLayout>(R.id.list_account_5)

        list_account_2.setOnClickListener{
            val pageEvent = Intent(this,numpad::class.java)
            startActivity(pageEvent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}