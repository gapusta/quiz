package edu.murat.quiz.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class QuestionService {
    private AtomicLong seq = new AtomicLong(0);

}
