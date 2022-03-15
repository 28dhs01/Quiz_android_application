package com.dhruv.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name : EditText = findViewById(R.id.etName)
        val btn : Button = findViewById(R.id.btnStart)
        btn.setOnClickListener {
            if( name.text.isEmpty() ) {
                Toast.makeText(this, "please enter your name to start the game", Toast.LENGTH_LONG)
                    .show()
            }else{
                val intent:Intent = Intent(this,DisplayQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,name.text.toString())
                startActivity(intent)
            }
        }
    }
}