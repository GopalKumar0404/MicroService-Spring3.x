package com.gopal.questionService.services.impl;

import com.gopal.questionService.model.Question;
import com.gopal.questionService.repositries.QuestionRepository;
import com.gopal.questionService.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository repository;
    @Override
    public List<Question> findAll() {
        return repository.findAll();
    }

    @Override
    public Question findById(Integer id) {
        return repository.findById(id).orElseGet(null);
    }

    @Override
    public Question save(Question question) {
        System.out.println(question);
        System.out.println("Hi");
        return repository.save(question);
    }

    @Override
    public List<Question> findAllQuizById(Integer id) {
        return repository.findByQuizId(id);
    }
}
