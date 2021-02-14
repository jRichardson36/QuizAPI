package com.cooksys.QuizAPI.services;

import com.cooksys.QuizAPI.model.request.QuestionRequestDto;
import com.cooksys.QuizAPI.model.response.QuestionResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {

    List<QuestionResponseDto> getAllQuestions();



    QuestionResponseDto createQuestion(QuestionRequestDto questionRequestDto);
}
