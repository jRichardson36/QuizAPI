package com.cooksys.QuizAPI.services.impl;

import com.cooksys.QuizAPI.entities.Question;
import com.cooksys.QuizAPI.model.request.QuestionRequestDto;
import com.cooksys.QuizAPI.model.response.QuestionResponseDto;
import com.cooksys.QuizAPI.repositories.QuestionRepository;
import com.cooksys.QuizAPI.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor

public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    @Override
    public List<QuestionResponseDto> getAllQuestions() {
        List<QuestionResponseDto> result = new ArrayList<QuestionResponseDto>();
        for (Question question : questionRepository.findAll()) {
            result.add(new QuestionResponseDto(question.getText_field(), question.getAnswers()));

        }
        return result;


    }

    @Override
    public QuestionResponseDto createQuestion(QuestionRequestDto questionRequestDto) {
        Question questionToSave = new Question();
        questionToSave.setText_field(questionRequestDto.getText_field());
        Question savedQuestion = questionRepository.saveAndFlush(questionToSave);
        QuestionResponseDto result = new QuestionResponseDto();
        result.setText_field(savedQuestion.getText_field());
        return result;
    }
}
