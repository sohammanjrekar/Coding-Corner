package com.quiz.questionservice.Service;

import java.util.List;

import com.quiz.questionservice.Entity.Question;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> allQuestion();

    Question questionByid(Long id);

    List<Question> getQuestionofQuiz(Long quizId);
}
