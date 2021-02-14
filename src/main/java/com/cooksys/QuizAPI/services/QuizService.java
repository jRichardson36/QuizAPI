package com.cooksys.QuizAPI.services;

import com.cooksys.QuizAPI.model.request.QuizRequestDto;
import com.cooksys.QuizAPI.model.response.QuizResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuizService {




    List<QuizResponseDto> getAllQuizes();



    QuizResponseDto createQuiz(QuizRequestDto quizRequestDto);
}





