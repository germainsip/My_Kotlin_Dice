package org.afpa.mykotlinapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = roll_button
        val textToChange: TextView = text_to_change
        val addOne: Button = plus_un
        addOne.setOnClickListener { augmente() }
        rollButton.setOnClickListener { rollDice() }

    }

    private fun augmente() {

        var lastRoll = text_to_change.text.toString().toIntOrNull()

        if (lastRoll != null && lastRoll < 6) text_to_change.text = (lastRoll + 1).toString()

    }

    private fun rollDice() {
        Toast.makeText(this, "bouton cliqué", Toast.LENGTH_SHORT).show()
        text_to_change.setTextColor(Color.MAGENTA)
        //text_to_change.text = "Dice Rolled"
        val randomInt = (1..6).random()
        text_to_change.text = randomInt.toString()

    }


}