package com.dhruv.quiz

data class Question(
    val question: String,
    val flagImg : Int,
    val option1 : String,
    val option2 : String,
    val option3 : String,
    val option4 : String,
    val correctAns: Int
)