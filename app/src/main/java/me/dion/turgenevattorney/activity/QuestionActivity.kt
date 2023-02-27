package me.dion.turgenevattorney.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import me.dion.turgenevattorney.R
import me.dion.turgenevattorney.character.CharacterManager
import me.dion.turgenevattorney.management.QuestionManager
import me.dion.turgenevattorney.management.ScoreManager

class QuestionActivity : AppCompatActivity() {
    private lateinit var questionManager: QuestionManager
    private lateinit var scoreManager: ScoreManager
    private lateinit var characterManager: CharacterManager

    private lateinit var questionText: TextView
    private lateinit var firstVariant: RadioButton
    private lateinit var secondVariant: RadioButton
    private lateinit var thirdVariant: RadioButton
    private lateinit var fourthVariant: RadioButton
    private lateinit var radioGroup: RadioGroup
    private lateinit var answerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        questionManager = intent.getSerializableExtra("question_manager") as QuestionManager
        scoreManager = intent.getSerializableExtra("score_manager") as ScoreManager
        characterManager = intent.getSerializableExtra("character_manager") as CharacterManager

        questionText = findViewById(R.id.question_text)
        firstVariant = findViewById(R.id.firstVariant)
        secondVariant = findViewById(R.id.secondVariant)
        thirdVariant = findViewById(R.id.thirdVariant)
        fourthVariant = findViewById(R.id.fourthVariant)
        radioGroup = findViewById(R.id.radioGroup)
        answerButton = findViewById(R.id.answerButton)

        questionText.text = questionManager.getCurrentQuestion().text
        generateVariants()

        answerButton.setOnClickListener {
            select()
        }
    }

    private fun select() {
        val id = radioGroup.checkedRadioButtonId
        val question = questionManager.getCurrentQuestion()
        when (id) {
            R.id.firstVariant -> {
                scoreManager.characterIncrement(question.variants[0].character)
                moveToNext()
            }
            R.id.secondVariant -> {
                scoreManager.characterIncrement(question.variants[1].character)
                moveToNext()
            }
            R.id.thirdVariant -> {
                scoreManager.characterIncrement(question.variants[2].character)
                moveToNext()
            }
            R.id.fourthVariant -> {
                scoreManager.characterIncrement(question.variants[3].character)
                moveToNext()
            }
            else -> Toast.makeText(this, "Выберите вариант", Toast.LENGTH_SHORT).show()
        }
    }

    private fun moveToNext() {
        questionManager.nextQuestion()
        if (questionManager.isLast()) {
            val intent = Intent(
                this,
                ScoreActivity::class.java
            )
            intent.putExtra("score_manager", scoreManager)
            startActivity(intent)
        } else {
            val intent = Intent(intent)
            startActivity(intent)
        }
    }

    private fun generateVariants() {
        val question = questionManager.getCurrentQuestion()
        firstVariant.text = question.variants[0].text
        secondVariant.text = question.variants[1].text
        thirdVariant.text = question.variants[2].text
        fourthVariant.text = question.variants[3].text
    }
}