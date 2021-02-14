package com.cooksys.QuizAPI.services;

import com.cooksys.QuizAPI.model.request.AnswerRequestDto;
import com.cooksys.QuizAPI.model.response.AnswerResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AnswerService {

    List<AnswerResponseDto> getAllAnswers() ;




    AnswerResponseDto createAnswer(AnswerRequestDto answerRequestDto);
}
