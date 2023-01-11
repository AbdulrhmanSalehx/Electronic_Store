package com.world.elctronicstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataShow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_show)

                with(findViewById<TextView>(R.id.tv_mobilesList)) {
            for (mob in MainActivity.mboList)
                text = text.toString()
                    .plus("\n Mobile OS = ${mob.os}, serial = ${mob.seriaNum}, cell number = ${mob.celNumber}, DC = ${mob.dc}, Manufacturer = ${mob.manufacturer?.name}, Owner = ${mob.owner.name},  Screen Size= ${mob.screenSize}")
        }
    }
}