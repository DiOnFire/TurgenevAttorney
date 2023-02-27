package me.dion.turgenevattorney.management

import me.dion.turgenevattorney.character.Character
import me.dion.turgenevattorney.character.CharacterManager
import me.dion.turgenevattorney.exception.CharacterNotInitializedException
import java.io.Serializable

class ScoreManager(characterManager: CharacterManager) : Serializable {
    private val storage: HashMap<Character, Int> = hashMapOf(
        Pair(characterManager.ARKADIJ, 0),
        Pair(characterManager.BAZAROV, 0),
        Pair(characterManager.NIKOLAY_PETROVICH, 0),
        Pair(characterManager.PAVEL_PETROVICH, 0)
    )

    fun characterIncrement(character: Character) {
        val count: Int = storage[character] ?: throw CharacterNotInitializedException()
        storage[character] = count + 1
    }

    fun getMaximumCharacter(): Character {
        return storage.maxBy { entry -> entry.value }.key
    }
}