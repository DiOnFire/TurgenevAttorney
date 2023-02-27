package me.dion.turgenevattorney.quiz

data class Question(
    val text: String,
    val variants: ArrayList<Variant>
) : java.io.Serializable
