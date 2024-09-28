package com.example.ocr_test

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class TextDisplayActivity : AppCompatActivity() {
    private lateinit var recognizedTextView: TextView
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_display)

        recognizedTextView = findViewById(R.id.textView2)
        backButton = findViewById(R.id.backButton)

        val recognizedText = intent.getStringExtra("recognizedText")
        recognizedTextView.text = recognizedText ?: "No text recognized"

        backButton.setOnClickListener {
            finish()
        }
    }
}