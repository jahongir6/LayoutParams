package com.example.layoutparams

import android.app.ActionBar.LayoutParams
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)/*
        setContentView(R.layout.activity_main)*/

        val linearLayout = LinearLayout(this)// linearlayout bolsin layout turimiz deyapman
        linearLayout.orientation = LinearLayout.VERTICAL//va orentatin vertical bolsin
        val layoutParams = LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT) //va boyi va eni match bolsin
        linearLayout.setBackgroundColor(Color.GRAY)//bacroundi gray bolsin deyapman

        val textView =TextView(this)//bu yerda textview classidan obyekt olyapman
        textView.text = "Jahongir qalesan"//bu yerda textga jahongir qalesan deb yozib qoyapman
        textView.setTextSize(20f)//shu size da chiqsiz diyapman
        linearLayout.gravity = Gravity.CENTER//graviti center bolsin deyapman
        linearLayout.addView(textView)//bu yerda linerLayotga  textview ni qoshib qoyyapman
        setContentView(linearLayout,layoutParams)//qanday layoutda chiqishi,va qanday holatda chiqishini ayti qoyyapman

    }
}