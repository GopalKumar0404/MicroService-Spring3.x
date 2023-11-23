package com.gopal.quizService.controller;

import com.gopal.quizService.model.Quiz;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface QuizController {


    List<Quiz> findAll();

    Quiz getQuizById(@PathVariable("id") Integer Id);

    Quiz save(@RequestBody Quiz quiz);
}
