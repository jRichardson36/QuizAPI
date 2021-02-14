package com.cooksys.QuizAPI;

import com.cooksys.QuizAPI.repositories.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataBaseSeeder implements CommandLineRunner {
    private QuizRepository quizRepository;


    @Override
    public void run(String... args) throws Exception {

    }
}
