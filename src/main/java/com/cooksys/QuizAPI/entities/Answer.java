package com.cooksys.QuizAPI.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Answer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String text_field;

    @ManyToOne
    @JoinColumn
    private Question question;



//    public Answer() {
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
//    public Question getQuestion() {
//        return question;
//    }
//
//    public Answer(Long id, String text_field, Question question) {
//        this.id = id;
//        this.text_field = text_field;
//        this.question = question;
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
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
}
