package com.gopal.quizService.controller.impl;

import com.gopal.quizService.controller.QuizController;
import com.gopal.quizService.model.Quiz;
import com.gopal.quizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizControllerImpl implements QuizController {
    @Autowired
    QuizService service;
    @GetMapping("/")
    @Override
    public List<Quiz> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Quiz getQuizById(@PathVariable("id") Integer id) {
        return service.getQuizById(id);
    }

    @Override
    @PostMapping("/")
    public Quiz save(@RequestBody Quiz quiz) {

        return service.save(quiz);
    }
}
