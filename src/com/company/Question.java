package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {

    private String prompt;
    private ArrayList<String> correctAnswers;
    private ArrayList<String> possibleAnswers;
    private ArrayList<String> responses = new ArrayList<>();

    public Question(String prompt, ArrayList<String> correctAnswers, ArrayList<String> possibleAnswers){
        this.prompt = prompt;
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
    }

    public String getPrompt() {
        return prompt;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public ArrayList<String> getResponses() {
        return responses;
    }

    public void printQuestion(){
        System.out.println(this.getPrompt());
        for(String option : this.getPossibleAnswers()){
            System.out.println(option);
        }
    }

    public void addResponse(){
        Scanner input = new Scanner(System.in);
        this.getResponses().add(input.nextLine());
    }

    public boolean checkAnswer(){
        return (this.getCorrectAnswers().containsAll(this.getResponses()) && this.getResponses().size() != 0);
    }

}
