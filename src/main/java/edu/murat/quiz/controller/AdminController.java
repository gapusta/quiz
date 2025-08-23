package edu.murat.quiz.controller;

import edu.murat.quiz.models.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private static List<Question> questions = new ArrayList<>();

    @GetMapping("/questions")
    public List<Question> getAllQuestions(){
        return questions;
    }
}
