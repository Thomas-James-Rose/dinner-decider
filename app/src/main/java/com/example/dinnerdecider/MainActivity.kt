package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodChoices = arrayListOf("Pizza", "Chinese", "Burgers")

        selectFoodButton.setOnClickListener {
            val randomFoodIndex = Random().nextInt(foodChoices.count())
            selectedFoodText.text = foodChoices[randomFoodIndex]
        }
    }
}
