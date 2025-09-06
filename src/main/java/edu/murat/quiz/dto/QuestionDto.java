package edu.murat.quiz.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;


import java.util.List;

public class QuestionDto {
    private Long id;

    @NotEmpty(message = "question should not be empty")
    @NotBlank
    private String question;
    @Size(min=2, message = "question should contain at lest 2 options")
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

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<OptionDto> getOptions() {
        return options;
    }

    public void setOptions(List<OptionDto> options) {
        this.options = options;
    }
}
