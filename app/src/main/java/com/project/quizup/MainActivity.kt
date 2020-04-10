package com.project.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //button variables
    private lateinit var addQuestionsButton: Button
    private lateinit var notesButton: Button
    private lateinit var flashcardsButton: Button
    private lateinit var quizButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //assign buttons
        addQuestionsButton = findViewById(R.id.quiz_button)
        notesButton = findViewById(R.id.notes_button)
        flashcardsButton = findViewById(R.id.flashcard_button)
        quizButton = findViewById(R.id.take_quiz_button)

        //add questions button is pressed, go to that page
        addQuestionsButton.setOnClickListener{
            val intent = Intent(this, AddQuestions::class.java)
            startActivity(intent)
        }
        //flashcards button to flashcards page
        flashcardsButton.setOnClickListener{
            val intent = Intent(this, Flashcards::class.java)
            startActivity(intent)
        }
        //add note button to notes page
        notesButton.setOnClickListener{
            val intent = Intent(this, AddNote::class.java)
            startActivity(intent)
        }
        //quiz button to quiz page
        quizButton.setOnClickListener{
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)
        }
    }
}
