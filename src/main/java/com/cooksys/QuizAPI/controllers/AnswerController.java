package com.cooksys.QuizAPI.controllers;

import com.cooksys.QuizAPI.model.request.AnswerRequestDto;
import com.cooksys.QuizAPI.model.response.AnswerResponseDto;
import com.cooksys.QuizAPI.services.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("answer")
@AllArgsConstructor
public class AnswerController {
    private AnswerService answerService;
    @GetMapping
    public List<AnswerResponseDto> getAllAnswers(){
        return answerService.getAllAnswers();


    }
    @PostMapping
    public AnswerResponseDto createAnswer(@RequestBody AnswerRequestDto answerRequestDto){
        return answerService.createAnswer(answerRequestDto);
    }
}
