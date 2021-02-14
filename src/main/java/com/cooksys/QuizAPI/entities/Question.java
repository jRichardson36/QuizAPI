package com.cooksys.QuizAPI.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String text_field;

    @ManyToOne
    @JoinColumn
    private Quiz quiz;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

//    public Question() {
//    }
//
//    public Question(List<Answer> answers) {
//        this.answers = answers;
//    }
//
//    public List<Answer> getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(List<Answer> answers) {
//        this.answers = answers;
//    }
//
//    public Question(Long id, String text_field, Quiz quiz) {
//        this.id = id;
//        this.text_field = text_field;
//        this.quiz = quiz;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getText_field() {
//        return text_field;
//    }
//
//    public Quiz getQuiz() {
//        return quiz;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setText_field(String text_field) {
//        this.text_field = text_field;
//    }
//
//    public void setQuiz(Quiz quiz) {
//        this.quiz = quiz;
//    }
}
