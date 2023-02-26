package me.dion.turgenevattorney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.dion.turgenevattorney.character.CharacterManager
import me.dion.turgenevattorney.management.ScoreManager

class MainActivity : AppCompatActivity() {
    private val startButton = findViewById<Button>(R.id.start_button)
    private val characterManager = CharacterManager()
    private val scoreManager = ScoreManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}