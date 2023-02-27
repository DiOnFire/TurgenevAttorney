package me.dion.turgenevattorney.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.dion.turgenevattorney.R
import me.dion.turgenevattorney.character.CharacterManager
import me.dion.turgenevattorney.management.QuestionManager
import me.dion.turgenevattorney.management.ScoreManager

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button

    private val characterManager = CharacterManager()
    private val scoreManager = ScoreManager(characterManager)
    private val questionManager = QuestionManager(characterManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton = findViewById(R.id.start_button)
        startButton.setOnClickListener {
            start()
        }
    }

    private fun start() {
        val intent = Intent(
            this,
            QuestionActivity::class.java
        )
        intent.putExtra("character_manager", characterManager)
        intent.putExtra("score_manager", scoreManager)
        intent.putExtra("question_manager", questionManager)
        startActivity(intent)
    }
}