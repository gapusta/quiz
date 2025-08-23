package edu.murat.quiz.services;
import ch.qos.logback.core.util.COWArrayList;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class QuestionService {
    private List<Question> questions = new COWArrayList<>();
}
