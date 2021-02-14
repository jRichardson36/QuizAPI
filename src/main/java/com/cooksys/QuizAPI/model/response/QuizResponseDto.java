package com.cooksys.QuizAPI.model.response;

import com.cooksys.QuizAPI.entities.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuizResponseDto {
    private String name;
    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;


}
