package com.quiz.quizservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.quizservice.Entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
