package com.world.elctronicstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        val countr=findViewById<TextView>(R.id.count)
        var e:Int
        findViewById<Button>(R.id.Btn_plus).setOnClickListener {
           e= Integer.parseInt(countr.text.toString())+1
          countr.setText(e.toString())
        }
    }
}