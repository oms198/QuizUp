package com.project.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.quizup.database.QuestionDao

class AddQuestions : AppCompatActivity() {

    private lateinit var homeButton: Button
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_questions)

        homeButton = findViewById(R.id.home_button)
        addButton = findViewById(R.id.add_button)

        homeButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
//        addButton.setOnClickListener{
//            QuestionRepository.
//        }
    }
}
