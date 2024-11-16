package com.quiz.questionservice.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.questionservice.Entity.Question;
import com.quiz.questionservice.Repository.QuestionRepository;
import com.quiz.questionservice.Service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Override
    public List<Question> getQuestionofQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> allQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question questionByid(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Could not find"));
    }

}
