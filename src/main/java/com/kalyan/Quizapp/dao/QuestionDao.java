package com.kalyan.Quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalyan.Quizapp.Model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
