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
        Question(
            "Представь, что наступило наконец-то лето! Каникулы! С чем у тебя это прекрасное время ассоциируется?",
            arrayListOf(
                Variant(
                    "Вставать рано рано, встречая солнце, гулять по мокрой от росы и прохладной траве, вдыхая ароматы цветов...",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Зной, комары, да мухи!",
                    characters.PAVEL_PETROVICH
                ),
                Variant("У лета есть и плюсы, и минусы, как, впрочем, и у всего остального.",
                    characters.BAZAROV
                ),
                Variant(
                    "Можно хорошо и спокойно отдохнуть, больше времени уделяя себе и своим делам.",
                    characters.ARKADIJ
                )
            )
        ),
        Question(
            "Представь, что ты нашёл на улице маленького, миленького, несчастного котеночка! Что ты сделаешь?",
            arrayListOf(
                Variant(
                    "Ach, wie s! Возьму его конечно, мама хоть и рассердится, но он кому угодно понравится!",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Возьму кошака к себе, может знакомым потом подарю.",
                    characters.PAVEL_PETROVICH
                ),
                Variant(
                    "Вдруг у меня аллергия на кошек?",
                    characters.BAZAROV
                ),
                Variant(
                    "Вообще-то животных с улицы не берут, потому что у них могут быть и блохи, и т.п...",
                    characters.ARKADIJ
                )
            )
        ),
        Question(
            "Ты купил лимонад и, оказалось, что выиграл путевку в Египет на двоих! Кого ты возьмешь с собой?",
            arrayListOf(
                Variant(
                    "Может быть одноклассника какого-нибудь... Будем в дороге в карты играть.",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Может отдам родителям путевку: их порадую и из дома сплавлю!",
                    characters.PAVEL_PETROVICH
                ),
                Variant(
                    "Не знаю, но чтоб с этим человеком было о чем поговорить.",
                    characters.BAZAROV
                ),
                Variant(
                    "Может быть кого-то из родителей, или брата/сестру, а может быть кого-то из друзей; лишь бы мозги не кипели, я уже настроился на отдых!",
                    characters.ARKADIJ
                )
            )
        ),
        Question(
            "Какой герой произведения тебе больше всех нравится?",
            arrayListOf(
                Variant(
                    "Николай Петрович",
                    characters.NIKOLAY_PETROVICH
                ),
                Variant(
                    "Павел Петрович",
                    characters.PAVEL_PETROVICH
                ),
                Variant(
                    "Базаров",
                    characters.BAZAROV
                ),
                Variant(
                    "Аркадий",
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

    fun isLast(): Boolean {
        return currentIndex == questions.size - 1
    }

    fun getCurrentQuestion(): Question {
        return questions[currentIndex]
    }
}