package com.world.elctronicstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class BrowserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        val url=findViewById<EditText>(R.id.txtSearch)
        findViewById<Button>(R.id.Btn_Search).setOnClickListener {
            findViewById<WebView>(R.id.webviewer).loadUrl(url.text.toString())
        }
    }
}