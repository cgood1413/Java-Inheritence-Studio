package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz myQuiz = new Quiz(new ArrayList<Question>());

        String prompt1 = "What is 1 + 1?";
        ArrayList<String> possible1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<String> answers1 = new ArrayList<>(Arrays.asList("2"));
        String prompt2 = "2 + 3 = 6?";
        ArrayList<String> possible2 = new ArrayList<>(Arrays.asList("true", "false"));
        ArrayList<String> answers2 = new ArrayList<>(Arrays.asList("false"));
        String prompt3 = "x? = 10";
        ArrayList<String> possible3 = new ArrayList<>(Arrays.asList("A) 5 + 5", "B) 7 + 3", "C) 2 + 4"));
        ArrayList<String> answers3 = new ArrayList<>(Arrays.asList("A", "B"));

        MultipleChoice question1 = new MultipleChoice(prompt1, answers1, possible1);
        TrueFalse question2 = new TrueFalse(prompt2, answers2, possible2);
        Checkbox question3 = new Checkbox(prompt3, answers3, possible3);

        myQuiz.addQuestion(question1);
        myQuiz.addQuestion(question2);
        myQuiz.addQuestion(question3);

        myQuiz.runQuiz();
        myQuiz.gradeQuiz();

    }
}
