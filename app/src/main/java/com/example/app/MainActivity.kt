package com.example.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.app.data.model.Message
import com.squareup.moshi.Moshi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json = """{ "type": "success", "value": "Yay" }"""
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Message::class.java)
        val message = adapter.fromJson(json)

        findViewById<TextView>(R.id.animal).text = message.toString()
    }
}