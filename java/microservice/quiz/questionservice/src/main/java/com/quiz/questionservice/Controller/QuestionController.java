package com.quiz.questionservice.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.quiz.questionservice.Entity.Question;
import com.quiz.questionservice.Service.QuestionService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // create a new Question
    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> allQuestion() {
        return questionService.allQuestion();
    }

    @GetMapping("/{id}")
    public Question questionByid(@PathVariable Long id) {
        return questionService.questionByid(id);
    }

    // get all question of specific quiz
    @GetMapping("/quiz/{quizid}")
    public List<Question> getQuestionOfquiz(@PathVariable Long quizid) {
        return questionService.getQuestionofQuiz(quizid);
    }
}
