package edu.murat.quiz.controller;

import edu.murat.quiz.dto.OptionDto;
import edu.murat.quiz.dto.QuestionDto;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuestionController {

    private final AtomicLong sequence = new AtomicLong(3);

    private final static List<QuestionDto> allQuestions = new ArrayList<>(List.of(
        new QuestionDto(
                1L,
                "What's 2 + 2?",
                List.of(
                        new OptionDto("4", true),
                        new OptionDto("3", false)
                )
        ),
        new QuestionDto(
                2L,
                "What's 1 + 1?",
                List.of(
                        new OptionDto("2", true),
                        new OptionDto("1", false)
                )
        ),
        new QuestionDto(
                3L,
                "Who let the dogs out?",
                List.of(
                        new OptionDto("who #3 times", true),
                        new OptionDto("who #4 times", false)
                )
        )
    ));

    @GetMapping("/question")
    public List<QuestionDto> getAll() {
        return allQuestions;
    }
    @PostMapping("/question")
    public QuestionDto create(@Valid @RequestBody QuestionDto newQuestion) {
        newQuestion.setId(sequence.incrementAndGet());
        allQuestions.add(newQuestion);
        return newQuestion;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        allQuestions.removeIf(question -> question.getId().equals(id));
    }

    @PatchMapping("/{id}/question")
    public QuestionDto patchQuestion(@PathVariable long id, @Valid @RequestBody QuestionDto newQuestion) {
        QuestionDto patchQuestion = allQuestions.stream().filter(question -> question.getId().equals(id)).findFirst().get();
        String[] cases = {"question", "options"};
        for (String field : cases) {
            if (field.equals("question") && newQuestion.getQuestion() != null) {
                patchQuestion.setQuestion(newQuestion.getQuestion());
            } else if (field.equals("options") && newQuestion.getOptions() != null) {
                patchQuestion.setOptions(newQuestion.getOptions());
            }
        }
        return patchQuestion;
    }
    @PutMapping("/{id}")
    public QuestionDto update(@PathVariable long id, @Valid  @RequestBody QuestionDto updatedQuestion) throws ClassNotFoundException {
        QuestionDto existingQuestion = allQuestions.stream().filter(question -> question.getId().equals(id)).findFirst().orElseThrow(ClassNotFoundException::new);
        existingQuestion.setQuestion(updatedQuestion.getQuestion());
        existingQuestion.setOptions(updatedQuestion.getOptions());
        return updatedQuestion;
    }
}