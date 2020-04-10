package com.project.quizup
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Question (@PrimaryKey val id:UUID=UUID.randomUUID(),
                     @ColumnInfo(name = "question_text") val questionText:String = "",
                     @ColumnInfo(name = "answer") val answer: String = "")