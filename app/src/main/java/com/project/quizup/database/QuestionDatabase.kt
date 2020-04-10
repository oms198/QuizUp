package com.project.quizup.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.project.quizup.Question

@Database(entities = [Question::class], version = 1)
@TypeConverters(QuestionTypeConverter::class)
abstract class QuestionDatabase : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
}