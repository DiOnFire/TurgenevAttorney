package me.dion.turgenevattorney.quiz

import me.dion.turgenevattorney.character.Character

data class Variant(
    val text: String,
    val character: Character
) : java.io.Serializable
