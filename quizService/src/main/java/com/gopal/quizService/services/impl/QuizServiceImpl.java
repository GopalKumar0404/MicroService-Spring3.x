package com.gopal.quizService.services.impl;

import com.gopal.quizService.model.Quiz;
import com.gopal.quizService.repository.QuizRepository;
import com.gopal.quizService.services.QuestionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements com.gopal.quizService.services.QuizService {
    @Autowired
    QuizRepository repo;
    @Autowired
    QuestionClient questionFeignClient;
    @Override
    public List<Quiz> findAll() {
        List<Quiz> quizzes = repo.findAll();
        List<Quiz> allQuizess= quizzes.stream().map(quiz -> {
            quiz.setQuestion(questionFeignClient.getQuestionQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return allQuizess ;
    }

    @Override
    public Quiz getQuizById(Integer id) {
        Quiz quiz = repo.findById(id).orElseGet(null);
        quiz.setQuestion(questionFeignClient.getQuestionQuiz(quiz.getId()));
        return quiz;
    }

    @Override
    public Quiz save(Quiz quiz) {
        return repo.save(quiz);
    }
}
