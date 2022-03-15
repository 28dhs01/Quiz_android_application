package com.dhruv.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvUserName: TextView = findViewById(R.id.tvUserName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinishGame : Button = findViewById(R.id.btnFinishGame)

        tvUserName.text = intent.getStringExtra(Constants.USER_NAME)
        val score : Int = intent.getIntExtra(Constants.CORRECT_QUESTIONS,0)
        val totalQues : Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS,10)
        tvScore.text = "You scored $score out of $totalQues"

        btnFinishGame.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}