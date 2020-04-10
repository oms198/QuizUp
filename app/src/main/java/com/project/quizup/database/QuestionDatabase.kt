package com.project.quizup.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Class::class], version = 1)
abstract class QuestionDatabase : RoomDatabase() {}