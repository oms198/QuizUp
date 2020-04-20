package com.project.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.Toolbar


//need to connect with database to enable the functionalities
class AddNote : AppCompatActivity() {

    private lateinit var homeButton: Button
    //private lateinit var toolbar: Toolbar
    //private lateinit var noteTitle: EditText
    //private lateinit var noteDetails: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        //toolbar = findViewById(R.id.toolbar)
        //setSupportActionBar(toolbar)

        //noteTitle = findViewById(R.id.noteTitle)
        //noteDetails = findViewById(R.id.noteDetails)

        homeButton = findViewById(R.id.home_button)
        homeButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
