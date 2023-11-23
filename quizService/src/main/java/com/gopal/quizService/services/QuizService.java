package com.gopal.quizService.services;

import com.gopal.quizService.model.Quiz;

import java.util.List;


public interface QuizService {

    List<Quiz> findAll();
    Quiz getQuizById(Integer Id);

    Quiz save(Quiz quiz);
}
