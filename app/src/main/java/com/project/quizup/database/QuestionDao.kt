package com.project.quizup.database

import androidx.room.Dao
import androidx.room.Query
import com.project.quizup.question

@Dao
interface QuestionDao {
    @Query("SELECT * FROM question")
    fun getQuestion(): List<question>
}