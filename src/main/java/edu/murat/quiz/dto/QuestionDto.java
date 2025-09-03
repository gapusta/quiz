package edu.murat.quiz.dto;

import org.springframework.stereotype.Component;


import java.util.List;

public class QuestionDto {
    private Long id;
    private String question;
    private List<OptionDto> options;

    public QuestionDto(Long id, String question, List<OptionDto> options) {
        this.id = id;
        this.question = question;
        this.options = options;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getQuestion() {
        return question;
    }

    public List<OptionDto> getOptions() {
        return options;
    }
}
