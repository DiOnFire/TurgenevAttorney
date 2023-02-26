package me.dion.turgenevattorney.management

import me.dion.turgenevattorney.character.Character
import me.dion.turgenevattorney.exception.CharacterNotInitializedException

class ScoreManager {
    private val storage: HashMap<Character, Int> = hashMapOf()

    fun characterIncrement(character: Character) {
        val count: Int = storage[character] ?: throw CharacterNotInitializedException()
        storage[character] = count + 1
    }
}