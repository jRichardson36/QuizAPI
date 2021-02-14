package com.cooksys.QuizAPI.controllers;

import com.cooksys.QuizAPI.model.request.QuestionRequestDto;
import com.cooksys.QuizAPI.model.response.QuestionResponseDto;
import com.cooksys.QuizAPI.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
@AllArgsConstructor
public class QuestionController {
    private QuestionService questionService;

    @GetMapping
    public List<QuestionResponseDto> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @PostMapping
    public QuestionResponseDto createQuestion(@RequestBody QuestionRequestDto questionRequestDto){
        return questionService.createQuestion(questionRequestDto);
    }
}
