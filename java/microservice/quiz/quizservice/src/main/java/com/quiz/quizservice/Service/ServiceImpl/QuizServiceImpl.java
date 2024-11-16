package com.quiz.quizservice.Service.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.stat.QueryStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizservice.Entities.Question;
import com.quiz.quizservice.Entities.Quiz;
import com.quiz.quizservice.Repository.QuizRepository;
import com.quiz.quizservice.Service.QuestionClient;
import com.quiz.quizservice.Service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizzes = quizRepository.findAll();
        List<Quiz> newquiz = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return newquiz;
    }

    @Override
    public Quiz getQuizByid(Long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("quiz not found"));

        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }

}
