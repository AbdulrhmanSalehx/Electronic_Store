package com.world.elctronicstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.world.elctronicstore.KotlinCode.Mobile

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_add=findViewById<Button>(R.id.Btn_addmobile)
        btn_add.setOnClickListener {
            startActivity(Intent(this,EntryActivity::class.java))
        }
        findViewById<Button>(R.id.Btn_ShowMobile).setOnClickListener {
            startActivity(Intent(this,DataShow::class.java))
        }
        findViewById<Button>(R.id.Btn_ShowBrowser).setOnClickListener {
            startActivity(Intent(this,BrowserActivity::class.java))
        }
        findViewById<Button>(R.id.Btn_Count).setOnClickListener {
            startActivity(Intent(this,CounterActivity::class.java))
        }
    }
    companion object{
        var mboList=listOf<Mobile>()
    }
}