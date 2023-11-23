package com.gopal.quizService.services;

import com.gopal.quizService.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8081", value ="Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionQuiz(@PathVariable("id") Integer id);
}
