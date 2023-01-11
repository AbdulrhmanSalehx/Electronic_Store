package com.world.elctronicstore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.world.elctronicstore.KotlinCode.Customer
import com.world.elctronicstore.KotlinCode.Manufacturer
import com.world.elctronicstore.KotlinCode.Mobile
import com.world.elctronicstore.KotlinCode.OperatingSystem
import java.time.LocalDate


class EntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        var serailnum=findViewById<EditText>(R.id.seriaedit)
        var manuf=findViewById<EditText>(R.id.manufedit)
        var custo=findViewById<EditText>(R.id.owneredit)
        var dc=findViewById<EditText>(R.id.dcedit)
        var cell=findViewById<EditText>(R.id.celledit)

        findViewById<Button>(R.id.Btn_Save).setOnClickListener {
            MainActivity.mboList += Mobile(serailnum.text.toString(),dc.text.toString().toDouble(),
                Manufacturer((0..100).random(),manuf.text.toString(),"Global"), LocalDate.now(),
                Customer((0..100).random(),custo.text.toString(),"Palestine","Ramallah"),15.0,OperatingSystem.Andoriod,
                "17'",cell.text.toString())
        }
        findViewById<Button>(R.id.Btn_Back).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}