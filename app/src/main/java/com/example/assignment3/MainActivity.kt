package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.result)

    }


    fun onButton (view: View){
        if (view is Button){
            val result = resultText.text.toString()
            val buttonText = view.text.toString()
            val resultSum = result + buttonText

            resultText.text = resultSum

    }
        }


}