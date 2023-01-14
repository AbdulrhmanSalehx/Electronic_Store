package com.world.elctronicstore

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
            /* Check if ANY Label is Empty (better use isBlank() to avoid spaces strings but it give error) */
            if(TextUtils.isEmpty(custo.text.toString())) {
                custo.setError("can't be Empty")
                return@setOnClickListener
            }else if(TextUtils.isEmpty(manuf.text.toString())) {
                manuf.setError("can't be Empty")
                return@setOnClickListener
            }else if(TextUtils.isEmpty(serailnum.text.toString())) {
                serailnum.setError("can't be Empty")
                return@setOnClickListener
            } else if(TextUtils.isEmpty(dc.text.toString())) {
               dc.setError("can't be Empty")
                return@setOnClickListener
            }else if(TextUtils.isEmpty(cell.text.toString())) {
                cell.setError("can't be Empty")
                return@setOnClickListener
            }else {
                /* Insert All Element to the mbolist from MainActivity*/
                MainActivity.mboList += Mobile(
                    serailnum.text.toString(),
                    dc.text.toString().toDouble(),
                    Manufacturer((0..100).random(), manuf.text.toString(), "Global"),
                    LocalDate.now(),
                    Customer((0..100).random(), custo.text.toString(), "Palestine", "Ramallah"),
                    15.0,
                    OperatingSystem.Andoriod,
                    "17'",
                    cell.text.toString()
                )
                custo.text.clear()
                manuf.text.clear()
                serailnum.text.clear()
                dc.text.clear()
                cell.text.clear()
            }

        }
        findViewById<Button>(R.id.Btn_Back).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}