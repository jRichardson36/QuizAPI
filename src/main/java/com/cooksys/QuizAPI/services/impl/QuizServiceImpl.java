package com.cooksys.QuizAPI.services.impl;

import com.cooksys.QuizAPI.entities.Quiz;
import com.cooksys.QuizAPI.model.request.QuizRequestDto;
import com.cooksys.QuizAPI.model.response.QuizResponseDto;
import com.cooksys.QuizAPI.repositories.QuizRepository;
import com.cooksys.QuizAPI.services.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor


public class QuizServiceImpl implements QuizService{

    private QuizRepository quizRepository;


    @Override
    public List<QuizResponseDto> getAllQuizes() {
        List<QuizResponseDto> result = new ArrayList<QuizResponseDto>();
        for(Quiz quiz : quizRepository.findAll()){
            result.add(new QuizResponseDto(quiz.getName(), quiz.getQuestions()));
        }
        return result;
    }




    @Override
    public QuizResponseDto createQuiz(QuizRequestDto quizRequestDto) {
        Quiz quizToSave = new Quiz();
        quizToSave.setName(quizRequestDto.getName());
        Quiz savedQuiz = quizRepository.saveAndFlush(quizToSave);
        QuizResponseDto result = new QuizResponseDto();
        result.setName(savedQuiz.getName());
        return result;
    }
}
