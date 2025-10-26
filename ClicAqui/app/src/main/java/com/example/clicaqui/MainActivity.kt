package com.example.clicaqui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val textMessage = findViewById<TextView>(R.id.text_message)
        val buttonClick = findViewById<Button>(R.id.button_click)

        buttonClick.setOnClickListener {
            textMessage.text = "Você clicou no botão!"
        }
    }
}
