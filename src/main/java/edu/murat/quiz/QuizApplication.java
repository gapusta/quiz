package edu.murat.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {

    public static void main(String[] args) {
//        SpringApplication.run(QuizApplication.class, args);
        var container = SpringApplication.run(QuizApplication.class, args);

        for (var x : container.getBeanDefinitionNames()) {
            System.out.println(x);
        }
    }

}
