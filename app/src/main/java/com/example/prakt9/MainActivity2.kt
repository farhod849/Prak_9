package com.example.prakt9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            randnumber()
        }
    }
    fun randnumber(){
        val random: Int = Random.nextInt(0,1000)
        val randomInt: Int = Random.nextInt(0,random)
        val textviewRandom: TextView = findViewById(R.id.textView2)
        val textviewLabel: TextView = findViewById(R.id.textView_label)
        textviewRandom.text = randomInt.toString()
        textviewLabel.text = getString(R.string.random_heading, random)
    }
}