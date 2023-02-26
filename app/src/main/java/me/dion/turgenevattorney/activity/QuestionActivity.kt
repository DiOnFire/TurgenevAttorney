package me.dion.turgenevattorney.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import me.dion.turgenevattorney.R
import me.dion.turgenevattorney.character.CharacterManager
import me.dion.turgenevattorney.management.QuestionManager
import me.dion.turgenevattorney.management.ScoreManager

class QuestionActivity : AppCompatActivity() {
    private lateinit var questionManager: QuestionManager
    private lateinit var scoreManager: ScoreManager
    private lateinit var characterManager: CharacterManager

    private val questionText = findViewById<TextView>(R.id.question_text)
    private val firstVariant = findViewById<RadioButton>(R.id.firstVariant)
    private val secondVariant = findViewById<RadioButton>(R.id.secondVariant)
    private val thirdVariant = findViewById<RadioButton>(R.id.thirdVariant)
    private val fourthVariant = findViewById<RadioButton>(R.id.fourthVariant)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        questionManager = intent.getSerializableExtra("question_manager") as QuestionManager
        scoreManager = intent.getSerializableExtra("score_manager") as ScoreManager
        characterManager = intent.getSerializableExtra("character_manager") as CharacterManager
    }
}