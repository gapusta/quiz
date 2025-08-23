package edu.murat.quiz.dto;

import org.springframework.stereotype.Component;

import java.util.List;

public class QuestionDto {
    private String question;
    private List<OptionDto> options;

    public QuestionDto(String question, List<OptionDto> options) {
        this.question = question;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public List<OptionDto> getOptions() {
        return options;
    }
}
