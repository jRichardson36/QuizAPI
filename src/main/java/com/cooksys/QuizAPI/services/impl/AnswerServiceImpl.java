package com.cooksys.QuizAPI.services.impl;

import com.cooksys.QuizAPI.entities.Answer;
import com.cooksys.QuizAPI.model.request.AnswerRequestDto;
import com.cooksys.QuizAPI.model.response.AnswerResponseDto;
import com.cooksys.QuizAPI.repositories.AnswerRepository;
import com.cooksys.QuizAPI.services.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor

public class AnswerServiceImpl implements AnswerService {
    private AnswerRepository answerRepository;

    @Override
    public List<AnswerResponseDto> getAllAnswers() {
        List<AnswerResponseDto> result = new ArrayList<AnswerResponseDto>();
        for (Answer answer: answerRepository.findAll()){
            result.add(new AnswerResponseDto(answer.getText_field()));
        }
        return result;
    }



    @Override
    public AnswerResponseDto createAnswer(AnswerRequestDto answerRequestDto) {
        Answer answerToSave = new Answer();
        answerToSave.setText_field(answerRequestDto.getText_field());
        Answer savedAnswer = answerRepository.saveAndFlush(answerToSave);
        AnswerResponseDto result = new AnswerResponseDto();
        result.setText_field(savedAnswer.getText_field());

        return result;
    }




}
