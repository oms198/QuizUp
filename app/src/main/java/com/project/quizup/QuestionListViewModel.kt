package com.project.quizup

import androidx.lifecycle.ViewModel

class QuestionListViewModel:ViewModel() {
    private val questionRepository = QuestionRepository.get()

    val questionListLiveData = questionRepository.getAll()
}