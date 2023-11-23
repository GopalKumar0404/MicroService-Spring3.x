package com.gopal.questionService.services;

import com.gopal.questionService.model.Question;

import java.util.List;


public interface QuestionService {
    List<Question> findAll();
    Question findById(Integer id);
    Question save(Question question);
    List<Question> findAllQuizById(Integer id);
}
