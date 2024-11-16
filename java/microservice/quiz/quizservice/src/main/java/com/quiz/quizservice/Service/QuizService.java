package com.quiz.quizservice.Service;

import java.util.List;

import com.quiz.quizservice.Entities.Quiz;

public interface QuizService {

    Quiz addQuiz(Quiz quiz);

    List<Quiz> getAllQuiz();

    Quiz getQuizByid(Long id);

}
