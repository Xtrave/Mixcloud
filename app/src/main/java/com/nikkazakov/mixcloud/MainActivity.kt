package com.nikkazakov.mixcloud

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        rollButton.setOnClickListener {
            rollDice()
            var randomInt = (1..6).random()
            resultText.text = randomInt.toString()
        }

        val CountUpButton: Button = findViewById(R.id.CountUp_button)
        CountUpButton.setOnClickListener{
            rollDice()
            if((resultText.text == "1") or (resultText.text == "2") or (resultText.text == "3") or (resultText.text == "4") or (resultText.text == "5"))
                resultText.text = (resultText.text.toString().toInt()+1).toString()
            if(resultText.text == "Hello World!")
                resultText.text = "1"
            if(resultText.text == "6")
                resultText.text = "6"
        }

        val ResetButton: Button = findViewById(R.id.reset_button)
        ResetButton.setOnClickListener{
            rollDice()
            resultText.text = "0"
        }

    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()
    }



}