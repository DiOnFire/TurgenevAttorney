package me.dion.turgenevattorney.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import me.dion.turgenevattorney.R
import me.dion.turgenevattorney.management.ScoreManager

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val charaText = findViewById<TextView>(R.id.charaText)
        val exitButton = findViewById<Button>(R.id.exitButton)

        exitButton.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }

        val scoreManager: ScoreManager = intent.getSerializableExtra("score_manager") as ScoreManager

        charaText.text = scoreManager.getMaximumCharacter().name
    }
}