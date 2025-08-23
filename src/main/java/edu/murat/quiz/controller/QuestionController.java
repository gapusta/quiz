package edu.murat.quiz.controller;

import edu.murat.quiz.dto.OptionDto;
import edu.murat.quiz.dto.QuestionDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    private final static List<QuestionDto> allQuestions = List.of(
        new QuestionDto(
                "What's 2 + 2?",
                List.of(
                        new OptionDto("4", true),
                        new OptionDto("3", false)
                )
        ),
        new QuestionDto(
                "What's 1 + 1?",
                List.of(
                        new OptionDto("2", true),
                        new OptionDto("1", false)
                )
        ),
        new QuestionDto(
                "Who let the dogs out?",
                List.of(
                        new OptionDto("who #3 times", true),
                        new OptionDto("who #4 times", false)
                )
        )
    );

    @GetMapping("/question")
    public List<QuestionDto> getAll() {
        return allQuestions;
    }
}
