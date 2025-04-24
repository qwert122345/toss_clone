package com.example.tossclonedesign

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class numpad() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<numpad> {
        override fun createFromParcel(parcel: Parcel): numpad {
            return numpad(parcel)
        }

        override fun newArray(size: Int): Array<numpad?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_numpad)

        //뒤로가기
        val back = findViewById<ImageView>(R.id.ico_back)
        back.setOnClickListener {
            val pageEvent = Intent(this, Wheretosend::class.java)
            startActivity(pageEvent)
        }

        //숫자 id 가져오기
        var num_1 = findViewById<LinearLayout>(R.id.num_1)
        var num_2 = findViewById<LinearLayout>(R.id.num_2)
        var num_3 = findViewById<LinearLayout>(R.id.num_3)
        var num_4 = findViewById<LinearLayout>(R.id.num_4)
        var num_5 = findViewById<LinearLayout>(R.id.num_5)
        var num_6 = findViewById<LinearLayout>(R.id.num_6)
        var num_7 = findViewById<LinearLayout>(R.id.num_7)
        var num_8 = findViewById<LinearLayout>(R.id.num_8)
        var num_9 = findViewById<LinearLayout>(R.id.num_9)
        var num_0 = findViewById<LinearLayout>(R.id.num_0)
        var num_00 = findViewById<LinearLayout>(R.id.num_00)
        var num_clear = findViewById<LinearLayout>(R.id.num_clear)

        //입력 중인 숫자 id 가져오기
        var num = findViewById<TextView>(R.id.num_text)

        //잔액 버튼 가져오기
        var left = findViewById<LinearLayout>(R.id.leftmoney)

        //원 가져오기
        var won = findViewById<TextView>(R.id.num_won)
        won.visibility = View.INVISIBLE

        //다음 버튼 가져오기
        var next = findViewById<LinearLayout>(R.id.next)
        next.visibility = View.INVISIBLE

        next.setOnClickListener {
            val pageEvent = Intent(this, send::class.java)
            startActivity(pageEvent)
        }

        //1 눌렀을 때
        num_1.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "1"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "1"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //2 눌렀을 때
        num_2.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "2"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "2"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //3 눌렀을 때
        num_3.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "3"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "3"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //4 눌렀을 때
        num_4.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "4"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "4"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //5 눌렀을 때
        num_5.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "5"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "5"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //6 눌렀을 때
        num_6.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "6"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "6"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //7 눌렀을 때
        num_7.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "7"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "7"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //8 눌렀을 때
        num_8.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "8"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "8"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //9 눌렀을 때
        num_9.setOnClickListener {
            val numtextstr = num.text.toString()

            if (numtextstr == "얼마나 옮길까요?") {
                val newnumpad = num.text
                val clearnum = newnumpad.dropLast(10)
                num.text = clearnum
                left.visibility = View.INVISIBLE
                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.white))
                // 숫자 추가
                num.text = num.text.toString() + "9"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }else{
                // 숫자 추가
                num.text = num.text.toString() + "9"

                //원 보이게
                won.visibility = View.VISIBLE

                //다음 버튼 보이게
                next.visibility = View.VISIBLE

                // 천 단위 콤마 포맷팅
                val cheon = num.text.toString().replace(",", "")
                val formatted = String.format("%,d", cheon.toInt())
                num.text = formatted
            }

        }

        //0 눌렀을 때
        num_0.setOnClickListener {
            var numText = num.text.toString()

            if (numText == "얼마나 옮길까요?") {

            } else {
                if (num.length() == 0) {

                } else {
                    // 숫자 추가
                    num.text = num.text.toString() + "0"

                    //원 보이게
                    won.visibility = View.VISIBLE

                    // 천 단위 콤마 포맷팅
                    val cheon = num.text.toString().replace(",", "")
                    val formatted = String.format("%,d", cheon.toInt())
                    num.text = formatted
                }
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        //00 눌렀을 때
        num_00.setOnClickListener {
            var numText = num.text.toString()

            if (numText == "얼마나 옮길까요?") {

            } else {
                if (num.length() == 0) {

                } else {
                    // 숫자 추가
                    num.text = num.text.toString() + "00"

                    //원 보이게
                    won.visibility = View.VISIBLE

                    // 천 단위 콤마 포맷팅
                    val cheon = num.text.toString().replace(",", "")
                    val formatted = String.format("%,d", cheon.toInt())
                    num.text = formatted
                }
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        //지우기 눌렀을 때
        num_clear.setOnClickListener{
            val newnumpad = num.text
            val clearnum = newnumpad.dropLast(1)
            num.text = clearnum

            if (num.text.length == 0){
                //원 안 보이게
                won.visibility = View.INVISIBLE

                //다음 버튼 안 보이게
                next.visibility = View.INVISIBLE

                //잔액 보이게
                left.visibility = View.VISIBLE

                num.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.gray20))
                num.text = "얼마나 옮길까요?"
            }
        }


    }
}