package me.dion.turgenevattorney.management

import me.dion.turgenevattorney.character.CharacterManager
import me.dion.turgenevattorney.quiz.Question
import me.dion.turgenevattorney.quiz.Variant
import java.io.Serializable

class QuestionManager(characters: CharacterManager) : Serializable {
    private val questions: List<Question> = listOf(
        Question(
            "Представь, что ты в чем-то ас. Представил? Ну а кто-то, кто в деле сем ничего вовсе не смыслит, начинает спорить и пытаться тебе что-то втолковать, причем какую-то ерунду. Как ты себя поведешь?",
            arrayListOf(
                Variant(
                    "Постараюсь все решить мирным способом",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Начну спорить и обьяснять этому типу,что он не прав, нельзя же оставить человека в неведении!",
                    characters.PAVEL_PETROVICH
                ),
                Variant(
                    "Зачем многословие? Я лишь парой фраз дам чуваку понять, что лучше уж ему помолчать.",
                    characters.BAZAROV
                ),
                Variant(
                    "Промолчу, пусть дальше городит ерунду, я все-равно в сто раз больше этого типа знаю.",
                    characters.ARKADIJ
                )
            )
        ),
        Question(
            "Итак, представь, что ты слушаешь на плеере музыку, и вдруг он вырубается - и с концами! Твоя реакция:",
            arrayListOf(
                Variant(
                    "Ну вот, жаль iPod, ну ничего, может теперь что-то новое подарят?..",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Постучу плеером об стол, а потом об стену - иногда это помогает!",
                    characters.PAVEL_PETROVICH
                ),
                Variant(
                    "Достану отвертку, подручные материалы - ну как-то же надо iPod подчинить.",
                    characters.BAZAROV
                ),
                Variant(
                    "Понесу в салон, чтоб исправили.",
                    characters.ARKADIJ
                )
            )
        ),
        Question(
            "Итак, стоишь ты на вокзале перед кассой в гигантской очереди, и вдруг тот кто-то лезет впереди тебя! Как ты поступишь?",
            arrayListOf(
                Variant(
                    "Боже мой, мне так будет обидно, а люди вокруг точно слепые. Могли бы и вмешаться!",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Ну все,будет скандал! Я начну на весь вокзал выяснять, чего это он без очереди идет?!",
                    characters.PAVEL_PETROVICH
                ),
                Variant(
                    "Постараюсь поговорить с ним вежливо, но если это не поможет, перейду к другой кассе. Плевать что там очередь еще больше - оскорбления я терпеть не собираюсь!",
                    characters.BAZAROV
                ),
                Variant(
                    "Человек, похоже, русского языка не понимает, ну и ладно, пусть стоит впереди, раз ему так приспичило.",
                    characters.ARKADIJ
                )
            )
        ),
    )
    private var currentIndex = 0

    fun nextQuestion() {
        if (questions.size == currentIndex + 1) {
            return
        }
        currentIndex++
    }

    fun getCurrentQuestion(): Question {
        return questions[currentIndex]
    }
}