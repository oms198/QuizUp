package com.project.quizup

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.project.quizup.database.QuestionDatabase
import java.lang.IllegalStateException

private const val DATABASE_NAME = "question_database"

class QuestionRepository private constructor(context: Context){

    private val database: QuestionDatabase = Room.databaseBuilder(
        context.applicationContext,
        QuestionDatabase::class.java,
        DATABASE_NAME
    ).build()

    private val questionDao = database.questionDao()

    fun getAll(): LiveData<List<Question>> = questionDao.getAll()

    companion object {
        private var INSTANCE: QuestionRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = QuestionRepository(context)
            }
        }
        fun get(): QuestionRepository {
            return INSTANCE?:
                    throw IllegalStateException("Question Repository must be initialized.")
        }
    }
}
