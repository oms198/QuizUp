package com.project.quizup
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class question (@PrimaryKey val id:UUID=UUID.randomUUID(),
    var questionText:String = "",
    var answer: String = ""){
}