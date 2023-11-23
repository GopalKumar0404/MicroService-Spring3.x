package com.gopal.questionService.controllers.impl;

import com.gopal.questionService.model.Question;
import com.gopal.questionService.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionControllerImpl {
    @Autowired
    QuestionService service;

    @GetMapping("/")
    public List<Question> findAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Question findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Question> findAllQuizById(@PathVariable("id") Integer id) {
        return service.findAllQuizById(id);
    }


    @PostMapping("/")
    public Question save(@RequestBody Question question) {
        System.out.println(question + " Hi questions");
        return service.save(question);
    }

    @GetMapping("/dummy")
    public String getDummy() {
        return "Dummy";
    }
}
