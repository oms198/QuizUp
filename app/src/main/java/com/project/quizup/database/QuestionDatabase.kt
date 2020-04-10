package com.project.quizup.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Class::class], version = 1)
@TypeConverters(QuestionTypeConverter::class)
abstract class QuestionDatabase : RoomDatabase() {
    abstract fun QuestionDao(): QuestionDao
}