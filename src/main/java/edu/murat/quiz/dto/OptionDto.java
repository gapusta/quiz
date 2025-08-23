package edu.murat.quiz.dto;

public class OptionDto {
    private String option;
    private Boolean isCorrect;

    public OptionDto(String option, Boolean isCorrect) {
        this.option = option;
        this.isCorrect = isCorrect;
    }

    public String getOption() {
        return option;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }
}
