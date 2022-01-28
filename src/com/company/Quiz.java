package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {

    private double grade;
    private ArrayList<Question> questions;

    public Quiz(ArrayList<Question> questions){
        this.questions = questions;
        this.grade = 0;
    }

    public double getGrade(){
        return this.grade;
    }

    public ArrayList<Question> getQuestions(){
        return this.questions;
    }

//    public void setGrade(double grade){
//        this.grade = grade;
//    }
//
    public void addQuestion(Question newQuestion){
        this.getQuestions().add(newQuestion);
    }

    public void runQuiz(){
        for(Question question : this.getQuestions()){
            question.printQuestion();
            question.addResponse();
            boolean test = question.checkAnswer();
            grade += question.checkAnswer() ? 1 : 0;
            String isCorrect = question.checkAnswer() ? "Correct!" : "Incorrect";
            System.out.println(isCorrect + "\n");
        }
    }

    public void gradeQuiz(){
        System.out.println("Score: " + this.getGrade() + "/" + this.getQuestions().size());
    }
}