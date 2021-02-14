package com.cooksys.QuizAPI.model.response;

import com.cooksys.QuizAPI.entities.Answer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResponseDto {
    private String text_field;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

}
