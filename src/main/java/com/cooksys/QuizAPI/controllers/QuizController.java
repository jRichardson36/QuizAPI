package com.cooksys.QuizAPI.controllers;

import com.cooksys.QuizAPI.model.request.QuizRequestDto;
import com.cooksys.QuizAPI.model.response.QuizResponseDto;
import com.cooksys.QuizAPI.services.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
@AllArgsConstructor
public class QuizController {

    private QuizService quizService;

    @GetMapping
    public List<QuizResponseDto> getAllQuizes(){
        return quizService.getAllQuizes();
    }

    @PostMapping
    public QuizResponseDto createQuiz(@RequestBody QuizRequestDto quizRequestDto){
        return quizService.createQuiz(quizRequestDto);
    }


}
