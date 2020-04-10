package com.project.quizup.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.project.quizup.Question

@Dao
interface QuestionDao {
    @Query("SELECT * FROM Question")
    fun getAll(): LiveData<List<Question>>
}